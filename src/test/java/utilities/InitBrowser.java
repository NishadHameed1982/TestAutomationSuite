package utilities;

import java.io.FileInputStream;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;


@SuppressWarnings("deprecation")
public class InitBrowser {

	private static WebDriver driver;
	public static WebDriver beforeTest(String browser) throws Throwable {
		if (browser.equalsIgnoreCase("firefox")) {


//			Properties prop = new Properties();
//			String path = System.getProperty("user.dir") + "/src/config.properties";
//			//Create FileInputStream object of Config/data file
//			FileInputStream fs= new FileInputStream(path);
//			// Pass fs object to load method of Properties object
//			prop.load(fs);
//			String firefoxDriverPath = prop.getProperty("PathFirefox");
//			System.setProperty("webdriver.gecko.driver", firefoxDriverPath);
//
//			//			@SuppressWarnings("deprecation")
//			FirefoxProfile profileIni = new FirefoxProfile();
//			FirefoxProfile profile = profileIni.getProfile("default");
//			//	       
//			FirefoxOptions options = new FirefoxOptions();
//			options.setProfile(profile);
//			//	       // options.setHeadless(true);
//			options.setCapability("marionette", true);
//
//			//FirefoxOptions opt = new FirefoxOptions();
//			driver = new FirefoxDriver(options);
//			//driver = new FirefoxDriver();
//			driver.manage().window().maximize();


		} else if (browser.equalsIgnoreCase("chrome")) {

			Properties prop = new Properties();

			//Use System.getProperty to get the relative path of file in Workspace. Now file path is machine independent.
			String path = System.getProperty("user.dir") + "/src/config.properties";
			//System.out.println("Actual Location of File -> " + path);


			//Create FileInputStream object of Config/data file
			FileInputStream fs= new FileInputStream(path);

			// Pass fs object to load method of Properties object
			prop.load(fs);


			//Properties prop = new Properties();
			//prop.load(new FileInputStream("C://Users//nishadh//Desktop//Selenium//SeleniumConsolidated//Drivers//chromedriver_win32//chromedriver.exe"));
			String chromeDriverPath = prop.getProperty("PathChrome");

			System.setProperty("webdriver.chrome.driver", chromeDriverPath);

			ChromeOptions options = new ChromeOptions();
			options.addArguments("test-type");
			options.addArguments("start-maximized");
			options.addArguments("enable-automation");
			options.addArguments("test-type=browser");
			options.addArguments("disable-infobars");
			options.addArguments("start-fullscreen");
			driver = new ChromeDriver(options);

			//driver.manage().window().maximize();

		} else if (browser.equalsIgnoreCase("ie")) {
			// Set Path for the executable file
			System.setProperty("webdriver.ie.driver", "C://IEDriverServer_Win32_2.53.0//IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			driver.manage().window().maximize();
		} else {
			throw new IllegalArgumentException("The Browser Type is Undefined");
		}
		// Open App
		return driver;
	}


}
