package Practise_Test;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SeleniumBasicCommonds2 {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver" ,"D:\\\\Kartik_Eclipes_Projects\\\\chromedrive\\\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	
	driver.navigate().to("https://artoftesting.com/sampleSiteForSelenium.html");
	System.out.println("Current url of artoftesting====>"+driver.getCurrentUrl());
	
	//Fetch the text "This is sample text!" and print it on console
	String sampletext=driver.findElement(By.id("idOfDiv")).getText();
	System.out.println(sampletext);
	
	//Fetch the size of  "This is sample text!" and print it on console
	Dimension sizeofText=driver.findElement(By.id("idOfDiv")).getSize();
	System.out.println("Entire sizeofText ==>"+sizeofText);
	
	//Using linkText locator to find the link and then using click() to click on it
	driver.findElement(By.linkText("This is a link")).click();
	
	//Finding textbox using id locator and then using send keys to write in it.
	driver.findElement(By.id("fname")).sendKeys("Shiv");
	// Rule =  InterruptedException needs to declared in main method when using Thread.sleep
	Thread.sleep(3000);  
	
	driver.findElement(By.name("firstName")).clear();
	
	driver.findElement(By.id("fname")).sendKeys("ShivShakti das");
	
	driver.findElement(By.id("idOfButton")).click();
	
	
	// close pop-up window that appears @runtime
	
	driver.findElement(By.xpath("//div[contains(@class,'addthis_bar_x icon-arrow-up')]")).click();
	
	//click on radio button of female
	
	driver.findElement(By.id("female")).click();
	
	driver.findElement(By.id("male")).click();
	
	
	// click on check box in selenium
	
	driver.findElement(By.xpath("//*[@class='Performance']")).click();
	driver.findElement(By.xpath("//*[@class='Automation']")).click();
	// below we are unchecking checkbox that is already selected.
	driver.findElement(By.xpath("//*[@class='Performance']")).click();  
	
	

	
	
	
	// how to double click on button
	WebElement button_doubleclick=driver.findElement(By.xpath("//*[@id='dblClkBtn']"));
	
	Actions action=new Actions(driver);
	action.doubleClick(button_doubleclick).build().perform();
	
	System.out.println("Alert scenario is started now");
	// how to handle alert in selenium
	Alert alert1=driver.switchTo().alert();
	String alerttext=alert1.getText();
	System.out.println(alerttext);
	alert1.accept();
	

	// how to handle alert in selenium
	driver.findElement(By.xpath("//*[@onclick='generateConfirmBox()']")).click();
	Alert alert2=driver.switchTo().alert();
	String alerttext2=alert2.getText();
	System.out.println(alerttext2);
	alert2.dismiss();
	
	
	
	// how to handle another type of alert in selenium.
	
	driver.findElement(By.xpath("//*[@onclick='generateAlertBox()']")).click();
	Alert alert3=driver.switchTo().alert();
	System.out.println(alert3.getText());
	alert3.dismiss();
	

	System.out.println("Alert scenario are completed now");
	// drop down selection 
	// rule =using Select class for selecting value from dropdown
	
	System.out.println(" drop down scenario start");
	Select dropdown= new Select(driver.findElement(By.xpath("//*[@id='testingDropdown']")));
	dropdown.selectByIndex(3);
	Thread.sleep(2000);
	dropdown.selectByValue("Manual");
	
	
	System.out.println(" scenario of drag and down start");
	// how to handle Drag and drop functionality in selenium.
	Actions action2 = new Actions(driver);
	action2.clickAndHold(driver.findElement(By.xpath("//*[@id='sourceImage']"))).
	moveToElement(driver.findElement(By.xpath("//*[@id='targetDiv']"))).
	release(driver.findElement(By.xpath("//*[@id='targetDiv']"))).
	build().
	perform();
	
	System.out.println(" scenario of drag and drop complete");
	}

}
