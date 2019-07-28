package com.AdvanceExcel.scenario;

import java.io.IOException;
import java.util.ArrayList;

public class Test_Advance_ExcelDataDriven_Generic {

	public static void main(String[] args) throws IOException {
	
		Advance_ExcelDataDriven_Generic ob = new Advance_ExcelDataDriven_Generic();
		ArrayList<String>data =ob.getData("TestCase","RegTestData" );
		System.out.println(data.get(0));
		System.out.println(data.get(1));
		System.out.println(data.get(2));
		System.out.println(data.get(3));

	}

}
