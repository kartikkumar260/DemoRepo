import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutor_basic6 {

	static WebDriver driver;
	
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "D:\\Kartik_Eclipes_Projects\\chromedrive\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	driver.navigate().to("http://jqueryui.com/droppable/");
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	js.executeAsyncScript("window.scrollBy(0,document.body.scrollHeight)");
	//js.executeAsyncScript("window.scrollBy(0,500)");
	
	
	System.out.println("for scrolling till the bottom of the page we can use the code like");
	
//	js.executeScript("window.location='https://www.rediff.com/'");
	
	driver.get("https://www.zoho.com/");

	js.executeAsyncScript("window.scrollBy(0,document.body.scrollHeight)");
	
	
	}

}
