package org.web.Automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import web.automationLibrary.CaptureScreenshot;
import web.automationLibrary.PageActions;
import web.automationLibrary.PropertyReader;

public class LoginPage {
	
	WebDriver driver= null;
	PageActions action;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		action= new PageActions(driver);
	}
	
	public void clickLoginTab() {
		try{
		action.clickButton(driver.findElement(By.xpath(PropertyReader.elementLocatorReader("login_page_login_button_xpath"))));
		//driver.findElement(By.xpath("//label[text()='Login']")).click();
	}
		catch(Exception e) {
			System.out.println("***********Exception************");
			e.printStackTrace();
			CaptureScreenshot.takeScreenshot(driver, "ClickButtonFailed");
			Assert.fail();
		}	
		}
	
	public void enterUsername(String username){
		try {
		action.enterDataIntoTextBox
		(driver.findElement(By.name(PropertyReader.elementLocatorReader("login_username_textbox_name"))), username);		
		
		//driver.findElement(By.name(PropertyReader.elementLocatorReader("login_username_textbox_name"))).sendKeys(PropertyReader.applicationConfigReader("Application_Username"));
	}
		catch(Exception e) {
			System.out.println("***********Exception************");
			e.printStackTrace();
			CaptureScreenshot.takeScreenshot(driver, "EnterDataFailed");
			Assert.fail();
		}
	}
	public void enterPassword(String password){
		try {
		action.enterDataIntoTextBox
		(driver.findElement(By.name(PropertyReader.elementLocatorReader("login_password_textbox_name"))), password);
		//driver.findElement(By.name(PropertyReader.elementLocatorReader("login_password_textbox_name"))).sendKeys(PropertyReader.applicationConfigReader("Application_Password"));
	}
		catch(Exception e) {
			System.out.println("***********Exception************");
			e.printStackTrace();
			CaptureScreenshot.takeScreenshot(driver, "EnterDataFailed");
			Assert.fail();
		}
	}
	
	public void clickLoginButton(){
		try {
		action.clickButton
		(driver.findElement(By.xpath(PropertyReader.elementLocatorReader("login_page_login_button_xpath"))));
		//driver.findElement(By.xpath("//input[@value='Login']")).click();
	}
		catch(Exception e) {
			System.out.println("***********Exception************");
			e.printStackTrace();
			CaptureScreenshot.takeScreenshot(driver, "ClickLoginButtonFailed");
			Assert.fail();
		}
	}
}
