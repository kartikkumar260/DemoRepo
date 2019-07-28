package com.test.utility;

import java.util.ArrayList;

import com.excel.utility.Xls_Reader;

public class TestUtil {

static Xls_Reader reader;


public static ArrayList<Object[]> getDataFromExcel(){
	
	ArrayList<Object[]> myData = new ArrayList<Object[]>();
	
	try {
		// Rule => Provide path of 'Yahoo Email Test Data'.
		reader =new Xls_Reader("D:\\kkumar\\eclipse-workspace\\JavaExcel1\\src\\com\\testData\\YahooEmailTestData.xlsx");
	} catch(Exception e) {
		e.printStackTrace();
	}
	
	for (int rownum=2; rownum<=reader.getRowCount("RegTestData"); rownum++) {
		
	String firstname =reader.getCellData("RegTestData", "Firstname", rownum);
	String Surname= reader.getCellData("RegTestData", "Surname", rownum);
	String Password= reader.getCellData("RegTestData", "Password", rownum);
	String MobileNumber=reader.getCellData("RegTestData", "MobileNumber", rownum);
	
	
	// Rule => In array object collect all webElement in sequential order. Always follow insertion of webelement in sequence order.
	
	Object ob[] = {firstname ,Surname ,Password,MobileNumber};
	
	
	// Rule => All above object array in myData(Arraylist).
	myData.add(ob);
	}
	return myData;
    }


}
