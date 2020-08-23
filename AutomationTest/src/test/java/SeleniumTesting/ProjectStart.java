package SeleniumTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProjectStart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\edatraj\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe"); //Setting path of Chrome driver
		WebDriver driver=new ChromeDriver();//Invoke browser
		driver.get("http://www.facebook.com/");//Asking to open a URL
		driver.manage().window().maximize();//asking to maximize the page
		String actualTitle = "";//taking variable
		//String expectedTitle = "Welcome";// variable
		String xz ="";
		actualTitle = driver.getTitle();// Bring title of page
		xz= driver.getCurrentUrl();// Bring URL
		System.out.println(actualTitle);
		System.out.println(xz);
		driver.findElement(By.name("websubmit")).click();
		driver.findElement(By.cssSelector("a[title=\"Go to Facebook home\"]")).click();// click on image CSS
		driver.findElement(By.className("_8esh")).click();
		
		//verify that we are now back on Facebook's homepage		
		if (driver.getTitle().equals("Facebook - log in or sign up")) {							
        System.out.println("We are back at Facebook's homepage");					
    } else {			
        System.out.println("We are NOT in Facebook's homepage");					
    }		
			
		driver.findElement(By.name("firstname")).sendKeys("RAHUL");
		driver.findElement(By.name("lastname")).sendKeys("SINGH");
		driver.findElement(By.name("reg_email__")).sendKeys("9830098300");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Test@1234");
		
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id=\"day\"]/option[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"month\"]/option[6]")).click();
		driver.findElement(By.xpath("//*[@id=\"year\"]/option[20]")).click();
		//driver.findElement(By.xpath("*[@id='year']/option[18]")).click();
		Thread.sleep(10000);
		driver.findElement(By.id("u_0_7")).click();
		driver.findElement(By.name("websubmit")).click();
		
	//driver.findElement(By.id("email")).sendKeys("abc@xyz.com");//enter Uid
		//driver.findElement(By.id("pass")).sendKeys("Test@123");//enter pwd
		
		//boolean obj;
		//obj=driver.findElement(By.id("u_0_b")).isDisplayed();
		//driver.findElement(By.id("u_0_b")).click();//click login
		
		//driver.findElement(By.id("loginbutton")).isDisplayed(); 
		//System.out.println(obj);
		//driver.close();	
	}

}
