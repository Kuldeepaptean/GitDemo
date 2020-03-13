package TestNGPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Test;

public class HtmlUnitDriverConcept {
  @Test
  public void HtmlDriver() {

	  System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (2)\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver(); 
	  
	  //advantage
	  //1.testing is happening behind the scene-no browser involved
	 // 2.execution is very fast
	 //not available in selenium 3.0
	  WebDriver driver = new HtmlUnitDriver();
	  
		driver.get("http://www.freecrm.com/");
		
		driver.manage().window().maximize();
  }
}
