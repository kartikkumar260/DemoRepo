package Practise_Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumBasic_Mouseover {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

	System.setProperty("webdriver.chrome.driver", "D:\\Kartik_Eclipes_Projects\\chromedrive\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(50,TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	
	driver.get("https://www.ebay.com/");
	
	Actions action1= new Actions(driver);
	action1.moveToElement(driver.findElement(By.linkText("Motors"))).build().perform();
    Thread.sleep(3000);
    driver.findElement(By.linkText("ATV Parts")).click();
    
    driver.navigate().back();
    System.out.println("*********User is migrated to homepage*************");
    System.out.println("********One more scenario of mousehouver******");
    action1.moveToElement(driver.findElement(By.linkText("Home & Garden"))).build().perform();
    Thread.sleep(2000);
    driver.findElement(By.linkText("Art & Craft Supplies")).click();
    
	}

}
