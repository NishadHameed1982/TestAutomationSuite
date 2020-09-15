package utilities;

import java.util.ArrayList;

import constants.AppiumConstant;

public class AppiumTestCasePreCondition {
	
	public static ArrayList<String> testCaseRowValues(String testName , int colNumberMax , int rowNumber) throws Exception
	{
		ArrayList<String> cellValue = new ArrayList<String>();
		
		ExcelUtils.setExcelFile(AppiumConstant.destFileLocation , testName);
		//Read data from the excel sheet and assign it to ArrayList
		for (int colNumber = 0; colNumber<= colNumberMax ;colNumber++)
		{
			cellValue.add(colNumber, ExcelUtils.getCellData(rowNumber, colNumber));
		}
		
		return cellValue;
	}

}
