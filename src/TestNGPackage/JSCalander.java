package TestNGPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class JSCalander {
	 ;
  @Test
  public void JsCalander() {
	  System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (2)\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();  
		driver.get("https://www.spicejet.com/");
		WebElement datejs= driver.findElement(By.xpath("//*[@id='ctl00_mainContent_view_date1']"));
		String date="20-10";
		SelectDateByJS(driver,datejs,date);
		
  }
  
  public static void SelectDateByJS(WebDriver driver,WebElement ele,String date)
  {
	  
	   JavascriptExecutor js= ((JavascriptExecutor)driver);
	  js.executeScript("arguments[0].setAttribute('value','"+date+"');", ele);
	  
  }
}
