package utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

public class HtmlFunctions {
	
	


	public static void dropdownList(WebElement webElement , String  dropdownValue) throws Exception
	{
		boolean dropdownValueAvailable = false;
		Select mySelectSRCntrlArea = new Select(webElement);
		Thread.sleep(3000);
		for(int i=0 ;i<mySelectSRCntrlArea.getOptions().size(); i++)
		{
			String srCntrlArea = mySelectSRCntrlArea.getOptions().get(i).getText();
			if (srCntrlArea.contains(dropdownValue))
			{
				mySelectSRCntrlArea.selectByVisibleText(dropdownValue);
				Reporter.log("Selected dropdown list value is : " + dropdownValue + "   - Dropdown Box");
				dropdownValueAvailable = true;
				break;
			}

		}
		
		if(dropdownValueAvailable == false)
		{
			Reporter.log("Provided dropdown value is not available in the dropdown list. Value provided is :  " + dropdownValue);
			
		}
	}
	
	
	public static void dropdownList(WebElement webElement , int  dropdownindex) throws Exception
	{
		boolean dropdownValueAvailable = false;
		Select mySelect = new Select(webElement);
		for(int i=0 ;i<mySelect.getOptions().size(); i++) {
			if (i == dropdownindex)
			{
				String dropDown = mySelect.getOptions().get(i).getText();
				Reporter.log("Select the dropdown , provided dropdown value is " + dropDown);
				mySelect.selectByIndex(i);
				dropdownValueAvailable = true;
				break;
			}
		}
		
		if(dropdownValueAvailable == false)
		{
			Reporter.log("Provided dropdown index is not available in the dropdown list. Value provided is :  " + dropdownindex);
			
		}
	}


}
