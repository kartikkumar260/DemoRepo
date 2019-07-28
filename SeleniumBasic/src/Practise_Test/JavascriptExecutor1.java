package Practise_Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutor1 {
	static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:/Kartik_Eclipes_Projects/chromedrive/chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.navigate().to("https://www.zoho.com/");
	}
	public static void refreshBrowserByJs(WebDriver driver) 
	{
		JavascriptExecutor js =((JavascriptExecutor)driver);
		js.executeScript("history(0)");	
     }
	public static String getTitleByJs(WebDriver driver) {
		JavascriptExecutor js=((JavascriptExecutor)driver);
		String title=js.executeScript("return document.title;").toString();
	    return title;
	}
	
	public static String getUrlByJs(WebDriver driver) {
		JavascriptExecutor js=((JavascriptExecutor)driver);
		String url=js.executeScript("return document.URL;").toString();
	    return url;
	}
	
	public static String getPageInnerText(WebDriver driver) {
		JavascriptExecutor js =((JavascriptExecutor)driver);
		String pageinnertest=js.executeScript("return document.documentElement.innertext;").toString();
		return pageinnertest;
	}
	
	public static void generateAlertatRuntime(WebDriver driver, String message)
	{
		JavascriptExecutor js =((JavascriptExecutor)driver);
		js.executeScript("alert('"+message+" ')");
	}
	
	public static void drawBowder(WebDriver driver, WebElement element) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].style.border='3px solid green'", element);
	}
	}
