package SeleniumTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Mouse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String baseUrl = "http://demo.guru99.com/test/yahoo.html";
	        System.setProperty("webdriver.chrome.driver","C:\\Users\\edatraj\\Desktop\\chromedriver.exe"); //Setting path of Chrome driver
			WebDriver driver=new ChromeDriver();//Invoke browser
		
		driver.get(baseUrl);           
        WebElement link_Home = driver.findElement(By.linkText("Home"));
        WebElement td_Home = driver
                .findElement(By
                .xpath("//html/body/div"
                + "/table/tbody/tr/td"
                + "/table/tbody/tr/td"
                + "/table/tbody/tr/td"
                + "/table/tbody/tr"));    
         
        Actions builder = new Actions(driver);
        Action mouseOverHome = builder
                .moveToElement(link_Home)
                .build();
         
        String bgColor = td_Home.getCssValue("background-color");
        System.out.println("Before hover: " + bgColor);        
        mouseOverHome.perform();        
        bgColor = td_Home.getCssValue("background-color");
        System.out.println("After hover: " + bgColor);
        driver.close();
	}

}
