package Practise_Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumBasic_Fames_DragAndDrop {

	static WebDriver driver;
	
	public static void main(String[] args) {

	System.setProperty("webdriver.chrome.driver", "D:\\Kartik_Eclipes_Projects\\chromedrive\\chromedriver.exe");
	
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	
	driver.get("http://jqueryui.com/droppable/");
	// firstly move required driver specific frame on which we need to perform some action.
	driver.switchTo().frame(0);
	
	Actions action1 = new Actions(driver);
	action1.clickAndHold(driver.findElement(By.xpath("//*[@id='draggable']"))).
	moveToElement(driver.findElement(By.xpath("//*[@id='droppable']"))).
	release(driver.findElement(By.xpath("//*[@id='droppable']"))).
	build().
	perform();	
	
	}

}
