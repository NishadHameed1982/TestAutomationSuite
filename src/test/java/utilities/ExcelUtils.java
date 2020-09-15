package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;


import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Reporter;

import constants.AppiumConstant;


public class ExcelUtils {

	private static XSSFSheet ExcelWSheet;

	private static XSSFWorkbook ExcelWBook;

	private static XSSFCell xCell;

	private static XSSFRow xRow;

	//This method is to set the File path and to open the Excel file, Pass Excel Path and Sheetname as Arguments to this method

	public static void setExcelFile(String Path,String SheetName) throws Exception {

		try {

			// Open the Excel file

			FileInputStream ExcelFile = new FileInputStream(Path);

			//Access the required test data sheet

			ExcelWBook = new XSSFWorkbook(ExcelFile);

			ExcelWSheet = ExcelWBook.getSheet(SheetName);

		} catch (Exception e){

			throw (e);

		}

	}

	//This method is to read the test data from the Excel cell, in this we are passing parameters as Row num and Col num

	public static String getCellData(int RowNum, int ColNum) throws Exception{

		try{

			xCell = ExcelWSheet.getRow(RowNum).getCell(ColNum);

			String CellData = xCell.getStringCellValue();

			return CellData;

		}catch (Exception e){

			return"";

		}

	}


	//This method is to read the test data from the Excel cell, in this we are passing parameters as Row num and Col num

	public static double getCellDataint(int RowNum, int ColNum) throws Exception{


		xCell = ExcelWSheet.getRow(RowNum).getCell(ColNum);

		double CellData = xCell.getNumericCellValue();

		return CellData;



	}

	//This method is to write in the Excel cell, Row num and Col num are the parameters

	public static void setCellData(String Result,  int RowNum, int ColNum , String path , String filename ) throws Exception {

		try{

			xRow  = ExcelWSheet.getRow(RowNum);

			xCell = xRow.getCell(ColNum, org.apache.poi.ss.usermodel.Row.MissingCellPolicy.RETURN_BLANK_AS_NULL);

			if (xCell == null) {

				xCell = xRow.createCell(ColNum);

				xCell.setCellValue(Result);

			} else {

				xCell.setCellValue(Result);

			}

			// Constant variables Test Data path and Test Data file name

			FileOutputStream fileOut = new FileOutputStream(path + filename);

			ExcelWBook.write(fileOut);

			fileOut.flush();

			fileOut.close();

		}catch(Exception e){

			throw (e);

		}

	}


	//This method is to write in the Excel cell, Row num and Col num are the parameters

	public static void setCellDataint(int Result,  int RowNum, int ColNum , String path , String filename ) throws Exception {

		try{

			xRow  = ExcelWSheet.getRow(RowNum);

			xCell = xRow.getCell(ColNum, org.apache.poi.ss.usermodel.Row.MissingCellPolicy.RETURN_BLANK_AS_NULL);

			if (xCell == null) {

				xCell = xRow.createCell(ColNum);

				xCell.setCellValue(Result);

			} else {

				xCell.setCellValue(Result);

			}

			// Constant variables Test Data path and Test Data file name

			FileOutputStream fileOut = new FileOutputStream(path + filename);

			ExcelWBook.write(fileOut);

			fileOut.flush();

			fileOut.close();

		}catch(Exception e){

			throw (e);

		}
		
	

	}
	
	
	
	//This method is to write in the Excel cell, Row num and Col num are the parameters

	public static void setCellData(String Result,  int RowNum, int ColNum , String fileAbsolutePath ) throws Exception {

		try{

			xRow  = ExcelWSheet.getRow(RowNum);

			xCell = xRow.getCell(ColNum, org.apache.poi.ss.usermodel.Row.MissingCellPolicy.RETURN_BLANK_AS_NULL);

			if (xCell == null) {

				xCell = xRow.createCell(ColNum);

				xCell.setCellValue(Result);

			} else {

				xCell.setCellValue(Result);

			}

			// Constant variables Test Data path and Test Data file name

			FileOutputStream fileOut = new FileOutputStream(fileAbsolutePath);

			ExcelWBook.write(fileOut);

			fileOut.flush();

			fileOut.close();

		}catch(Exception e){

			throw (e);

		}

	}



	public  static void copyFileUsingApacheCommonsIO(File source, File dest) throws IOException {
		FileUtils.copyFile(source, dest);
	}

	public  static void cutFileUsingApacheCommonsIO(File source, File dest) throws IOException {
		
		System.out.println("I am inside movefile");
		FileUtils.moveFile(source, dest);
	}

	public static void copyResultFileWithTimeStamp() throws IOException {
		Reporter.log("Copy entire test result to the Test Result Excel Sheet");
		File file = new File(AppiumConstant.destFileLocation);
		Calendar currentDate = Calendar.getInstance();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MMM/dd HH:mm:ss");
		String dateN = formatter.format(currentDate.getTime()).replace("/","_");
		String dateNow = dateN.replace(":","_");
		File resultFile = new File(AppiumConstant.appDir, "testResult/" + AppiumConstant.testInputFileName + "_"+ dateNow + ".xlsx");
		ExcelUtils.copyFileUsingApacheCommonsIO(AppiumConstant.destFile , resultFile);
	}



}
