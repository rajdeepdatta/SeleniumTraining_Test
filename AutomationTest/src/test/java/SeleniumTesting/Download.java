package SeleniumTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Download {

	public static void main(String[] args) {
		 String baseUrl = "http://demo.guru99.com/test/yahoo.html";
	        System.setProperty("webdriver.chrome.driver","C:\\Users\\edatraj\\Desktop\\chromedriver.exe"); //Setting path of Chrome driver
			WebDriver driver=new ChromeDriver();//Invoke browser
	        driver.get(baseUrl);
	        WebElement downloadButton = driver.findElement(By
	                .id("messenger-download"));
	                String sourceLocation = downloadButton.getAttribute("href");
	                String wget_command = "cmd /c C:\\Wget\\wget.exe -P D: --no-check-certificate " + sourceLocation;

	               System.out.println(sourceLocation);
	                driver.close();
	                }
	                
	        }

	


