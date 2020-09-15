package constants;

import org.openqa.selenium.By;

public class AppiumEmaarOneNewSRScreenRepo {
	
	public static final String allowPopupXpath = "//android.widget.Button[@text='ALLOW']";
	public static By AllowPopupButton = By.xpath(AppiumEmaarOneNewSRScreenRepo.allowPopupXpath);

	public static final String recordButtonXpath = "//android.widget.ImageView[@index='0']";
	public static By RecordButton = By.xpath(AppiumEmaarOneNewSRScreenRepo.allowPopupXpath);

	//public static final String addCommentsXpath = "//android.view.ViewGroup[@index='5']";
	//public static final String addCommentsXpath = "//android.widget.EditText[@text='Add Comments/Photos']";
	//public static final String addCommentsXpath = "//android.widget.TextView[@text='Tell us about your service request or attach a photo.']";
	public static final String addCommentsXpath = "//android.widget.EditText[@text='Add Comments/Photos']";
	public static By AddComments = By.xpath(AppiumEmaarOneNewSRScreenRepo.addCommentsXpath);

	public static final String addCustomerCommentsXpath = "//android.view.ViewGroup[@index='0']/android.widget.TextView[@text='Tell us about your service request or attach a photo.']";
	public static By AddCustomerComments = By.xpath(AppiumEmaarOneNewSRScreenRepo.addCustomerCommentsXpath);

	public static final String addCommentsTextFieldXpath = "//android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='1']/android.widget.EditText[@text='Add Comments/Photos']";
	public static By AddCommentsTextField = By.xpath(AppiumEmaarOneNewSRScreenRepo.addCommentsTextFieldXpath);

	public static final String doneButtonXpath = "//android.view.ViewGroup[@index='1']/android.view.ViewGroup[@index='0']/android.widget.TextView[@text='Done']";
	public static By DoneButton = By.xpath(AppiumEmaarOneNewSRScreenRepo.doneButtonXpath);

	public static final String submitButtonXpath = "//android.view.ViewGroup[@index='2']/android.view.ViewGroup[@index='0']/android.widget.TextView[@text='Submit']";
	public static By SubmitButton = By.xpath(AppiumEmaarOneNewSRScreenRepo.submitButtonXpath);

	//	
	//	
	//	public static final String closeButton = "Close";


}
