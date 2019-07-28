package Practise_Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBasic_FileUpload {

	static WebDriver driver;
	
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver" ,"D:\\Kartik_Eclipes_Projects\\chromedrive\\chromedriver.exe");
	
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	driver.get("https://html.com/input-type-file/");
	driver.findElement(By.xpath("//*[@name='fileupload']")).sendKeys("C:\\Users\\kkumar\\Desktop\\Test.html");
	
	

	}

}
