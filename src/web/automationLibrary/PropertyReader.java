package web.automationLibrary;

import java.io.File;
import java.io.FileReader;
import java.util.Properties;

public class PropertyReader {

	public static String applicationConfigReader(String key){
		try {
		File f = new File("./Configuration Files/Application.Config.properties");
		FileReader fr = new FileReader(f);
		Properties prop = new Properties();
		prop.load(fr);
		return prop.get(key).toString();
		}
		catch(Exception e) {
			return null;
		}
	}
	
	public static String elementLocatorReader(String key){
		try {
		File f = new File("./Element Locators/Locator.properties");
		FileReader fr = new FileReader(f);
		Properties prop = new Properties();
		prop.load(fr);
		return prop.get(key).toString();
		}
		catch(Exception e) {
			return null;
		}
	}
}
