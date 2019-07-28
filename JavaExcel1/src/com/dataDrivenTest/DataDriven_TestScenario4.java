package com.dataDrivenTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.excel.utility.Xls_Reader;


//problem => still all the data of excel sheet is written in one single line?

//solution => under step4 (enter data) we need to clear all webelements that are defined there.
public class DataDriven_TestScenario4 {

	static WebDriver driver;
	public static void main(String[] args) {
		
		// Step 1 => WebDriver code
		System.setProperty("webdriver.chrome.driver", "D:\\\\Kartik_Eclipes_Projects\\\\chromedrive\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.navigate().to("http://register.rediff.com/register/register.php?FormName=user_details");

	// Step 2 => Get data from excel sheet
	Xls_Reader reader = new Xls_Reader("D:\\kkumar\\eclipse-workspace\\JavaExcel1\\src\\com\\testData\\YahooEmailTestData.xlsx");
	int rowcount= reader.getRowCount("RegTestData");
	
	// Step3 => Parameterization 
	for (int rowNum =2 ; rowNum<=rowcount; rowNum++ ) {
		
		System.out.println("*******************************************");
		
		String firstname=reader.getCellData("RegTestData", "Firstname", rowNum);
		System.out.println(firstname);
		
		String Surname=reader.getCellData("RegTestData", "Surname", rowNum);
		System.out.println(Surname);
		
		String Password=reader.getCellData("RegTestData", "Password", rowNum);
		System.out.println(Password);
		
		String MobileNumber=reader.getCellData("RegTestData", "MobileNumber", rowNum);
		System.out.println(MobileNumber);
		
	
	   // Step 4 => Enter data in Web Element
		
		//  Rule=> Clear webelement for next loop --------------------------------------------------------------------
		driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[3]/td[3]/input")).clear();
		driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[3]/td[3]/input")).sendKeys(firstname);
				
	    //  Rule=> Clear webelement for next loop ---------------------------------------------------------------------
		driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[1]")).clear();
		driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[1]")).sendKeys(Surname);
		
	     //  Rule=> Clear webelement for next loop -------------------------------------------------------------------
		driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[9]/td[3]/input")).clear();
		driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[9]/td[3]/input")).sendKeys(Password);
			
	     //  Rule=> Clear webelement for next loop -------------------------------------------------------------------
		driver.findElement(By.xpath("//*[@id=\"mobno\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"mobno\"]")).sendKeys(MobileNumber);
				
	}

	}

}
