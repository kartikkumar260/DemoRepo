import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHower {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "D:\\Kartik_Eclipes_Projects\\chromedrive\\chromedriver.exe");
	
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	
	driver.get("https://www.ebay.com/");
	
	Actions action= new Actions(driver);
	action.moveToElement(driver.findElement(By.linkText("Electronics"))).build().perform();
	Thread.sleep(3000);
	driver.findElement(By.linkText("Smart Watches")).click();
	driver.navigate().back();
	System.out.println("User is navigated back to home page successfully");
	
	System.out.println("************* One more example of MouseHower****************");
	
	//Actions action1= new Actions(driver);
	
	action.moveToElement(driver.findElement(By.linkText("Sports"))).build().perform();
	Thread.sleep(2000);
	driver.findElement(By.linkText("Outdoor Sports")).click();
	
	
	}
}
