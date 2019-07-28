import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutor_basic {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","D:/Kartik_Eclipes_Projects/chromedrive/chromedriver.exe");
	
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	
	driver.navigate().to("https://www.zoho.com/");
	
    // refreshing browser using JavascriptExecutor
	refreshBrowserByJs(driver);
	
	// fetching url of current browser
	System.out.println("fetch current url ==>"+getUrlWebpage(driver));
	
	// fetching title of webpage using JavascriptExecutor
	System.out.println("fetch tile of webpage ==>"+getTitleByJS(driver));
	
	System.out.println("******************************** Starting of PageInner text***************************");
	
	// fetching inner text of Webpage using JavascriptExecutor
	System.out.println(getPageInnertext(driver));
	
	System.out.println("******************************** Ending  of PageInner text***************************");
	
	
	
	}

	public static void refreshBrowserByJs(WebDriver driver) 
	{
	JavascriptExecutor js =((JavascriptExecutor)driver);
	js.executeScript("history.go(0)");	
	}
	
	public static String getTitleByJS(WebDriver driver) 
	{
	JavascriptExecutor js =((JavascriptExecutor)driver);
	String title=js.executeScript("return document.title;").toString();
	return title;
	}
	
	public static String getUrlWebpage(WebDriver driver)
	{
	JavascriptExecutor js= ((JavascriptExecutor)driver);
	String url=js.executeScript("return document.URL;").toString();
	return url;
	}
	
	public static String getPageInnertext(WebDriver driver)
	{
	JavascriptExecutor js = ((JavascriptExecutor)driver);
	String innertext=js.executeScript("return document.documentElement.innerText;").toString();
	return innertext;
	}
	
	
}
