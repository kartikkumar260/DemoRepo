package com.dataDrivenTest;

import com.excel.utility.Xls_Reader;

public class ExcelOperation {

	public static void main(String[] args) {
	
	// loading existing excel sheet	
	Xls_Reader reader = new Xls_Reader("D:\\kkumar\\eclipse-workspace\\JavaExcel1\\src\\com\\testData\\YahooEmailTestData2.xlsx");
	
	// case 1 => Adding new sheet "homepage" to existing excelsheet.
	
	if(!reader.isSheetExist("Homepage")) {
		reader.addSheet("Homepage");
		
	// case 2 =>need fetch number of columns that exist in exce sheet
		
	int collcount= reader.getColumnCount("RegTestData");
	System.out.println("Total columns that exist in given sheett ===>"+collcount);
	
	// case3 => fetch exact row number
	
	int rowNumber =reader.getCellRowNum("RegTestData","Surname", "t");
	System.out.println(rowNumber);	
	}
	}

}
