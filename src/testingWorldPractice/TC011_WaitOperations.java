package testingWorldPractice;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC011_WaitOperations {
	
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
	  }
	  
}
