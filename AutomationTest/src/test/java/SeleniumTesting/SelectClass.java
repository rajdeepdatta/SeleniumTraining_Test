package SeleniumTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\edatraj\\Desktop\\chromedriver.exe");	
        
        WebDriver driver = new ChromeDriver();	
	    String baseURL = "http://demo.guru99.com/test/newtours/register.php";
	    
		driver.get(baseURL);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
		Select drpCountry = new Select(driver.findElement(By.name("country")));
		drpCountry.selectByVisibleText("FRANCE");
		Thread.sleep(3000);
		
		//Selecting Items in a Multiple SELECT elements
		driver.get("http://jsbin.com/osebed/2");
		
		Select fruits = new Select(driver.findElement(By.id("fruits")));
		fruits.selectByVisibleText("Apple");
		
		fruits.selectByIndex(2);
		Thread.sleep(3000);
		driver.close();
		driver.quit();
 }


	}


