package SeleniumTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragnDrop {

	public static void main(String[] args) throws InterruptedException  {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\edatraj\\Desktop\\Automation Training_Selenium_CoreJava\\chromedriver.exe"); //Setting path of Chrome driver
		WebDriver driver=new ChromeDriver();//Invoke browser

        // Launch Website  
            driver.navigate().to("https://www.testandquiz.com/selenium/testing.html");   
              
        //WebElement on which drag and drop operation needs to be performed  
            WebElement from = driver.findElement(By.id("sourceImage"));  
  
        //WebElement to which the above object is dropped  
            WebElement to = driver.findElement(By.id("targetDiv"));  
               
        //Creating object of Actions class to build composite actions  
            Actions act = new Actions(driver);  
               
        //Performing the drag and drop action  
            act.dragAndDrop(from,to).build().perform();   
            
           Thread.sleep(4000);
           
           driver.navigate().refresh();
           act.dragAndDrop(from,to).build().perform();
            driver.quit();
    }  
  
}
