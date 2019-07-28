import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDown {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver", "D:\\Kartik_Eclipes_Projects\\chromedrive\\chromedriver.exe");
	
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.get("https://www.ebay.com/");
	
	System.out.println("Ebay site tile is ==>"+driver.getTitle());
	
    Select dropdown= new Select(driver.findElement(By.id("gh-cat")));
    
    dropdown.selectByIndex(4);
    
    Thread.sleep(3000);
    
    dropdown.selectByValue("1");
    
    Thread.sleep(3000);
    
    dropdown.selectByVisibleText("Jewelry & Watches");
    
    Thread.sleep(3000);
    
    System.out.println(dropdown.getFirstSelectedOption());
    
    driver.quit();
    
    
	
	

	}

}
