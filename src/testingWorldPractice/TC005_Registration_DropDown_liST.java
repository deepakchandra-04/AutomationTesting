package testingWorldPractice;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import pom_Base.InitiateDriver;
import web.automationLibrary.CaptureScreenshot;
import web.automationLibrary.PropertyReader;

public class TC005_Registration_DropDown_liST extends InitiateDriver {
	
	  //@Test 
	  public void tc001() throws InterruptedException, IOException
	  {
		driver.findElement(By.name(PropertyReader.elementLocatorReader("registration_page_username_textbox_name"))).sendKeys("testing");
		driver.findElement(By.name(PropertyReader.elementLocatorReader("registration_page_email_textbox_name"))).sendKeys("test1234@gmail.com");
		
		
		
		/*
		 * Thread.sleep(2000); Actions act = new Actions(driver);
		 * act.sendKeys(Keys.PAGE_DOWN).perform();
		 */
		//Thread.sleep(2000);
		
		Select country = new Select(driver.findElement(By.id(PropertyReader.elementLocatorReader("registration_page_country_dropdown_id"))));
		//country.selectByIndex(3); //country.selectByValue("8")
		country.selectByVisibleText("India");
		
		driver.findElement(By.xpath(PropertyReader.elementLocatorReader("registration_page_sign_up_button_xpath"))).click();
		
		CaptureScreenshot.takeScreenshot(driver, "After_registration_Error");
		
		/*
		 * Select gender = new Select(driver.findElement(By.name("sex")));
		 * gender.selectByVisibleText("Male");
		 * 
		 * WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		 * wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.
		 * id("stateId")), "Delhi"));
		 * 
		 * Select state = new Select(driver.findElement(By.id("stateId")));
		 * state.selectByVisibleText("Delhi");
		 * 
		 * 
		 * wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.
		 * id("cityId")), "Delhi")); Select city = new
		 * Select(driver.findElement(By.id("cityId")));
		 * city.selectByVisibleText("Delhi");
		 */	  }

}