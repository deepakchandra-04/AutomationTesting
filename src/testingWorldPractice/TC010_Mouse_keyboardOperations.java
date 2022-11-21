package testingWorldPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC010_Mouse_keyboardOperations {
	
	ChromeDriver driver;
	
	@BeforeMethod
	public void startBrowser() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.thetestingworld.com/testing");
						
	}
	
	 //@Test 
	  public void tc001() throws InterruptedException
	  { 
		 Actions act = new Actions(driver);
		 act.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'VIDEOS')]"))).perform();
		 driver.findElement(By.xpath("//a[@title='Free Videos']")).click();
	  }
	  
}
