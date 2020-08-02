package SeleniumTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Upload {

	public static void main(String[] args) throws Throwable {
        String baseUrl = "http://demo.guru99.com/test/upload/";
        System.setProperty("webdriver.chrome.driver","C:\\Users\\edatraj\\Desktop\\chromedriver.exe"); //Setting path of Chrome driver
		WebDriver driver=new ChromeDriver();//Invoke browser
        driver.get(baseUrl);
        
        WebElement uploadElement = driver.findElement(By.id("uploadfile_0"));
        Thread.sleep(3000);
        // enter the file path onto the file-selection input field
        uploadElement.sendKeys("C:\\Users\\edatraj\\Desktop\\Test.html.txt");
        //uploadElement.sendKeys("C:\\Users\\edatraj\\Desktop\\Upload Testcase.txt");

        // check the "I accept the terms of service" check box
        driver.findElement(By.id("terms")).click();

        // click the "UploadFile" button
        driver.findElement(By.name("send")).click();
        driver.quit();

	}

}
