package pages;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import constants.AppiumConstant;
import constants.AppiumEmaarOneRequestDetailsScreenRepo;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import pages.AppiumEmaarOneHomeScreen;
import pages.AppiumEmaarOneLoginScreen;
import pages.AppiumEmaarOneLogout;
import pages.AppiumEmaarOneNewSRScreen;
import pages.AppiumEmaarOnePropertySelectionScreen;
import pages.AppiumEmaarOneRaiseSRScreen;
import pages.AppiumEmaarOneRequestDetailsScreen;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

//import com.aventstack.extentreports.ExtentReports;
//import com.aventstack.extentreports.ExtentTest;
//import com.aventstack.extentreports.Status;
//import com.aventstack.extentreports.markuputils.ExtentColor;
//import com.aventstack.extentreports.markuputils.MarkupHelper;
//import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
//import com.aventstack.extentreports.reporter.configuration.Theme;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.model.Log;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.testng.*;
import org.testng.xml.XmlSuite;


import constants.AppiumConstant;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import utilities.ExcelUtils;

public class BasePage {

	public static String higlightColor = "Cyan";
	public static String projectName = "EmaarOne";
	
	public static MobileElement mobileElement;
	public static AndroidDriver<AndroidElement> androidDriver ;

	public static boolean waitForPresence( AndroidDriver<AndroidElement> driver, String targetResourceText ,int timeLimitInSeconds){

		try{
			By elementLocator = MobileBy.AccessibilityId(targetResourceText);
			WebDriverWait waitTillPageLoad = new WebDriverWait(driver, timeLimitInSeconds , 500);
			waitTillPageLoad.until(ExpectedConditions.visibilityOfElementLocated(elementLocator));
			boolean isElementPresent = driver.findElement(elementLocator).isEnabled();
			System.out.println(targetResourceText + " is enabled in the screen");
			return isElementPresent;	
		}catch(Exception e){
			boolean isElementPresent = false;
			System.out.println(e.getMessage());
			return isElementPresent;
		} }

	public static boolean waitForPresence( AndroidDriver<AndroidElement> driver, By locator ,int timeLimitInSeconds){

		try{
			mobileElement =  (MobileElement) driver.findElement(locator);
			WebDriverWait wait = new WebDriverWait(driver, timeLimitInSeconds , 500);
			wait.until(ExpectedConditions.visibilityOf(mobileElement));
			boolean isElementPresent = mobileElement.isDisplayed();
			return isElementPresent;	
		}catch(Exception e){
			boolean isElementPresent = false;
			System.out.println(e.getMessage());
			return isElementPresent;
		} }



	public static  AndroidDriver<AndroidElement> waitUntilAndClick( AndroidDriver<AndroidElement> driver, By locator, int timeLimitInSeconds){
		boolean isElementPresent = false;

		isElementPresent = waitForPresence(driver, locator, timeLimitInSeconds);

		if (isElementPresent == true)
		{


			//System.out.println("I am here . I am true.");
			//WebDriverWait wait = new WebDriverWait(driver, timeLimitInSeconds);
			//wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
			driver.findElement(locator).click();

		} 


		return driver;

	}


	public static  AndroidDriver<AndroidElement> waitUntilAndClear( AndroidDriver<AndroidElement> driver, By locator, int timeLimitInSeconds){

		boolean isElementPresent = false;
		isElementPresent = waitForPresence(driver, locator, timeLimitInSeconds);

		if (isElementPresent == true)
		{


			//System.out.println("I am here . I am true.");
			//WebDriverWait wait = new WebDriverWait(driver, timeLimitInSeconds);
			//wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
			driver.findElement(locator).clear();

		} 


		return driver;

	}

	public static  AndroidDriver<AndroidElement> waitUntilAndType( AndroidDriver<AndroidElement> driver, By locator,String textValue, int timeLimitInSeconds){

		boolean isElementPresent = false;
		isElementPresent = waitForPresence(driver, locator, timeLimitInSeconds);

		if (isElementPresent == true)
		{


			//System.out.println("I am here . I am true.");
			//WebDriverWait wait = new WebDriverWait(driver, timeLimitInSeconds);
			//wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
			driver.findElement(locator).sendKeys(textValue);

		} 


		return driver;
	}



//	public static AndroidDriver<AndroidElement> waitUntilAndClick(AndroidDriver<AndroidElement> driver, String text, int timeLimitInSeconds){
//
//		boolean isElementPresent = false;
//		isElementPresent = AppiumActions.waitForPresence(driver, text, timeLimitInSeconds);
//
//		if (isElementPresent == true)
//		{
//
//
//			//System.out.println("I am here . I am true.");
//			//WebDriverWait wait = new WebDriverWait(driver, timeLimitInSeconds);
//			//wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
//			driver.findElementByAccessibilityId(text).click();
//
//		} 
//
//
//		return driver;
//
//	}
	
	public static AndroidDriver<AndroidElement> waitUntilAndClick(AndroidDriver<AndroidElement> driver, String text, int timeLimitInSeconds){

		boolean isElementPresent = false;
		isElementPresent = waitForPresence(driver, text, timeLimitInSeconds);

		if (isElementPresent == true)
		{


			//System.out.println("I am here . I am true.");
			//WebDriverWait wait = new WebDriverWait(driver, timeLimitInSeconds);
			//wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
			//driver.findElementByAccessibilityId(text).click();
			driver.findElement(By.linkText(text)).click();

		} 


		return driver;

	}
	


//	public static AndroidDriver<AndroidElement> waitUntilAndClear(AndroidDriver<AndroidElement> driver, String text, int timeLimitInSeconds){
//
//		boolean isElementPresent = false;
//		isElementPresent = AppiumActions.waitForPresence(driver, text, timeLimitInSeconds);
//
//		if (isElementPresent == true)
//		{
//
//
//			//System.out.println("I am here . I am true.");
//			//WebDriverWait wait = new WebDriverWait(driver, timeLimitInSeconds);
//			//wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
//			driver.findElementByAccessibilityId(text).clear();
//
//		} 
//
//
//		return driver;
//	}
	
	
	public static AndroidDriver<AndroidElement> waitUntilAndClear(AndroidDriver<AndroidElement> driver, String text, int timeLimitInSeconds){

		boolean isElementPresent = false;
		isElementPresent = waitForPresence(driver, text, timeLimitInSeconds);

		if (isElementPresent == true)
		{


			//System.out.println("I am here . I am true.");
			//WebDriverWait wait = new WebDriverWait(driver, timeLimitInSeconds);
			//wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
			//driver.findElementByAccessibilityId(text).clear();
			driver.findElement(By.linkText(text)).clear();

		} 


		return driver;
	}
	
	
//
//	public static AndroidDriver<AndroidElement> waitUntilAndType(AndroidDriver<AndroidElement> driver, String text,String textValue, int timeLimitInSeconds){
//		boolean isElementPresent = false;
//		isElementPresent = AppiumActions.waitForPresence(driver, text, timeLimitInSeconds);
//
//		if (isElementPresent == true)
//		{
//
//
//			//System.out.println("I am here . I am true.");
//			//WebDriverWait wait = new WebDriverWait(driver, timeLimitInSeconds);
//			//wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
//			driver.findElementByAccessibilityId(text).sendKeys(textValue);
//
//		} 
//
//
//		return driver;
//
//	}
	
	public static AndroidDriver<AndroidElement> waitUntilAndType(AndroidDriver<AndroidElement> driver, String text,String textValue, int timeLimitInSeconds){
		boolean isElementPresent = false;
		isElementPresent = waitForPresence(driver, text, timeLimitInSeconds);

		if (isElementPresent == true)
		{


			//System.out.println("I am here . I am true.");
			//WebDriverWait wait = new WebDriverWait(driver, timeLimitInSeconds);
			//wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
			//driver.findElementByAccessibilityId(text).sendKeys(textValue);
			driver.findElement(By.linkText(text)).sendKeys(textValue);

		} 


		return driver;

	}
	
	
	public static AndroidDriver<AndroidElement> dragDownAndClick(AndroidDriver<AndroidElement> driver, String logouttext, int timeLimitInSeconds){
		
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+logouttext+"\").instance(0))").click();
		return driver;

	}
	
	
	
	
	
	
	public static ExtentHtmlReporter htmlReporter;
	public static ExtentReports extent;
	public static ExtentTest report;
	

	
	@BeforeSuite
	public void testSuiteSetup() throws Exception
	{
	
		
		String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		//location of the extent report
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") + "/test-output/ExtentReport/"+"TestReport_EmaarOne"+"_"+ dateName+ ".html");
//		extent = new ExtentReports();  //create object of ExtentReports
//		extent.attachReporter(htmlReporter);

//		htmlReporter.config().setDocumentTitle("Automation Report"); // Tittle of Report
//		htmlReporter.config().setReportName("Extent Report V4"); // Name of the report
//		htmlReporter.config().setTheme(Theme.DARK);//Default Theme of Report
		
	    htmlReporter.config().setDocumentTitle("EmaarOne App");
        htmlReporter.config().setReportName("EmaarOne App Test Automation Report");
        htmlReporter.config().setTheme(Theme.STANDARD);
        htmlReporter.config().setCSS(".node.level-1  ul{ display:none;} .node.level-1.active ul{display:block;}  .card-panel.environment  th:first-child{ width:30%;}");
        htmlReporter.config().setJS("$(window).off(\"keydown\");");

        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        extent.setReportUsesManualConfiguration(true);

        Properties properties = System.getProperties();
        extent.setSystemInfo("OS Name",properties.getProperty("os.name","Details Not Available"));
        extent.setSystemInfo("OS Architecture",properties.getProperty("os.arch","Details Not Available"));
        extent.setSystemInfo("OS Version",properties.getProperty("os.version","Details Not Available"));
        extent.setSystemInfo("Java Version",properties.getProperty("java.version","Details Not Available"));
        extent.setSystemInfo("Java Home",properties.getProperty("java.home","Details Not Available"));
//        extent.setSystemInfo("User Name",properties.getProperty("user.name","Details Not Available"));
        extent.setSystemInfo("user.dir",properties.getProperty("user.dir","Details Not Available"));
		
        extent.setSystemInfo("User Name", "Nishad Hameed");
		extent.setSystemInfo("Application Name", "EmaarOne App");
		extent.setSystemInfo("Envirnoment", "QA ON Staging");	
		
		
		//Copy the Test input file to the testResult folder
		ExcelUtils.copyFileUsingApacheCommonsIO(AppiumConstant.sourceFile , AppiumConstant.destFile);
	}
	
	@AfterMethod
	public void getResult(ITestResult result)
	{
		if(result.getStatus() == ITestResult.FAILURE)
		{
			//MarkupHelper is used to display the output in different colors
			report.log(Status.FAIL, MarkupHelper.createLabel(result.getName() + " - Test Case Failed", ExtentColor.RED));
			report.log(Status.FAIL, MarkupHelper.createLabel(result.getThrowable() + " - Test Case Failed", ExtentColor.RED));

		}
		else if(result.getStatus() == ITestResult.SKIP){
			//logger.log(Status.SKIP, "Test Case Skipped is "+result.getName());
			report.log(Status.SKIP, MarkupHelper.createLabel(result.getName() + " - Test Case Skipped", ExtentColor.ORANGE)); 
		} 
		else if(result.getStatus() == ITestResult.SUCCESS)
		{
			report.log(Status.PASS, MarkupHelper.createLabel(result.getName()+" Test Case PASSED", ExtentColor.GREEN));
		}
		
	}
	
	
//	public void endReport() {
//		extent.flush();
//	}
	
	@AfterSuite
	public static void tearDownAfterClass() throws Exception {
		extent.flush();
		//Copy the result to the excel file with time stamp
		ExcelUtils.copyResultFileWithTimeStamp();
	}

	



}
