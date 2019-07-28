import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutor_basic2 {
	
	
    static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "D:/Kartik_Eclipes_Projects/chromedrive/chromedriver.exe");
	
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	driver.navigate().to("https://www.zoho.com/");
	
	driver.findElement(By.linkText("Login")).click();
	WebElement signIn_bt=driver.findElement(By.xpath("//*[@class='redBtn' and @id='signin_submit']"));
	
	WebElement signUp_lk=driver.findElement(By.linkText("Sign Up Now"));
	
	WebElement password_txt=driver.findElement(By.xpath("//*[@type='password']"));
	
	WebElement keepme_ck=driver.findElement(By.id("keepme"));
	
	System.out.println("*******************Scenario to highligh webelements*********************");
	drawboarder(driver, signIn_bt) ;
	drawboarder(driver, signUp_lk) ;
	drawboarder(driver, password_txt) ;
	drawboarder(driver, keepme_ck) ;
	
	
	System.out.println("*******************Scenario of Alert display at runtime *********************");
	generateAlertatRuntime(driver, "There is issue regarding various WebElement") ;
	
	Alert alert = driver.switchTo().alert();
	
	System.out.println(alert.getText());	
	
	alert.dismiss();
	}

	
	public static void drawboarder(WebDriver driver, WebElement element) 
	{
		JavascriptExecutor js =((JavascriptExecutor)driver);
		js.executeScript("arguments[0].style.border='3px solid black'",element);
     }
	
	public static void generateAlertatRuntime(WebDriver driver, String message) 
	{
		JavascriptExecutor js =((JavascriptExecutor)driver);
		js.executeScript("alert(' "+message+" ')");
	}
}