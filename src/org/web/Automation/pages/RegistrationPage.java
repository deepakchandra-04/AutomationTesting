package org.web.Automation.pages;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import web.automationLibrary.CaptureScreenshot;
import web.automationLibrary.PageActions;
import web.automationLibrary.PropertyReader;

public class RegistrationPage {
	
	WebDriver driver= null;
	PageActions action;
	
	public RegistrationPage(WebDriver driver) {
		this.driver= driver;
		action= new PageActions(driver);
	}
		
	public void enterUsername(String username){
		try {
		 action.enterDataIntoTextBox
		 (driver.findElement(By.name(PropertyReader.elementLocatorReader("registration_page_username_textbox_name"))), username);
	 	}
		catch(Exception e) {
			System.out.println("*********Exception************");
			e.printStackTrace();
			CaptureScreenshot.takeScreenshot(driver, "EnterDataFiled");
			Assert.fail();
		}
	}
	
	public void enterEmail(String email) throws IOException {
		try {
		action.enterDataIntoTextBox
		 (driver.findElement(By.name(PropertyReader.elementLocatorReader("registration_page_email_textbox_name"))), email);
		}
		catch(Exception e) {
			System.out.println("*********Exception************");
			e.printStackTrace();
			CaptureScreenshot.takeScreenshot(driver, "EnterDataFailed");
			Assert.fail();
		}
		}

	public void clickSignUpButton() throws IOException {	
		try {
		action.clickButton
		(driver.findElement(By.xpath(PropertyReader.elementLocatorReader("registration_page_sign_up_button_xpath"))));
	}
	catch(Exception e) {
		System.out.println("*********Exception************");
		e.printStackTrace();
		CaptureScreenshot.takeScreenshot(driver, "ClickButtonFailed");
		Assert.fail();
	}
	}
	
	public void selectCountryDropDown(String countryName) throws IOException {
		try {
		action.selectVisibleTextInDropDown
		 (driver.findElement(By.id(PropertyReader.elementLocatorReader("registration_page_country_dropdown_id"))), countryName);
		}
		catch(Exception e) {
			System.out.println("*********Exception************");
			e.printStackTrace();
			CaptureScreenshot.takeScreenshot(driver, "SelectTextInDropDownFailed");
			Assert.fail();
		}
//		 Select country = new Select(driver.findElement(By.id(PropertyReader.elementLocatorReader("registration_page_country_dropdown_id"))));
//		country.selectByVisibleText(countryName);
	}

}
