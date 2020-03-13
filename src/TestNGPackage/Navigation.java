package TestNGPackage;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.internal.Utils;

public class Navigation {
  @Test
  public void BackAnedFwdSimulation() throws IOException{

	  System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();  
		driver.get("http://www.half.ebay.com/");
		driver.manage().window().maximize();
		File Src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
  }
		public  static void Explixitwait(WebDriver driver, WebElement locator,int timeout)
		{
			 new  WebDriverWait(driver, timeout).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(locator));
			 locator.click();
		}
		
  }

