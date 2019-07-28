import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingFrames {

	static WebDriver driver;
	public static void main(String[] args) 
	{
		
	System.setProperty("webdriver.chrome.driver", "D:/Kartik_Eclipes_Projects/chromedrive/chromedriver.exe");
	
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	
	driver.get("http://jqueryui.com/droppable/");
	
	// firstly move required driver specific frame on which we need to perform some action.
	driver.switchTo().frame(0);
	
	Actions actions = new Actions(driver);
	actions.clickAndHold(driver.findElement(By.id("draggable"))).
	moveToElement(driver.findElement(By.id("droppable"))).
	release().
	build().
	perform();
	
	
	

	}

}
