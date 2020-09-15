package pages;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import utilities.InitBrowser;

public class BrowserInit {
	
	private static WebDriver driver;

	
	public static WebDriver browserInitiate (String browserName  ) throws Throwable
	{
		//Initialize Web driver based on the input from the Excel - Chrome OR FireFox OR IE 
		Reporter.log("Initialize Web driver based on the input from the Excel - Chrome OR FireFox OR IE");
		driver = InitBrowser.beforeTest(browserName);
		return driver;
	
	}

}
