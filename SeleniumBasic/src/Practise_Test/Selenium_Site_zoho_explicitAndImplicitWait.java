package Practise_Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Selenium_Site_zoho_explicitAndImplicitWait {

	static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Kartik_Eclipes_Projects\\chromedrive\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.navigate().to("https://www.zoho.com/");
		driver.findElement(By.linkText("Free Sign Up")).click();
		driver.navigate().back();
		driver.findElement(By.linkText("Login")).click();
		System.out.println("Fetch login current title-->"+driver.getTitle());
		System.out.println("Fetch login current url-->"+driver.getCurrentUrl());
		
		
		
	// below is list of web elements on login page
		WebElement EmailPhone_txt=driver.findElement(By.xpath("//*[@id=\"lid\"]"));
		WebElement  Password_txt =driver.findElement(By.xpath("//*[@id=\"pwd\"]"));
		WebElement keepme_ck=driver.findElement(By.xpath("//*[@id=\"keepme\"]"));
		WebElement submit_bt=driver.findElement(By.xpath("//*[@id=\"signin_submit\"]"));
		
		
	// Scenario1=> We are applying explicit wait on  webelements (textbox). By directly calling static "sendkeys" method.
		sendkeys(driver,10,EmailPhone_txt,"kkumar@helm360.com");
		sendkeys(driver,10,Password_txt,"Gota6197");
		
	//scenario=> We are applying explicit wait on Webelements (checkbox or button). By directly calling static "click()" method.
		clickOn(driver,10,keepme_ck);
		clickOn(driver ,10,submit_bt);
		
		System.out.println("Explicit wait is successfully applied on all webelements.");
		driver.quit();
	}

	public static void sendkeys(WebDriver driver , int timeout ,WebElement element , String value) {
		new WebDriverWait(driver,timeout).until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(value);
	}
	
	public static void clickOn(WebDriver driver , int timeout ,WebElement element) {
		new WebDriverWait(driver, timeout).until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}
}
