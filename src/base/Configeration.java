package base;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import utlis.SWDFunctions;

public class Configeration extends SWDFunctions {
	
	@BeforeTest
	
	public void BeforeTestStart(){
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/Drivers/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		
	}

	
}
