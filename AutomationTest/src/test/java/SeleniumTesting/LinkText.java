package SeleniumTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText {

	public static void main(String[] args) throws InterruptedException {
		 String baseUrl = "http://demo.guru99.com/test/link.html";					
	        System.setProperty("webdriver.chrome.driver","C:\\Users\\edatraj\\Desktop\\chromedriver.exe");					
	        WebDriver driver = new ChromeDriver();					
	        		
	        driver.get(baseUrl);					
	        driver.findElement(By.linkText("click here")).click();					
	        System.out.println("Title of the page is :  " + driver.getTitle());	
	      Thread.sleep(4000);
	        driver.quit();			
	    }		

	}			