package FacebookTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook_new {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\edatraj\\Desktop\\Automation Training_Selenium_CoreJava\\chromedriver.exe"); //Setting path of Chrome driver
		WebDriver driver=new ChromeDriver();//Invoke browser
		driver.manage().window().maximize();
		
		
		driver.navigate().to("https:/facebook.com"); // Open Url
		
		driver.findElement(By.id("u_0_2")).click(); // create new
		
		Thread.sleep(10000);//wait
		List<WebElement> eleList=driver.findElements(By.id("reg_box"));
		
		System.out.println(eleList.size());
		
		eleList.get(0).findElement(By.id("u_1_b")).sendKeys("RAJ");
		//eleList.get(0).findElement(By.xpath ("//input[@class='inputtext _58mg _5dba _2ph-'])")).sendKeys("RAJ");
		eleList.get(0).findElement(By.id("u_1_d")).sendKeys("DEEP");
	}
	

}
