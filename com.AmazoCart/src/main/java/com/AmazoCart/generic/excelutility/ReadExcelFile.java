package com.AmazoCart.generic.excelutility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.AmazoCart.generic.common.FrameworkConstant;

public class ReadExcelFile implements FrameworkConstant{
	FileInputStream fis;
	FileOutputStream fos;
	Workbook wb;
	public String readdata (String sheet,int row, int column) {
		try {
			fis = new FileInputStream(ExcelPath);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		
		//Create the Workbook
		try {
			wb = WorkbookFactory.create(fis);
		} catch (Exception e) {
		e.printStackTrace();
		}
		
		String data = wb.getSheet(sheet).getRow(row).getCell(column).getStringCellValue();
		return data;
		
	}
	public void writedata(String sheet,int row, int column, String data) throws EncryptedDocumentException, IOException {
		try {
			fis = new FileInputStream(ExcelPath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		//Create the Workbook
		wb = WorkbookFactory.create(fis);
		
		//Create a new column and Write Data on it
		wb.getSheet(sheet).getRow(row).createCell(column).setCellValue(data);
		
		//Convert java data into Physical File
		fos = new FileOutputStream("");
		
		//Write the Data
		wb.write(fos);
		
		//Close the Workbook
		wb.close();
	}
	
	public void displaydata(String sheet, int row, int column) {
		// Convert the physical Excel File into Java understandable
		try {
			fis = new FileInputStream(ExcelPath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		//create the workbook
		try {
			wb = WorkbookFactory.create(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
		// Using Workbook go to Sheet, row , column and cell fetch the Data
		String data = wb.getSheet(sheet).getRow(row).getCell(column).getStringCellValue();
		
		// Print the data
		System.out.println(data);
	}
	
	public void displaymultipledata(String sheet, int column) {
		//convert the physical Excel File into Java understandable
		try {
			fis = new FileInputStream(ExcelPath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();	
		}
		
		// create the workbook
		try {
			wb = WorkbookFactory.create(fis);
		} catch (EncryptedDocumentException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		//Using WBBook go to sheet
		Sheet sht = wb.getSheet(sheet);
		
		int count = sht.getLastRowNum();
		
		for (int i = 1; i <= count; i++) {
			//optimized code
			String data = wb.getSheet(sheet).getRow(i).getCell(column).getStringCellValue();
			System.out.println(data);
		}
	}
	

}
