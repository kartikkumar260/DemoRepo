import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutor_basic5 {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:/Kartik_Eclipes_Projects/chromedrive/chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.navigate().to("https://www.zoho.com/");
		
		/*
		 Rule 1=> All webElements and action of specific page must be declared . eg Home page
		 */
		
		System.out.println("***************HomePage  webelement and action ****************");
		//driver.findElement(By.xpath("//*[@class='zh-login']")).click();
		WebElement loginpage_lk =driver.findElement(By.xpath("//*[@class='zh-login']"));
		js.executeScript("arguments[0].click();", loginpage_lk);
		
		
		// declare all webelement and action of login page must be declared. eg loginpage
		
		System.out.println("***************LoginPage  webelement  ****************");
		/*
		 Rule if we try to write code of webelement or action of Homepage here then "Element not found exception occurss.
		 */
		WebElement email_txt=driver.findElement(By.id("lid"));
		WebElement password_txt=driver.findElement(By.xpath("//*[@type='password']"));
		WebElement signIn_bt=driver.findElement(By.xpath("//*[@class='redBtn' and @id='signin_submit']"));
		WebElement keepme_ck=driver.findElement(By.xpath("//*[@id='keepme']"));
		WebElement forgot_lk=driver.findElement(By.xpath("//*[@class='forgotpasslink']"));
		
		
		System.out.println("***************LoginPage actions  ****************");
		js.executeScript("arguments[0].value='kkumar@helm360.com';", email_txt);
		js.executeScript("arguments[0].value='Gota6197';",password_txt);
		js.executeScript("arguments[0].click();",keepme_ck);
		js.executeScript("arguments[0].click();",signIn_bt);
		
		
		System.out.println("***************ZohologinPage webelement or actions***************");
		/*
		 Rule if we try to write code of webelement or action of  loginpage or homepage here then "Element not found exception occurss.
		 */
		WebElement project_lk =driver.findElement(By.xpath("//*[@class='zicon-apps-projects zicon-apps-96']"));
		Thread.sleep(4000);
		js.executeScript("arguments[0].click();", project_lk );
		Thread.sleep(4000);
		driver.getCurrentUrl();
		System.out.println("code is running successfully");



	}

}
