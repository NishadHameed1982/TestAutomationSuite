package utilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Reporter;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class AppiumInitDriver {

	public static URL url;
	public static DesiredCapabilities capabilities;
	public static IOSDriver<IOSElement> driver;
	public static String testDevice ;

	//BrowserStack credentials
	public static String accessKey = "S267yf5rUDeoM9FD2DFh";
	public static String userName = "nishadhameed2";


//	public static AndroidDriver<AndroidElement> setMobileDriver(String appName , String emulatorName ) throws MalformedURLException
//	{
//
//		File appDir = new File("src");
//		File app = new File(appDir, "appUnderTest/" + appName);
//		DesiredCapabilities capabilities = new DesiredCapabilities();
//		capabilities.setCapability("avd",emulatorName);
//		capabilities.setCapability("noReset","true");
//        capabilities.setCapability("fullReset","false");
//	capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");
//		//capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"appium");
//		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, emulatorName);
//		capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
//		capabilities.setCapability(MobileCapabilityType.SUPPORTS_ALERTS,true);
//		capabilities.setCapability("autoAcceptAlerts", true);
//		AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		return driver;
//	}
	
	
	public static AndroidDriver<AndroidElement> setMobileDriver(String appName , String emulatorName ) throws MalformedURLException
	{

		File appDir = new File("src");
		File app = new File(appDir, "test/java/appUnderTest/" + appName);
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("avd",emulatorName);
		capabilities.setCapability("noReset","true");
        capabilities.setCapability("fullReset","false");
	capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator1");
		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"appium");
//		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Nishad Hameed (Galaxy S5)");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		capabilities.setCapability(MobileCapabilityType.SUPPORTS_ALERTS,true);
		capabilities.setCapability("autoAcceptAlerts", true);
		AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return driver;
	}



	public static IOSDriver<IOSElement> setMobileDriver(String deviceName, 
			String appLocation, 
			String platformName, 
			String platformVersion, 
			String appiumDeviceName) throws Throwable {

		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("fullReset",true);
		caps.setCapability("platformName",platformName);
		caps.setCapability("platformVersion",platformVersion);
		caps.setCapability("deviceName",appiumDeviceName);
		caps.setCapability("automationName","XCUITest");
		caps.setCapability("app", appLocation);


		testDevice = deviceName.toUpperCase();
		System.out.println("################## "+ "Test execution started with " + testDevice + " ##################");
		Reporter.log("################## "+ "Test execution started with " + testDevice + " ##################");

		// Run the comment in terminal to obtain UDID "xcrun simctl list"
		// Data for iOS 12.4
//		switch (deviceName) {
//		case "iPhone 5s" :
//			caps.setCapability("udid","6F2DCF27-8798-4559-8BA2-1CB843BF5AE2");
//			break;
//
//		case "iPhone 6 Plus" :
//			caps.setCapability("udid","C7394184-125B-45CE-B921-EA0A5092B50C");
//			break;
//
//		case "iPhone 6" :
//			caps.setCapability("udid","5ADF5A1C-4374-4986-8B4D-C1E539FEE25C");
//			break;
//
//		case "iPhone 6s" :
//			caps.setCapability("udid","8C2BB3DE-D021-4C5B-A1D3-8A9867AB8B31");
//			break;
//
//		case "iPhone 6s Plus" :
//			caps.setCapability("udid","5744A317-3A7E-45F2-B7E0-ACDA740DC38D");
//			break;
//
//		case "iPhone 7" :
//			caps.setCapability("udid","3C111629-9509-490B-A270-1B4F82D05B99");
//			break;
//
//		case "iPhone 7 Plus" :
//			caps.setCapability("udid","E9ED9C15-3AC5-4D68-8AE0-531EC6EE0F6E");
//			break;
//
//		case "iPhone 8" :
//			caps.setCapability("udid","7DF5342B-0725-4DD3-8346-880C959F7A48");
//			break;
//
//		case "iPhone 8 Plus" :
//			caps.setCapability("udid","10321860-51A6-42CB-BE65-DEE36AF459BE");
//			break;
//
//		case "iPhone X" :
//			caps.setCapability("udid","50E6711B-A84F-4BD1-9B4A-A5C034A69B22");
//			break;
//
//		case "iPhone Xs" :
//			caps.setCapability("udid","D481C65B-A31A-4E1E-87F8-4B5D9D49CCA0");
//			break;
//
//		case "iPhone Xs Max" :
//			caps.setCapability("udid","8F5DD0CC-3842-42C7-B729-B5D201E43020");
//			break;
//
//		case "iPhone Xʀ" :
//			caps.setCapability("udid","03079E65-DF0A-49BA-A5D4-7812DF73B14E");
//			break;
//
//
//		default :
//			caps.setCapability("udid","50E6711B-A84F-4BD1-9B4A-A5C034A69B22");
//		}

		caps.setCapability("showXcodeLog",true);

		driver=new IOSDriver<IOSElement>(new URL("http://127.0.0.1:4723/wd/hub"),caps);
		return driver;

	}




	public static IOSDriver<IOSElement> setMobileDriverBrowserStack(String deviceName, 
			String appLocation, 
			String platformName, 
			String platformVersion, 
			String appiumDeviceName) throws Throwable {

		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("device", "iPhone 8 Plus");
		caps.setCapability("os_version", "11");
		caps.setCapability("app_url","bs://c2199b96e2ee345ece040e242402480536037b7c");
		IOSDriver<IOSElement> driver = new IOSDriver<IOSElement>(new URL("http://"+userName+":"+accessKey+"@hub-cloud.browserstack.com/wd/hub"), caps);
		return driver;

	}


}
