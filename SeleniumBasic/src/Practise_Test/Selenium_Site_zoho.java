package Practise_Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Site_zoho {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "D:\\Kartik_Eclipes_Projects\\chromedrive\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	driver.get("https://www.zoho.com/");
	System.out.println("Fetch homepage url="+driver.getCurrentUrl());
	System.out.println("Title homepage ="+driver.getTitle());
	
	driver.findElement(By.linkText("Free Sign Up")).click();
	System.out.println("Fetch SignUP url="+driver.getCurrentUrl());
	System.out.println("Title SignUP="+driver.getTitle());
	
	driver.navigate().back();
	
	driver.findElement(By.linkText("Login")).click();
	System.out.println("Fetch Login url="+driver.getCurrentUrl());
	System.out.println("Title Login="+driver.getCurrentUrl());
	
	
	driver.findElement(By.id("lid")).sendKeys("kkumar@helm360.com");
	driver.findElement(By.id("pwd")).sendKeys("Gota6197");
	driver.findElement(By.xpath("//*[@id='keepme']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id='signin_submit']")).click();
	
    // project icon click on it
	driver.findElement(By.xpath("//*[@class='zicon-apps-projects zicon-apps-96']")).click();
	
	System.out.println("Fetch Project url="+driver.getCurrentUrl());
	System.out.println("Title Project="+driver.getTitle());
	
	
	// Header project link click.
	driver.findElement(By.xpath("//*[@id='projectslink']")).click();
	
	// Terminus Product link click.
	driver.findElement(By.xpath("//*[@id=\"projlist_952363000000017013_recent\"]")).click();

	}

}
