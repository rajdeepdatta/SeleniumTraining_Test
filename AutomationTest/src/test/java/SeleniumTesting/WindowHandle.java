/**
 * 
 */
package SeleniumTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author edatraj
 *
 */
public class WindowHandle {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\edatraj\\Desktop\\Automation Training_Selenium_CoreJava\\chromedriver.exe"); //Setting path of Chrome driver
		WebDriver driver=new ChromeDriver();//Invoke browser
	    driver.get("http://demo.guru99.com/test/guru99home/"); 
	       // navigates to the page consisting an iframe

	       driver.manage().window().maximize();
	       driver.switchTo().frame("a077aa5e"); //switching the frame by ID
	       System.out.println(driver.getWindowHandle());
	       System.out.println(driver.getPageSource());
	       System.out.println(driver.getWindowHandles());
			System.out.println("********We are switch to the iframe*******");
     		driver.findElement(By.xpath("html/body/a/img")).click();
  		    //Clicks the iframe
       
  			System.out.println("*********We are done***************");
  			
  			driver.close();
      }


	}


