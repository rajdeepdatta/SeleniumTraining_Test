package SeleniumTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Parallel {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.gecko.driver","C:\\Users\\edatraj\\Desktop\\geckodriver.exe"); //Setting path of Firefox driver
		    //First session of WebDriver
		    WebDriver driver = new FirefoxDriver();
		    //Goto guru99 site
		    driver.get("http://facebook.com");
		    Thread.sleep(5000);
		  driver.close();
		    
		    //Second session of WebDriver
		    System.setProperty("webdriver.chrome.driver","C:\\Users\\edatraj\\Desktop\\chromedriver.exe");
		    WebDriver driver2 = new ChromeDriver();
		    //Goto guru99 site
		    driver2.get("http://amazon.com");
		    Thread.sleep(6000);
		   driver.close();
		 
		}
		

	}


