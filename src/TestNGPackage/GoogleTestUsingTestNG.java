package TestNGPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTestUsingTestNG {

WebDriver driver;

     @BeforeMethod
     public void SetUp()
     {
    	 System.setProperty("webdriver.chrome.driver","C:\\CD\\chromedriver\\chromedriver.exe");
    	 driver= new ChromeDriver();
    	 driver.get("https://www.google.co.in/");
    	 driver.manage().window().maximize();
    	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    	
     }
     @Test()
     public void GoogleTitleTest()
     {
    	 String Title=driver.getTitle();
    	 System.out.println(Title);
     }
     @Test
     public void googleLogoTest()
     {
    	Boolean b= driver.findElement(By.xpath("//*[@id=\"logo-non-white\"]")).isDisplayed();  	 
     }
     
     @Test 
     public void maillinktest()
     {
    	boolean b1= driver.findElement(By.xpath("//*[@id=\"gb\"]/div[2]/div[3]/div[1]/div/div[1]/a")).isDisplayed();
    	 
     }
     
     @AfterMethod
     public void teardown()
     {
    	 driver.close();

  }
}
