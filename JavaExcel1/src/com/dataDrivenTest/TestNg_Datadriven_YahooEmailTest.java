package com.dataDrivenTest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.utility.TestUtil;

public class TestNg_Datadriven_YahooEmailTest {
	
static WebDriver driver;	

@BeforeMethod
public void setup() {

System.setProperty("webdriver.chrome.driver", "D:\\Kartik_Eclipes_Projects\\chromedrive\\chromedriver.exe");
driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().deleteAllCookies();
driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
driver.navigate().to("http://register.rediff.com/register/register.php?FormName=user_details");

}

@DataProvider
public Iterator <Object [] > getTestData(){
ArrayList<Object []> testdata=	TestUtil.getDataFromExcel();
return testdata.iterator();
}

@Test (dataProvider ="getTestData")
public void YahooEmailTest_registPage(String firstname, String Surname, String Password , String MobileNumber) {
	
	
//  Enter data in Web Element
	driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[3]/td[3]/input")).clear();
	driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[3]/td[3]/input")).sendKeys(firstname);
	
	driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[1]")).clear();
	driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[1]")).sendKeys(Surname);
			
		      
	driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[9]/td[3]/input")).clear();
	driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[9]/td[3]/input")).sendKeys(Password);
				
	
	driver.findElement(By.xpath("//*[@id=\"mobno\"]")).clear();
	driver.findElement(By.xpath("//*[@id=\"mobno\"]")).sendKeys(MobileNumber);
			
}


@AfterMethod
public void teardown() {
driver.quit();
}

}
