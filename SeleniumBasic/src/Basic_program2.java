import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic_program2 {

	static WebDriver driver;
	public static void main(String[] args) 
	{
	System.setProperty("webdriver.chrome.driver", "D:\\Kartik_Eclipes_Projects\\chromedrive\\chromedriver.exe");
	
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	driver.get("https://www.zoho.com/");
	
	System.out.println(driver.getCurrentUrl());
	
	driver.findElement(By.linkText("Free Sign Up")).click();
	driver.navigate().back();
	driver.findElement(By.linkText("Login")).click();
	System.out.println("Show title value of this site==>"+driver.getTitle());

	driver.findElement(By.xpath("//*[@placeholder='Email / Phone' ]")).sendKeys("kkumar@helm360.com");
	driver.findElement(By.xpath("//*[@type='password']")).sendKeys("Gota6197");
	driver.findElement(By.id("keepme")).click();
	driver.findElement(By.xpath("//*[@class='redBtn' and @id='signin_submit']")).click();
	
	driver.findElement(By.xpath("//*[@id='rmLaterBtn']")).click();
	System.out.println(" zoho page is available ");
	// click on Project icons
	driver.findElement(By.xpath("//*[@class='zicon-apps-projects zicon-apps-96']")).click();
	
	System.out.println("Landed on project page successfully");
	
	System.out.println("fetch current url of site==>" +driver.getCurrentUrl());
	System.out.println("Fetch title of this current url ==>"+driver.getTitle());
	
	
	driver.quit();
	

	}

}
