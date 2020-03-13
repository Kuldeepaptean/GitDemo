package TestNGPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DynamicXpath {
  @Test
  public void Dynamicxpath()
  {
	  System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();  
		driver.get("http://www.half.ebay.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@class='gh-tb ui-autocomplete-input']")).sendKeys("mobile");
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		driver.close();
  }
}
