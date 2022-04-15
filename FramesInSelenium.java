package Sample;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesInSelenium {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\686398\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement frame = driver.findElement(By.id("courses-iframe"));
		driver.switchTo().frame(frame);
		Thread.sleep(2000);
		
		js.executeScript("arguments[0].scrollIntoView(true);",driver.findElement(By.xpath("//a[text()='Register']")));
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		
		
	}

}
