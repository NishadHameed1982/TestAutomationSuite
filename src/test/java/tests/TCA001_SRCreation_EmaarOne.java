package tests;
import java.lang.reflect.Method;
import java.util.ArrayList;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentTest;

import constants.AppiumConstant;
import constants.AppiumEmaarOneRequestDetailsScreenRepo;
import pages.AppiumEmaarOneHomeScreen;
import pages.AppiumEmaarOneLoginScreen;
import pages.AppiumEmaarOneLogout;
import pages.AppiumEmaarOneNewSRScreen;
import pages.AppiumEmaarOnePropertySelectionScreen;
import pages.AppiumEmaarOneRaiseSRScreen;
import pages.AppiumEmaarOneRequestDetailsScreen;
import pages.BasePage;
import utilities.AppiumInitDriver;
import utilities.AppiumTestCasePreCondition;
import utilities.ExcelUtils;
import utilities.MultiScreenShot;
import utilities.TestExecutionTime;


public class TCA001_SRCreation_EmaarOne extends BasePage {

	@Test (priority = 0 , description = "Test Case 001")
	public void TCA001_SRCreation(Method method) throws Throwable {


		SoftAssert softAssert = new SoftAssert();

		String testCase = "TCA001_SRCreation";
		Boolean finalTestStatus = true;
		

		report = extent.createTest("TCA001_SRCreation", "Test case to create new service request.");
		report.info("TEST CASE: TCA001_SRCreation execution started");

		//Test input from excel sheet - will accept max 1000 input 
		for (int rowNum = 3;rowNum < 1000 ; rowNum++ )
		{
			///////////////////////////////////////////LOCAL VARIABLES////////////////////////////////////////////////////

			String testStatus = "PENDING";
			String resultText = null;
			long startTime = System.currentTimeMillis();
			int colNumberMax = 60 ; // Number of Columns

			String testCaseDataSet = "TCA001_SRCreation -" + "Data Set " + (rowNum-2);
			String requestNo = null;
			String submittedDate = null;
			String unitDetails = null;

			ArrayList<String> cellValue = new ArrayList<String>();

			//Read the entire row data as save it to arraylist "cellValue"
			cellValue = AppiumTestCasePreCondition.testCaseRowValues(testCase, colNumberMax, rowNum);

			String firstCellValue = cellValue.get(0);
			//Exit test case execution loop if the first cell value is empty
			if ((firstCellValue == null) || (ExcelUtils.getCellData(rowNum, 0).equals(""))||(firstCellValue == "SKIPALL") || (firstCellValue.equalsIgnoreCase("SKIPALL"))) break;
			else firstCellValue = firstCellValue.toUpperCase();
			//Move to next iteration if the first column value is NO
			if ((firstCellValue == "NO") || (firstCellValue.equals("NO"))) continue;

			/////////////////////////////////////////////////TEST CASE BODY //////////////////////////////////////////////////////

			try {

				String timeStamp = TestExecutionTime.testExecutionTime();
				report.info("Test execution started for "+ testCaseDataSet );

				//Set Mobile Driver
				report.info("Set Mobile Driver");
				androidDriver = AppiumInitDriver.setMobileDriver(cellValue.get(1), cellValue.get(2));


				//Login to EmaarOne Application
				report.info("Login to EmaarOne Application");
				androidDriver = AppiumEmaarOneLoginScreen.loginEmaarOne(androidDriver, cellValue.get(3), cellValue.get(4));


				//Click Raise Service Request from the Home Screen
				report.info("Click Raise Service Request from the Home Screen");
				androidDriver = AppiumEmaarOneHomeScreen.selectRaiseServiceReq(androidDriver);



				//Click the Property from the list against which user wants to raise service request
				report.info("Click the Property from the list against which user wants to raise service request");
				androidDriver = AppiumEmaarOnePropertySelectionScreen.clickProperty(androidDriver , cellValue.get(5));


				//Click on Raise Service Request Button
				androidDriver = AppiumEmaarOneRaiseSRScreen.clickRaiseSR(androidDriver);
				report.info("Click on Raise Service Request Button");

				androidDriver = AppiumEmaarOneNewSRScreen.addCustomerComments(androidDriver, cellValue.get(6));
				report.info("Add customer comments");

				androidDriver = AppiumEmaarOneNewSRScreen.submitRequest(androidDriver);
				report.info("Click submit request button");

				//Verify the presence of the success message
				boolean isElementPresent = waitForPresence(androidDriver, AppiumEmaarOneRequestDetailsScreenRepo.SuccessMessage , 30);
				report.info("Verify the presence of the success message");

				if(isElementPresent == true)
				{

					MultiScreenShot.MobileScreenShot(projectName, testCase, androidDriver, "SRCreatedSuccessfully");

					//Test Passed since the success message is in the Service Request Details screen
					testStatus = "PASSED";
					resultText = "SR created successfully";
					report.pass("SR created successfully");
					softAssert.assertTrue(testStatus == "PASSED");


					//Get Request Number
					requestNo = AppiumEmaarOneRequestDetailsScreen.getRequestNo(androidDriver);
					report.info("Request Number: "+ requestNo);

					//Get Submitted Date
					submittedDate = AppiumEmaarOneRequestDetailsScreen.getSubmittedDate(androidDriver);
					report.info("Submitted Date: "+ submittedDate);

					//Get Unit Details
					unitDetails = AppiumEmaarOneRequestDetailsScreen.getLocationCode(androidDriver);
					report.info("Unit Details: "+ unitDetails);

					finalTestStatus = finalTestStatus&&true;


				}

				else 
				{
					//Screenshot
					MultiScreenShot.ScreenShot(projectName, testCase, androidDriver, "FailedScreen");

					//Test failed since the success message is not in the Service Request Details screen
					testStatus = "FAILED";
					resultText = "Some issue in SR creation";
					report.fail("Some issue in SR creation");
					softAssert.fail(resultText);
					finalTestStatus = finalTestStatus&&false;

				}

				//Click Home Button
				androidDriver = AppiumEmaarOneRequestDetailsScreen.clickHomeButton(androidDriver);
				report.info("Click Home Button");

				//Close Emaar One App
				AppiumEmaarOneLogout.logout(androidDriver , cellValue.get(1));
				report.info("Close Emaar One App");
				

				//Execution Time Calc
				String totalTime = TestExecutionTime.testDuration(startTime);

				report.info("Test Case : " + testCase);
				report.info("Tested App File :" + cellValue.get(1).toUpperCase());
				report.info("Test Platform : " + cellValue.get(2).toUpperCase());
				report.info("Test Start Time : " + timeStamp);
				report.info("Test Execution Time : " + totalTime);

				//Write test output to Excel Sheet
				ExcelUtils.setCellData(timeStamp, rowNum, 7 , AppiumConstant.destFileLocation);
				ExcelUtils.setCellData(totalTime, rowNum, 8 , AppiumConstant.destFileLocation);
				ExcelUtils.setCellData(testStatus, rowNum, 9, AppiumConstant.destFileLocation);
				ExcelUtils.setCellData(resultText, rowNum, 10, AppiumConstant.destFileLocation);
				ExcelUtils.setCellData(requestNo, rowNum, 11, AppiumConstant.destFileLocation);
				ExcelUtils.setCellData(submittedDate, rowNum, 12, AppiumConstant.destFileLocation);
				ExcelUtils.setCellData(unitDetails, rowNum, 13, AppiumConstant.destFileLocation);

			}

			catch(Exception e)
			{

//				//Screenshot
//				MultiScreenShot.MobileScreenShot(projectName, testCase, androidDriver, "FailedScreen");

				//TEST CASE FAILED
				testStatus = "FAILED";
				resultText = "Test execution has stopped : Error Message :  " + e.getMessage();
				report.fail(resultText);
				ExcelUtils.setCellData(testStatus, rowNum, 9, AppiumConstant.destFileLocation);
				ExcelUtils.setCellData(resultText, rowNum, 10, AppiumConstant.destFileLocation);
				androidDriver.closeApp();
				report.createNode(resultText);
				softAssert.fail(resultText);
			}
		}
		//Apply assert for all the test inputs
		softAssert.assertAll();
	}

}




