package utilities;

import java.io.File;  
import java.io.IOException;  
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.apache.commons.io.FileUtils;  
import org.openqa.selenium.OutputType;  
import org.openqa.selenium.TakesScreenshot;  
import org.openqa.selenium.WebDriver;

import constants.AppiumConstant;
import constants.Constant;

public class MultiScreenShot   
{  
	//screenshot number	  
	int screenShotNumber;      	  
	//element screenshot number  
	int elementPart;  

	//screen shot path  
	String screenShotPathAndFileName=null;  
	//element path  
	String elementPath=null;  

	//element file name  
	String elementFileName=null;  

	//full screenshot path  
	static String screenshotPath=null;  
	static String screenshotFileName = null;
	static String desiredName = null;
	
	public static void ScreenShot (String projectName , String testCase , WebDriver driver , String customText)
	{
		Calendar currentDate = Calendar.getInstance();
		SimpleDateFormat formatter = new SimpleDateFormat(
				"yyyy/MMM/dd HH:mm:ss");
		String dateN = formatter.format(currentDate.getTime()).replace("/","_");
		String dateNow = dateN.replace(":","_");
		
		screenshotPath = Constant.Screenshot_Path + "//"+projectName+"//"+ testCase ;
		screenshotFileName = testCase + "_Screenshot_"+customText +"_"+dateNow + ".jpg";
		
		//screenshot taking lines this line is to capture screenshot  
				File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);  
				
				desiredName = screenshotPath+ "//"+ screenshotFileName ;
				File destFile = new File(desiredName);

				//to save the screenshot  
				try {
					FileUtils.copyFile(scrFile, destFile);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
		
		
	}
	
	public static void MobileScreenShot (String projectName , String testCase , WebDriver driver , String customText)
	{
		Calendar currentDate = Calendar.getInstance();
		SimpleDateFormat formatter = new SimpleDateFormat(
				"yyyy/MMM/dd HH:mm:ss");
		String dateN = formatter.format(currentDate.getTime()).replace("/","_");
		String dateNow = dateN.replace(":","_");
		
//		screenshotPath = AppiumConstant.appDir.getAbsolutePath() + "//"+ "screenshot"+"//" + projectName+"//"+ testCase ;
		screenshotPath = System.getProperty("user.dir") + "/test-output/Screenshots"+ "//" + projectName+"//"+ testCase;
		screenshotFileName = testCase + "_Screenshot_"+customText +"_"+dateNow + ".jpg";
		
		//screenshot taking lines this line is to capture screenshot  
				File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);  
				
				desiredName = screenshotPath+ "//"+ screenshotFileName ;
				File destFile = new File(desiredName);

				//to save the screenshot  
				try {
					FileUtils.copyFile(scrFile, destFile);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
		
		
	}



}  
