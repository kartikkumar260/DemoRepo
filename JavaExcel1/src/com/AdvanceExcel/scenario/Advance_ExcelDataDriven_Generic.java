package com.AdvanceExcel.scenario;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
/*
 * Below described scenario id HARDCORDER.
 */


/*
 1.	Identify Testcases column by scanning the entire 1st row.
 2.	Once column is identified the scan entire testcase column to identify “Purchase” testcase row.
 3.	After you grab purchase testcase row = Pull all the data of that row and feed into test.

 */

public class Advance_ExcelDataDriven_Generic {
	
	
	public ArrayList<String> getData(String testcasename , String sheetname) throws IOException {
		
		
	ArrayList<String> a= new ArrayList<String>();
	
	//fetch required excel sheet using FileInputStream.
	
	FileInputStream fis= new FileInputStream("D:\\kkumar\\eclipse-workspace\\JavaExcel1\\src\\com\\testData\\SampleTestData.xlsx");
	XSSFWorkbook wb= new XSSFWorkbook(fis);
	
	int sheets =wb.getNumberOfSheets();
	
	for (int i=0; i<=sheets;i++) 
	{
		if(wb.getSheetName(i).equalsIgnoreCase(sheetname));
		{
		XSSFSheet sheet= wb.getSheetAt(i);
		
		// 1.	Identify Testcases column by scanning the entire 1st row.
	Iterator<Row>row= sheet.iterator();// sheet is collection of rows. Hence we are iterating rows here.

	Row firstRow=row.next(); // 1st row is fetched successfully
	
	Iterator<Cell> ce=firstRow.cellIterator();// 1st row is collection of cells. Hence we are iterating cells here.
	int k=0;
	int column=0;
	while (ce.hasNext()) {
	Cell value=ce.next();
	if(value.getStringCellValue().equalsIgnoreCase(testcasename))
	{
		column=k;
	}
	k++;
	}
	
	System.out.println("TestCase column index number ===>"+column);
	
	// 2.	Once column is identified the scan entire testcase column to identify “Purchase” testcase row.
	while(row.hasNext())
	{
	Row r =row.next();
	
	
	if(r.getCell(column).getStringCellValue().equalsIgnoreCase("Purchase"))  // specify column index found above.
	{
		
    // 3.	After you grab purchase testcase row = Pull all the data of that row and feed into test.
	Iterator<Cell> cv1=r.cellIterator();
	while(cv1.hasNext())
	{
	String celltextvalue =cv1.next().getStringCellValue();
	System.out.println(celltextvalue);
	
	}
	}
	}
	}
	}
	return a;
	}
	}
/*
	public static void main(String[] args) throws IOException {
	
	// fetch required excel sheet using FileInputStream.
	FileInputStream fis = new FileInputStream("D:\\kkumar\\eclipse-workspace\\JavaExcel1\\src\\com\\testData\\SampleTestData.xlsx");
	
	XSSFWorkbook wb = new XSSFWorkbook(fis);
	
	int sheets=wb.getNumberOfSheets();
	
	for (int i=0; i<=sheets;i++) 
	{
		if(wb.getSheetName(i).equalsIgnoreCase("RegTestData"));
		{
		XSSFSheet sheet= wb.getSheetAt(i);
		
		// 1.	Identify Testcases column by scanning the entire 1st row.
		Iterator<Row>row= sheet.iterator();// sheet is collection of rows. Hence we are iterating rows here.
	
		Row firstRow=row.next(); // 1st row is fetched successfully
		
		Iterator<Cell> ce=firstRow.cellIterator();// 1st row is collection of cells. Hence we are iterating cells here.
		int k=0;
		int column=0;
		while (ce.hasNext()) {
		Cell value=ce.next();
		if(value.getStringCellValue().equalsIgnoreCase("TestCase"))
		{
			column=k;
		}
		k++;
		}
		
		System.out.println("TestCase column index number ===>"+column);
		
		// 2.	Once column is identified the scan entire testcase column to identify “Purchase” testcase row.
		while(row.hasNext())
		{
		Row r =row.next();
		
		
		if(r.getCell(column).getStringCellValue().equalsIgnoreCase("Purchase"))  // specify column index found above.
		{
			
	    // 3.	After you grab purchase testcase row = Pull all the data of that row and feed into test.
		Iterator<Cell> cv1=r.cellIterator();
		while(cv1.hasNext())
		{
		String celltextvalue =cv1.next().getStringCellValue();
		System.out.println(celltextvalue);
		
		}
		}
		}
		}
		
		
	
		
		
		}
	}

	}
*/

