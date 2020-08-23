package SeleniumTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class FirefoxTest {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.gecko.driver","C:\\Users\\edatraj\\Desktop\\geckodriver.exe"); //Setting path of Firefox driver
		//WebDriver driver= new FirefoxDriver();//Invoke browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\edatraj\\Desktop\\Automation Training_Selenium_CoreJava\\chromedriver.exe"); //Setting path of Chrome driver
		WebDriver driver=new ChromeDriver();//Invoke browser
		driver.manage().window().maximize();
		
		/*driver.get("https://www.google.com/");//Asking to open a URL
		Thread.sleep(10000);
		driver.findElement(By.name("q")).sendKeys("facebook");
		driver.findElement(By.name("btnK")).submit();
		driver.navigate().back(); // to go back
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Instagram");
		driver.findElement(By.xpath("//*[@title='Search' or @type ='text' ]")).submit(); //
*/		driver.navigate().to("https:/facebook.com"); // Open Url
		driver.findElement(By.xpath("//*[@id='u_0_2']")).click();// Click on Create Button
		Thread.sleep(10000);//wait
		List<WebElement> eleList=driver.findElements(By.id("reg_box")); //
		System.out.println(eleList.size());
		
		eleList.get(0).findElement(By.name("firstname")).sendKeys("Testing");
		eleList.get(0).findElement(By.name("reg_email__")).sendKeys("9836586161");
		eleList.get(0).findElement(By.name("reg_passwd__")).sendKeys("Test1234");
		
		Thread.sleep(10000);
		//driver.quit();
	}

}
 