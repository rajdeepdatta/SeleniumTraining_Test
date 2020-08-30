package FirstTestNG;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest {
	public String baseUrl = "http://demo.guru99.com/test/newtours/";
	public String baseUrl1 = "http://www.facebook.com";
    String driverPath = "C:\\Users\\edatraj\\Desktop\\geckodriver.exe";
    public WebDriver driver ; 
     
  @Test
  public void verifyHomepageTitle() {
       
      System.out.println("launching firefox browser"); 
      System.setProperty("webdriver.gecko.driver", driverPath);
      driver = new FirefoxDriver();
      driver.get(baseUrl);
      String expectedTitle = "Welcome: Mercury Tours";
      String actualTitle = driver.getTitle();
      AssertJUnit.assertEquals(actualTitle, expectedTitle);
      driver.close();
  }
  @Test
      public void verifyURL() {
    	  System.out.println("Verifying the URL");
    	  System.setProperty("webdriver.gecko.driver", driverPath);
          driver = new FirefoxDriver();
          driver.get(baseUrl1);
          String expectedURL = "https://www.facebook.com/";
          String actualURL = driver.getCurrentUrl();
          System.out.println(actualURL);
          AssertJUnit.assertEquals(actualURL,expectedURL);
          driver.close();
      }
      }
  

