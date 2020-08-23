package SeleniumTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToolTipCase2 {

	public static void main(String[] args) throws InterruptedException {
		String baseUrl = "http://demo.guru99.com/test/tooltip.html";					
		System.setProperty("webdriver.chrome.driver","C:\\Users\\edatraj\\Desktop\\chromedriver.exe");	
        
        WebDriver driver = new ChromeDriver();					
        String expectedTooltip = "What's new in 3.2";					
        driver.get(baseUrl);					
        driver.manage().window().maximize();		
        WebElement download = driver.findElement(By.xpath(".//*[@id='download_now']"));							
        Actions builder = new Actions (driver);						
        Thread.sleep(4000);
        builder.clickAndHold().moveToElement(download);		
        builder.moveToElement(download).build().perform(); 	
        Thread.sleep(4000);
        WebElement toolTipElement = driver.findElement(By.xpath(".//*[@class='box']/div/a"));							
        String actualTooltip = toolTipElement.getText();			
        Thread.sleep(4000); //wrong avoid!!
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
        System.out.println("The Tool Tip now is :  "+actualTooltip);							
        if(actualTooltip.equals(expectedTooltip)) {							
            System.out.println("Test Case Passed");					
        }		
        driver.close();

	}

}
