package pom_Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Register_Page {
		
	@FindBy(name= "fld_username") WebElement usernameTextBox;
	@FindBy(name= "fld_email") WebElement emailTextBox;
	@FindBy(xpath= "//input[@placeholder='Password']") WebElement passwordTextBox;
	@FindBy(xpath= "//input[@placeholder='Confirm password']") WebElement confirmPasswordTextBox;

	
	public void enterUsername()
	{
		usernameTextBox.sendKeys("hello");
	}
	
	public void enterEmail()
	{
		emailTextBox.sendKeys("abc@gmail.com");		
	}
	
	public void enterPassword()
	{
		passwordTextBox.sendKeys("hello123");
				
	}

	public void enterConfirmPassword()
	{
		confirmPasswordTextBox.sendKeys("hello123");
				
	}
	
}
