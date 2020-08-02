package FirstTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


@Test
public class AnnotationTest {

  public String baseUrl = "http://demo.guru99.com/test/newtours/";
  String driverPath = "C:\\Users\\edatraj\\Desktop\\geckodriver.exe";
  public WebDriver driver; 
  public String expected = null;
  public String actual = null;
      @BeforeTest
    public void launchBrowser() {
        System.out.println("launching firefox browser"); 
        System.setProperty("webdriver.gecko.driver", driverPath);
        driver= new FirefoxDriver();
        driver.get(baseUrl);
    }
    
    @BeforeMethod
    public void verifyHomepageTitle() {
        String expectedTitle = "Welcome: Mercury Tours";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
        System.out.println(actualTitle);
    }
        @Test(priority = 0)
    public void register(){
        driver.findElement(By.linkText("REGISTER")).click() ;
        expected = "Register: Mercury Tours";
        actual = driver.getTitle();
        Assert.assertEquals(actual, expected);
        System.out.println(actual);
    }
        @Test(priority = 1)
    public void support() {
          driver.findElement(By.linkText("SUPPORT")).click() ;
          expected = "Under Construction: Mercury Tours";
          actual = driver.getTitle();
          Assert.assertEquals(actual, expected);
          System.out.println(actual);
    }
    @AfterMethod
    public void goBackToHomepage ( ) {
          driver.findElement(By.linkText("Home")).click() ;
    }
     
    @AfterTest
    public void terminateBrowser(){
        driver.close();
        
    }
}
