package com.dataDrivenTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.excel.utility.Xls_Reader;

//  Scenario => Fetching data from first row of excel sheet.
public class DataDrivenTest {
	
	static WebDriver driver;

	public static void main(String[] args) {
	
		// Step 1 => Fetch first row data from 'YahooEmailTestData' files. 
		Xls_Reader reader = new Xls_Reader("D:\\kkumar\\eclipse-workspace\\JavaExcel1\\src\\com\\testData\\YahooEmailTestData.xlsx");
		
		String fullname=reader.getCellData("RegTestData", "Firstname", 2);
		System.out.println(fullname);
		
		String Rediffemail=reader.getCellData("RegTestData", "Surname", 2);
		System.out.println(Rediffemail);
		
		String Password=reader.getCellData("RegTestData", "Password", 2);
		System.out.println(Password);
		
		String MobileNumber=reader.getCellData("RegTestData", "MobileNumber", 2);
		System.out.println(MobileNumber);
		
		
		// Step 2 => Launch chrome driver and pass required url in it.
		
		System.setProperty("webdriver.chrome.driver", "D:\\\\Kartik_Eclipes_Projects\\\\chromedrive\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//driver.navigate().to("https://login.yahoo.com/account/create?src=fpctx&intl=in&lang=en-IN&done=https%3A%2F%2Fin.yahoo.com&specId=yidReg");
		driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
		
		// Step 3 => Write xpath of all required Webelement and pass values defined in Step1
		driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[3]/td[3]/input")).sendKeys(fullname);
		driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[1]")).sendKeys(Rediffemail);
		driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[9]/td[3]/input")).sendKeys(Password);
		driver.findElement(By.xpath("//*[@id=\"mobno\"]")).sendKeys(MobileNumber);
		
	

	}

}
