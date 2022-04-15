package Sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PickCalendar {
	
	static WebDriver driver;
	
	public static void datePicker(String dayuserinput,String reqmon) {
		String month = driver.findElement(By.xpath("(//div[@class='text-center'])[1]/button")).getText();
		
		//split
		String mon = month.split(" ")[0];
		
		String monthcal[]= {"January", "February","March","April","May","June","July","August","September","October","November","December"};
		
		if(month.contains(reqmon)) {
			driver.findElement(By.xpath("((//div[@class='text-center'])[1]//table/tbody//span[text()='"+dayuserinput+"'])[1]")).click();
		}
		else {
			int currentindex=0;
			int reqmonth =0;
			for(int i=0;i<monthcal.length;i++) {
				if(month.contains(monthcal[i])) {
					currentindex=i+1;
				}
				if(monthcal[i].contains(reqmon)) {
					reqmonth =i+1;
					
				}
			}
			
			WebElement nextbtn = driver.findElement(By.xpath("//button[@data-testid='calendar-button-next']"));
			for(int i=0;i<(reqmonth-currentindex);i++) {
				nextbtn.click();
			}
			driver.findElement(By.xpath("((//div[@class='text-center'])[1]//table/tbody//span[text()='"+dayuserinput+"'])[1]")).click();
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\686398\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("https://www.trivago.in/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//span[text()='Check in']")).click();
		String dayuserinput="13";
		String month="June";
		datePicker(dayuserinput,month);
		
		
	
		
		
		
	}

}
