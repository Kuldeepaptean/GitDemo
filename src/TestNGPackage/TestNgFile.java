package TestNGPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TestNgFile {

	@Test(priority=1)
	public void mousemovementconcept() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();  
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		Actions act= new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//*[@id=\"ctl00_HyperLinkLogin\"]"))).build().perform();
		act.moveToElement(driver.findElement(By.xpath("//*[@id=\"smoothmenu1\"]/ul/li[14]/ul/li[2]/a"))).build().perform();
		driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"smoothmenu1\"]/ul/li[14]/ul")).click();
		//driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
		
		driver.close();
	}   
	@Test(priority=0)
		public void Checkbox() throws InterruptedException
		{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();  
		driver.get("http://uitestpractice.com/Students/Form");
		driver.manage().window().maximize();
		driver.findElement(By.className("checkbox-inline")).click();
		Thread.sleep(2000);
		driver.close();
		}
}
