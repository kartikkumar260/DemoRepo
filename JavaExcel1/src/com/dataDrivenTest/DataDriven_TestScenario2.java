package com.dataDrivenTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.excel.utility.Xls_Reader;

//Scenario => Fetching data from ALL rows of excel sheet.

// Problem => it is launching four browser . Since Step3(webdriver code) is defined under four loop.
// Solution => Step3 (webdriver code) must be written outside four loop

public class DataDriven_TestScenario2 {

	
	static WebDriver driver;
	public static void main(String[] args) {
		
	
	// Step 1 => Get data from excel sheet
	Xls_Reader reader = new Xls_Reader("D:\\kkumar\\eclipse-workspace\\JavaExcel1\\src\\com\\testData\\YahooEmailTestData.xlsx");
	int rowcount= reader.getRowCount("RegTestData");
	
	// Step2 => Parameterization 
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
		
		// Step 3 => WebDriver code -----------------------------------------------------------------------------
		System.setProperty("webdriver.chrome.driver", "D:\\\\Kartik_Eclipes_Projects\\\\chromedrive\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
		
	   // Step 4 => Enter data in Web Element 
		driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[3]/td[3]/input")).sendKeys(firstname);
		driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[1]")).sendKeys(Surname);
		driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[9]/td[3]/input")).sendKeys(Password);
		driver.findElement(By.xpath("//*[@id=\"mobno\"]")).sendKeys(MobileNumber);
		
				
	}

	}

}
