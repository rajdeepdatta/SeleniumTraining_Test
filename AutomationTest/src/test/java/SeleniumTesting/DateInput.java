package SeleniumTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DateInput {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\edatraj\\Desktop\\chromedriver_win32 (7)\\chromedriver.exe");	
        
        WebDriver driver = new ChromeDriver();
		

        driver.get("http://demo.guru99.com/test/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //Find the date time picker control

        WebElement dateBox = driver.findElement(By.xpath("//form//input[@name='bdaytime']"));

        //Fill date as mm/dd/yyyy as 09/25/2013
        
        dateBox.sendKeys("10201989");

        //Press tab to shift focus to time field
        
        dateBox.sendKeys(Keys.TAB);

        //Fill time as 22:45 PM
        
        dateBox.sendKeys("1045PM");
        
       // driver.close();
      //  driver.quit();
	}

}
