package FirstTestNG;

import org.testng.annotations.Test;
import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class ParallelTestCase {
	   @Test   
	    public void executSessionOne() throws InterruptedException{
	            //First session of WebDriver
	        System.setProperty("webdriver.chrome.driver","C:\\Users\\edatraj\\Desktop\\Automation Training_Selenium_CoreJava\\chromedriver.exe");
	            WebDriver driver = new ChromeDriver();
	            //Goto guru99 site
	            driver.get("http://demo.guru99.com/V4/");
	            //find user name text box and fill it
	            driver.findElement(By.name("uid")).sendKeys("Driver 1");
	            Thread.sleep(4000);
	          //  driver.close();
	   }
 
@Test   
  public void executeSessionTwo() throws InterruptedException{
      //Second session of WebDriver
  System.setProperty("webdriver.chrome.driver","C:\\Users\\edatraj\\Desktop\\Automation Training_Selenium_CoreJava\\chromedriver.exe");
  WebDriver driver = new ChromeDriver();
      //Goto guru99 site
  driver.get("http://demo.guru99.com/V4/");
  //find user name text box and fill it
  driver.findElement(By.name("uid")).sendKeys("Driver 2");
  Thread.sleep(4000);
  //driver.close();
  }
  
@Test  
  public void executSessionThree() throws InterruptedException{
      //Third session of WebDriver
	System.setProperty("webdriver.chrome.driver","C:\\Users\\edatraj\\Desktop\\Automation Training_Selenium_CoreJava\\chromedriver.exe");
  WebDriver driver = new ChromeDriver();
      //Goto guru99 site
  driver.get("http://demo.guru99.com/V4/");
  //find user name text box and fill it
  driver.findElement(By.name("uid")).sendKeys("Driver 3");
  Thread.sleep(4000);
 // driver.close();
  
}

    
}

  
