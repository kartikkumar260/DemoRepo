package Practise_Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBasicCommonds {
	
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		
	System.setProperty("webdriver.chrome.driver", "D:\\Kartik_Eclipes_Projects\\chromedrive\\chromedriver.exe");
	
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.get("http://artoftesting.com");
	
	String Currenturl=driver.getCurrentUrl();
	System.out.println("url of given site"+Currenturl);
	
	String title=driver.getTitle();
	System.out.println("title of given site"+title);
	
	String Pagesource= driver.getPageSource();
	System.out.println("Entire Page source of this site is displayed below");
	//System.out.println(Pagesource);
	
	
	}

}
