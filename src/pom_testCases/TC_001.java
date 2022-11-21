package pom_testCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pom_Base.InitiateDriver;
import pom_Page.Register_Page;

public class TC_001 extends InitiateDriver{
	
	//@Test
	public void tc001(){
		
		  Register_Page register = PageFactory.initElements(driver, Register_Page.class);
		  register.enterUsername();
		  register.enterEmail(); 
		  register.enterPassword();
		  register.enterConfirmPassword();
	}
}
