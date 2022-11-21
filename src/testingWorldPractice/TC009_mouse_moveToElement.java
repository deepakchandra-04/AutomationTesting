package testingWorldPractice;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC009_mouse_moveToElement {
	
	
	ChromeDriver driver;
	
	@BeforeMethod
	public void startBrowser() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.thetestingworld.com/testings");
						
	}
	
	  //@Test 
	  public void tc001()
	  { 
		  driver.findElement(By.xpath("//label[text()='Login']")).click();
		  driver.findElement(By.name("_txtUserName")).sendKeys("test1234");
		  driver.findElement(By.name("_txtPassword")).sendKeys("test");
		  driver.findElement(By.xpath("//input[@value='Login']")).click();
		  Actions act = new Actions(driver);
		  act.keyDown(Keys.CONTROL).click(driver.findElement(By.xpath("//a[text()='Download']"))).keyUp(Keys.CONTROL).build().perform();
	  }
	  
}
