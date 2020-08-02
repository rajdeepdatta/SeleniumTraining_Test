package SeleniumTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Parallel {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.gecko.driver","C:\\Users\\edatraj\\Desktop\\geckodriver.exe"); //Setting path of Firefox driver
		    //First session of WebDriver
		    WebDriver driver = new FirefoxDriver();
		    //Goto guru99 site
		    driver.get("http://demo.guru99.com/V4/");
		    
		    //Second session of WebDriver
		    WebDriver driver2 = new FirefoxDriver();
		    //Goto guru99 site
		    driver2.get("http://demo.guru99.com/V4/");
		}
		

	}


