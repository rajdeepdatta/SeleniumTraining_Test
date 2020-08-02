package SeleniumTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class FirefoxTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\edatraj\\Desktop\\geckodriver.exe"); //Setting path of Firefox driver
		WebDriver driver= new FirefoxDriver();//Invoke browser
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");//Asking to open a URL
		Thread.sleep(10000);
		driver.close();
	}

}
