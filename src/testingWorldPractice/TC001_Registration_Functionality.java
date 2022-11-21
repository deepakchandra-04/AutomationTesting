package testingWorldPractice;

import org.testng.annotations.Test;
import java.io.IOException;

import pom_Base.InitiateDriver;
import web.automationLibrary.CaptureScreenshot;

public class TC001_Registration_Functionality extends InitiateDriver{
	
	@Test
	public void  tc001() throws IOException {
		
		registration.enterUsername("Hello Dear");
		registration.enterEmail("testing123@gmail.com");
		registration.selectCountryDropDown("India");
		registration.clickSignUpButton();
		CaptureScreenshot.takeScreenshot(driver, "After_Registration_Error");
	}

}
