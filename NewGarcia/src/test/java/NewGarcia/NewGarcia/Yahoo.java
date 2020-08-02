package NewGarcia.NewGarcia;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Yahoo {

	public static void main(String[] args) {
		//Setup
		
		//chrome
		//DriverManagerType chrome = DriverManagerType.CHROME;
		//WebDriverManager.getInstance(CHROME).setup();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//firefox
		//WebDriverManager.firefoxdriver().setup();
		//WebDriverManager.firefoxdriver().browserVersion("77").setup();
		//WebDriver driver = new FirefoxDriver();
		
		//Edge
	//	WebDriverManager.edgedriver().setup();
		//WebDriver driver = new EdgeDriver();
		
		//Main code to run
		driver.get("https://www.yahoo.com");//Yahoo
		driver.manage().window().maximize();//maximize
		System.out.println(driver.getTitle()); // Print of title
		driver.quit();
		
		

	}

}
