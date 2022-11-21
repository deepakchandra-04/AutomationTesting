package pom_Base;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.web.Automation.pages.LoginPage;
import org.web.Automation.pages.RegistrationPage;

import web.automationLibrary.PropertyReader;

public class InitiateDriver {
	
public WebDriver driver;
public RegistrationPage registration;
public LoginPage login;

	@BeforeMethod
	public void startBrowser() throws InterruptedException, IOException
	{
		if(PropertyReader.applicationConfigReader("BrowserName").equalsIgnoreCase("Chrome"))
			{
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		driver = new ChromeDriver();
		}
		
		else if(PropertyReader.applicationConfigReader("BrowserName").equalsIgnoreCase("Firefox"))
				{
			System.setProperty("webdriver.gecko.driver", "./geckodriver.exe");
			driver = new FirefoxDriver();
				}
		else
		{
			System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
			driver = new ChromeDriver();
		}
	
		driver.manage().window().maximize();
		driver.get(PropertyReader.applicationConfigReader("Application_URL"));
		registration= new RegistrationPage(driver);
		login= new LoginPage(driver); 
}
		
		@AfterMethod
		public void closeBrowser(){
			driver.close();
			}

}