package SeleniumTesting;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {

	public static void main(String[] args) throws InterruptedException {
		String baseUrl = "http://demo.guru99.com/test/delete_customer.php";
        System.setProperty("webdriver.chrome.driver","C:\\Users\\edatraj\\Desktop\\chromedriver.exe"); //Setting path of Chrome driver
		WebDriver driver=new ChromeDriver();//Invoke browser
	
	driver.get(baseUrl);  

		
		 // Alert Message handling
		
       // driver.get("http://demo.guru99.com/test/delete_customer.php");			
                            		
     	      	
        driver.findElement(By.name("cusid")).sendKeys("53920");					
        driver.findElement(By.name("submit")).submit();		
        		
        // Switching to Alert        
        Alert alert = driver.switchTo().alert();		
        		
        // Capturing alert message.    
        String alertMessage= driver.switchTo().alert().getText();		
        		
        // Displaying alert message		
        System.out.println(alertMessage);	
        Thread.sleep(5000);
        		
        // Accepting alert		
       // alert.accept();		
        Thread.sleep(5000);
        // Dismiss alert
        alert.dismiss();
        Thread.sleep(2000);
        driver.close();
	}

}
