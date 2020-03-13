package TestNGPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class dyamicdt {
  @Test
  public void dynamicdatatable() {
	  System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();  
		driver.get("http://demo.automationtesting.in/WebTable.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		//String Text=driver.findElement(By.xpath("//input[@value='7708712514']")).getText();
		//driver.close();
		//System.out.println(Text);
		Actions act = new Actions(driver);
					    					    		  ;
			act.doubleClick(driver.findElement(By.xpath("//*[contains(@id,'1-uiGrid-000B-cell')]/user-click-select/div[1]/button/i")))
			.build().perform();
		
		
	  
	  
	  
			
			
			
			
			
			
			
			
  }
}