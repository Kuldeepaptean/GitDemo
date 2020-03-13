package TestNGPackage;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FindElementsTest {
  @Test
  public void WIndowsHandle()  throws InterruptedException{
	  
	 System.setProperty("webdriver.chrome.driver","C:\\CD\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();  
		driver.get("https://www.toolsqa.com/automation-practice-switch-windows/");
		driver.manage().window().maximize();
		String ParentWindow=driver.getWindowHandle();
		System.out.println(ParentWindow);
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> I1 = windows.iterator();
		While(I1.hasNext());
		{
			String Child_window = I1.next();
			if(!ParentWindow.equals(Child_window))
			{
			driver.switchTo().window(Child_window);		 
			System.out.println(driver.switchTo().window(Child_window).getTitle());
			 
			driver.close();
			}
			 
			}
			// once all pop up closed now switch to parent window
			driver.switchTo().window(ParentWindow);
			 
			}

private void While(boolean hasNext) {
	// TODO Auto-generated method stub
	
}

private void Actionclass(boolean hasNext) {
	
	
}
}
