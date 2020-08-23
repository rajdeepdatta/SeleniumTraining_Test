package SeleniumTesting;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\edatraj\\Desktop\\chromedriver.exe");
		 driver= new ChromeDriver();

	//Launch the Application Under Test (AUT)
	driver.get("http://demo.guru99.com/test/simple_context_menu.html");
	driver.manage().window().maximize();

	driver.get("http://demo.guru99.com/test/simple_context_menu.html");
	driver.manage().window().maximize();
	//Double click the button to launch an Alertbox
	Actions action = new Actions(driver);
	WebElement link =driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
	action.doubleClick(link).perform();
	//Switch to the alert box and click on OK button
	Alert alert = driver.switchTo().alert();
	System.out.println("Alert Text\n" +alert.getText());
	alert.accept();
	//Closing the driver instance
	driver.quit();

	}
	}