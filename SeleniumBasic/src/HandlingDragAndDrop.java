import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingDragAndDrop {

	static WebDriver driver;
	public static void main(String[] args) 
	{
	System.setProperty("webdriver.chrome.driver", "D:\\Kartik_Eclipes_Projects\\chromedrive\\chromedriver.exe");
	
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	
	driver.get("http://jqueryui.com/droppable/");
	
	driver.switchTo().frame(0);
	
	Actions action= new Actions(driver);
	action.clickAndHold(driver.findElement(By.id("draggable"))).
	moveToElement(driver.findElement(By.id("droppable"))).
	release(driver.findElement(By.id("droppable"))).
	build().
	perform();
	
	}
	}
