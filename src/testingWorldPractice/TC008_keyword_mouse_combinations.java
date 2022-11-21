package testingWorldPractice;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC008_keyword_mouse_combinations {
	
	ChromeDriver driver;
	
	@BeforeMethod
	public void startBrowser() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C550525804791%7Cb%7Cfacebook%20%27%7C&placement=&creative=550525804791&keyword=facebook%20%27&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696220912%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-327195741349%26loc_physical_ms%3D9075215%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=EAIaIQobChMIs9mul_vp-QIVfP7jBx1m5gKAEAAYASAAEgKuI_D_BwE");
						
	}
	
	 // @Test 
	  public void tc001() throws InterruptedException
	  { 
		 //driver.findElement(By.name("firstname")).sendKeys("Hello");;
		 Actions act = new Actions(driver);
		//act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();	 
	  act.sendKeys(Keys.PAGE_DOWN).perform();
	  }
	  
}
