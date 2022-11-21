package testingWorldPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC006_FetchData_Browser {
	
	ChromeDriver driver;
	
	@BeforeMethod
	public void startBrowser() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://thetestingworld.com/testings/");
						
	}
	
	  //@Test 
	  public void tc001() throws InterruptedException
	  { 
		 System.out.println(driver.getCurrentUrl());
		 System.out.println("Title of Page: " + driver.getTitle());
		 System.out.println("HTML page is here " + driver.getPageSource());
		 System.out.println(driver.findElement(By.xpath("//a[text()='Read Detail']")).getText());
		 System.out.println(driver.findElement(By.name("terms")).getAttribute("type"));
		 System.out.println(driver.findElement(By.name("fld_username")).getLocation());
		 System.out.println("Element is Enabled:- " + driver.findElement(By.xpath("//input[@value='Sign up']")).isEnabled());
		 System.out.println("Element is Displayed:- " + driver.findElement(By.xpath("//input[@value='Sign up']")).isDisplayed());
		 System.out.println("Element is Selected:- " + driver.findElement(By.name("terms")).isSelected());
		 driver.findElement(By.name("terms")).click();
		 
	  }
	  
}
