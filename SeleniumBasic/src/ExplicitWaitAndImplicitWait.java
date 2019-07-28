import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitAndImplicitWait {

	static WebDriver driver;
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "D:\\Kartik_Eclipes_Projects\\chromedrive\\chromedriver.exe");
	
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://www.zoho.com/");
	driver.findElement(By.linkText("Free Sign Up")).click();
	driver.navigate().back();
	driver.findElement(By.linkText("Login")).click();
	System.out.println(driver.getTitle());
	
	// xpath of email/phone text box.
	WebElement EmailPhone_txt=driver.findElement(By.xpath("//*[@placeholder='Email / Phone' ]"));
	
	// xpath of password text box.
	WebElement  Password_txt =driver.findElement(By.xpath("//*[@type='password']"));
	
	// xpath of 'keep me' check box.
	WebElement Keepme_cb=driver.findElement(By.id("keepme"));
	
	// xpath of 'sign in' button.
	WebElement SignIn_bt=driver.findElement(By.xpath("//*[@class='redBtn' and @id='signin_submit']"));
	
	// Scenario1=> We are applying explicit wait on  webelements (textbox). By directly calling static "sendkeys" method. 
	
	sendKeys( driver,10 ,EmailPhone_txt ,"kkumar@helm360.com" ) ;
	sendKeys( driver,10 ,Password_txt ,"Gota6197" );
	
	// Scenario 2 => We are applying explicit wait on Webelements (checkbox or button). By directly calling static "click()" method.
	
	clickOn(driver, 10 ,Keepme_cb);
	clickOn(driver,10,SignIn_bt) ;
	
	System.out.println("Explicit wait is successfully applied on all webelements.");
	driver.quit();
	}

	public static void sendKeys(WebDriver driver,int timeout ,WebElement element ,String value ) 
	{
	new WebDriverWait(driver ,timeout).until(ExpectedConditions.visibilityOf(element));
	
	element.sendKeys(value);	
	}
	
	public static void clickOn(WebDriver driver, int timeout,WebElement element) 
	{
	new WebDriverWait(driver,timeout).until(ExpectedConditions.elementToBeClickable(element));
	
	element.click();
	
	}
	// xpath of "Email/phone" text box. "//*[@id='lid'  and @class='unauthinputText' and @name='lid' and @placeholder='Email / Phone' ]"
}
