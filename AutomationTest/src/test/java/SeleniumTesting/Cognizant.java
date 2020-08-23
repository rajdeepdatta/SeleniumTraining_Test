package SeleniumTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cognizant {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\edatraj\\Desktop\\chromedriver.exe"); //Setting path of Chrome driver
		WebDriver driver=new ChromeDriver();//Invoke browser
		//String actualTitle = "";
		//String expectedTitle = "Digital Solutions to Advance Your Business | Cognizant";
		driver.get("https://www.cognizant.com/");//Asking to open a URL
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("a[title=\"Careers\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div/section/div/section/div/form/div[2]/div/div[1]/input")).clear();
		//driver.findElement(By.name("phsKeywords")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div/section/div/section/div/form/div[2]/div/div[1]/input")).sendKeys("Automation");
		//
		driver.findElement(By.name("phsKeywords")).sendKeys("Automation");
		driver.findElement(By.xpath("//button[[@type, 'submit']")).click();
		driver.quit();
		
		
	}

}
