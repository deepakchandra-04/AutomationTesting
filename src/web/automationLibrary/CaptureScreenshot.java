package web.automationLibrary;

import java.io.File;
import java.util.Calendar;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

public class CaptureScreenshot {
	
	public static void takeScreenshot(WebDriver driver, String name){
		try {
		Calendar c =  Calendar.getInstance();
		System.out.println(c.getTime());
		TakesScreenshot ss = (TakesScreenshot) driver;
		File f = ss.getScreenshotAs(OutputType.FILE);
		File fd = new File("./Screenshots/"+ name + c.getTime().toString().replace(":","").replace(" ","") +".png");
		Files.copy(f, fd);
		}
		catch(Exception e) {
		System.out.println("Not Able to take screenshot");
		}
}
}

