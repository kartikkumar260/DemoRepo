import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//Cimport io.github.bonigarcia.wdm.WebDriverManager;

public class test {
	public static WebDriver driver ;
	protected static String browserName="";
	
	public static void main(String[] args) {
		 String CH, IE,Z;
		 System.out.println("Enter browser @at runtime");
		 Scanner in = new Scanner(System.in) ;
		 
		 CH =in.next();
		 Z= CH;
		 
		 System.out.println("Selected browser is @ ==>  "+Z);
		 if(browserName.equals(Z))
			{
			 System.out.println("select browser is chrome");
			//	System.setProperty("webdriver.chrome.driver","D:\\Kartik_Eclipes_Projects\\chromedrive\\chromedriver.exe");
				
			}
			else if(browserName.equals("IE"))
			{
				System.setProperty("webdriver.ie.driver","D:\\Kartik_Eclipes_Projects\\chromedrive\\chromedriver.exe");
				driver = new InternetExplorerDriver();
			}
			else 
			{
				System.out.println("Driver not launched. Please check browser varibale or path");
			}
		 System.setProperty("webdriver.chrome.driver","D:\\Kartik_Eclipes_Projects\\chromedrive\\chromedriver.exe");
		 driver = new ChromeDriver();
		    driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get("https://www.zoho.com/");

		}
	
}