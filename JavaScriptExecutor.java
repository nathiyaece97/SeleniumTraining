package Sample;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor {

	static WebDriver driver;
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\686398\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		// ************* Click operation *************************
		
		WebElement radiobtn = driver.findElement(By.name("radioButton"));			
		js.executeScript("arguments[0].click();",radiobtn);
		
		// ***************Handling textbox ****************
		
		String country="India";
		WebElement countrytextbox = driver.findElement(By.id("autocomplete"));
		//js.executeScript("arguments[0].value='India';", countrytextbox);
		js.executeScript("arguments[0].value='"+country+"';", countrytextbox);
		
		// *************  Alert creation **********************
	//	js.executeScript("alert('Completed Successfully')");
		
		
		//************************  Scroll up/down **************************
		
		//js.executeScript("window.scrollBy(0,500)"); //scroll down to specific pixel
		
		js.executeScript("window.scrollBy(0, document.body.scrollHeight)");  //Scroll to the bottom
		Thread.sleep(2000);
		//js.executeScript("window.scrollTo(0,0)"); // scroll to Top
		
		js.executeScript("window.scrollTo(0,500)");
		
		
		//******************** Scroll to specific webelement *****************************
		
		WebElement mousehover=driver.findElement(By.id("mousehover"));
		js.executeScript("arguments[0].scrollIntoView(true);",mousehover);
		Thread.sleep(3000);
		
		
		
		
		
		
		
		
		
		
	}

}
