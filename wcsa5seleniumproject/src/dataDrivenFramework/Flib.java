package dataDrivenFramework;

import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {

		// To store generic reusable methods
		// All the methods are non-static
	
	
	//It is used to read a data from the excel sheet...
	 public String readExcelData(String excelPath,String sheetName,int rowCount,int cellCount) throws EncryptedDocumentException, IOException
	 {
		 FileInputStream fis = new FileInputStream(excelPath);  //Provide the path of file
		 Workbook wb = WorkbookFactory.create(fis);  //make the file for ready to read
		 Sheet sheet = wb.getSheet(sheetName); //get into the sheet
		 Row row = sheet.getRow(rowCount); //get into the desired row
		 Cell cell = row.getCell(cellCount);  //get into the desired cell/column
		 String data = cell.getStringCellValue();  //read the value from cell
		 return data;
	 }
	 
	 //It is used to get last count of row where we store the data
	 public int getLastRowCount(String excelPath,String sheetName) throws EncryptedDocumentException, IOException
	 {
		 FileInputStream fis = new FileInputStream(excelPath); //Provide the path of the file 
		 Workbook wb = WorkbookFactory.create(fis);  //make the file for ready to read
		 Sheet sheet = wb.getSheet(sheetName); //get into the sheet
		 int rc = sheet.getLastRowNum();   //Read the last row count
		 return rc;	 
		 
	 }
	 
	 //It is used to write the data into excel sheet
	 public void writeExcelData(String excelPath,String sheetName,int rowCount, int cellCount,String data) throws EncryptedDocumentException, IOException
	 {
		 FileInputStream fis = new FileInputStream(excelPath); //Provide the path of the file
		 Workbook wb = WorkbookFactory.create(fis);  //make the file for ready to read
		 Sheet sheet = wb.getSheet(sheetName);  //get into the sheet
		 Row row = sheet.getRow(rowCount);  //Pass the row count
		 Cell cell = row.createCell(cellCount); // get the cell count 
		 cell.setCellValue(data);  //pass the string args as data

	     FileOutputStream fos = new FileOutputStream(excelPath);
	     wb.write(fos);
	
	 }
		
}

//getlast row num ---RR integer

//all the methods are generic reusable method





//To read a data from excel sheet...thats why create the flib class
//return---called to calling 
//Flib:file liabrary ....all the methods are non static

