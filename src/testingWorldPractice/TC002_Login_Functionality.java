package testingWorldPractice;

import org.testng.annotations.Test;
import java.io.IOException;
import pom_Base.InitiateDriver;
import web.automationLibrary.CaptureScreenshot;

public class TC002_Login_Functionality extends InitiateDriver{
	
	@Test
	public void  tc002() throws IOException {
		//Create object for loginPage and call method using this object
		login.clickLoginTab();
		login.enterUsername("deepak123@gmail.com");
		login.enterPassword("deepak123");
		login.clickLoginButton();
		CaptureScreenshot.takeScreenshot(driver, "After_Login_Error");
		
		/*
		 * registration.enterUsername("Hello Dear");
		 * registration.enterEmail("testing123@gmail.com");
		 * registration.selectCountryDropDown("India");
		 * registration.clickSignUpButton();
		 */		CaptureScreenshot.takeScreenshot(driver, "After_Registration_Error");
	}

}
