package constants;
import java.io.File;

public class AppiumConstant {
	//Update the Test input file name based on the test cases 
	public static String testInputFileName = "TestCases_Appium_EmaarOneRN";
	
	public static File appDir = new File("src");
	public static File sourceFile = new File(appDir, "test/java/testInput/" + testInputFileName + ".xlsx");
	public static File destFile = new File(appDir, "test/java/testResult/" + testInputFileName + ".xlsx");
	public static final String sourceFileLocation =	sourceFile.getAbsolutePath();
	public static final String destFileLocation =	destFile.getAbsolutePath();
	
	
}

