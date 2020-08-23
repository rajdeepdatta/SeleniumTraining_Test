package SeleniumTesting;

import javax.swing.SingleSelectionModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestTitle {

	public static void main(String[] args) throws InterruptedException {
		//OpenGoogle and seacrh
		System.setProperty("webdriver.chrome.driver","C:\\Users\\edatraj\\Desktop\\chromedriver.exe"); //Setting path of Chrome driver
		WebDriver driver=new ChromeDriver();//Invoke browser
		driver.get("http://www.practiceselenium.com/");//Asking to open a URL
		driver.manage().window().maximize();//asking to maximize the page
		String actualTitle = "";//taking variable
		String expectedTitle = "Welcome";// variable
		String xz ="";
		actualTitle = driver.getTitle();// Bring title of page
		xz= driver.getCurrentUrl();// Bring URL
		System.out.println(actualTitle);
		System.out.println(xz);
		
		
		Thread.sleep(1000);//wait
		
		if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
		driver.quit();// quit broswer
	}

}

}




