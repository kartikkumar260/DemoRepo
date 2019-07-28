import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutor_basic3 {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:/Kartik_Eclipes_Projects/chromedrive/chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		driver.navigate().to("https://www.zoho.com/");
		
		driver.findElement(By.linkText("Login")).click();
  
		WebElement emailPassword_txt=driver.findElement(By.id("lid"));
		WebElement password_txt=driver.findElement(By.xpath("//*[@type='password']"));
		WebElement signIn_bt=driver.findElement(By.xpath("//*[@class='redBtn' and @id='signin_submit']"));
		WebElement keepme_ck=driver.findElement(By.xpath("//*[@id='keepme']"));
	
		
	//	WebElement request_bt=driver.findElement(By.xpath("//*[@id='buttonloader' and @class='redBtn']"));
		
	
		// Ask someone how  to handle email and password webelement of text type.
		textElementbyJS(driver,emailPassword_txt, "kkumar@helm360.com");
		textElementbyJS(driver,password_txt, "Gota6197");
		
		// this will uncheck keepme checkbox.
		clickElementbyJS(driver ,keepme_ck);
		System.out.println("check box is clicked");
		clickElementbyJS(driver ,signIn_bt);
		
		
		// Rule => Since project link is available on HomePage (different page). Hence we have to declare it here.
		
		WebElement project_lk=driver.findElement(By.xpath("//*[@class='zicon-apps-projects zicon-apps-96']"));
		Thread.sleep(3000);
		clickElementbyJS(driver ,project_lk);
		Thread.sleep(3000);
		//clickElementbyJS(driver,request_bt);
		

	}
    
	public static void clickElementbyJS(WebDriver driver ,WebElement element1)
	{
		JavascriptExecutor js =((JavascriptExecutor)driver);
		js.executeScript("arguments[0].click();", element1);
	}
	//  How to make this method work generically for text element
	public static void textElementbyJS(WebDriver driver,WebElement element, String value)
	{
		JavascriptExecutor js =((JavascriptExecutor)driver);
		// rule 1= below line we are dynamically passing value at run time.
	      js.executeScript("arguments[0].value='"+value+" ' ;", element);
		
		/* rule 2 = If we pass value as  [ \"+value+\" ']  then by default we are hard cording value .This is not right approch
		js.executeScript("arguments[0].value='\"+value+\" ' ;", element);
		*/
		 }
}
