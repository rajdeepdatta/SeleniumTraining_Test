package SeleniumTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\edatraj\\Desktop\\chromedriver.exe"); //Setting path of Chrome driver
		WebDriver driver=new ChromeDriver();//Invoke browser
		driver.get("http://www.youtube.com/");//Asking to open a URL
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='search']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='search']")).sendKeys("RAJDEEP DATTA VLOGS");
		//driver.findElement(By.xpath("//*[@id='search']")).sendKeys(enter);
		driver.findElement(By.xpath("//*[@id='search-icon-legacy']")).click();
		//driver.findElement(By.xpath("//*[@id="search"]"));
		WebElement textbox = driver.findElement(By.xpath("//*[@id='search']"));
		textbox.sendKeys("RAJDEEP DATTA VLOGS");
		textbox.sendKeys(Keys.RETURN);
	}

}
