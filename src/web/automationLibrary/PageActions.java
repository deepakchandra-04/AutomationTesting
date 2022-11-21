package web.automationLibrary;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class PageActions {
	
	WebDriver driver= null;
	WebDriverWait wait;

	public PageActions(WebDriver driver) {
		this.driver=driver;
		wait= new WebDriverWait(driver, Duration.ofSeconds(10));		
	}

	public void clickButton(WebElement element) {
		try {
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
			}
	catch(Exception e) {
		System.out.println("*********Exception************");
		e.printStackTrace();
		CaptureScreenshot.takeScreenshot(driver, "ClickButtonFailed");
		Assert.fail();
	}
	}
	
	public void enterDataIntoTextBox(WebElement element, String text) {
	try {
		wait.until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(text);
	}
	catch(Exception e) {
		System.out.println("*********Exception************");
		e.printStackTrace();
		CaptureScreenshot.takeScreenshot(driver, "EnterDataFailed");
		Assert.fail();
	}
	}	
	public void selectVisibleTextInDropDown(WebElement element, String text) {
	try {
		wait.until(ExpectedConditions.textToBePresentInElement(element, text));
		Select s = new Select(element);
		s.selectByVisibleText(text);
	}
	catch(Exception e) {
		System.out.println("*********Exception************");
		e.printStackTrace();
		CaptureScreenshot.takeScreenshot(driver, "SelectTextInDropDownFailed");
		Assert.fail();
	}
}
}