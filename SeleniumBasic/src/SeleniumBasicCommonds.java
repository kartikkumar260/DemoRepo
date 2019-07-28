import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumBasicCommonds {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		
	System.setProperty("webdriver.chrome.driver", "D:\\Kartik_Eclipes_Projects\\chromedrive\\chromedriver.exe");
	
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	driver.get("https://artoftesting.com/sampleSiteForSelenium.html");

	//Fetch the text "This is sample text!" and print it on console
	//Use the id of the div to locate it and then fecth text using getText() method
	String sampletext=driver.findElement(By.id("idOfDiv")).getText();
	System.out.println(sampletext);
	
	//Using linkText locator to find the link and then using click() to click on it
	driver.findElement(By.linkText("This is a link")).click();
	
	
	//Finding textbox using id locator and then using send keys to write in it
	driver.findElement(By.id("fname")).sendKeys("Shiv das");
	
	// Rule =  InterruptedException needs to declared in main method when using Thread.sleep
	Thread.sleep(3000);   
	//Clear the text written in the textbox
	driver.findElement(By.id("fname")).clear();
	
	
	//Clicking on button using click() command
	
	driver.findElement(By.id("idOfButton")).click();
	
	//String x =driver.findElement(By.xpath("//div[contains(@class,'addthis_bar_p')]")).getText();
	//System.out.println(x);
			
	driver.findElement(By.xpath("//div[contains(@class,'addthis_bar_x icon-arrow-up')]")).click();
	
	//Click on radio button of male
	//driver.findElement(By.xpath("//*[@id ="male" ]")).click();
	driver.findElement(By.id("male")).click();
	
	// click on checkbox
	driver.findElement(By.xpath("//*[@class =\"Automation\" ]")).click();
	
	
	// using Select class for selecting value from dropdown
	
	Select dropdown= new Select (driver.findElement(By.xpath("//*[@id=\"testingDropdown\"]")));
	dropdown.selectByIndex(2);
	Thread.sleep(3000);
	
	driver.close();
	
	//driver.findElement(By.xpath("//div[contains(@class,'at4-arrow at-left')]")).click();
	
	
	//driver.findElement(By.id("dblClkBtn")).click();
	
	// using
//	driver.findElement(By.xpath("//*[@id=\"AlertBox\"]")).click();
	
//	driver.findElement(By.id("ConfirmBox")).click();
	
	
	
	

	
	
	}

}
