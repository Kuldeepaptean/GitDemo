package TestNGPackage;

import java.util.Iterator;
import java.util.Set;
import java.util.logging.Handler;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Popupwindow {
  @Test
  public void WindowHandles() {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();  
		driver.get("http://www.popuptest.com//");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[1]/font[1]/b/a")).click();
		Set<String> window=driver.getWindowHandles();
		Iterator<String> Itr = window.iterator();
		String Parentwindoid=Itr.next();
		System.out.println("parent window id is:"+ Parentwindoid);
		 String Childwindowid=Itr.next();
		 System.out.println("Child window id is:"+Childwindowid);
		 driver.switchTo().window(Childwindowid);
		 System.out.println("Child Window Popup"+driver.getTitle());
		 driver.close();
	  
  }
}
