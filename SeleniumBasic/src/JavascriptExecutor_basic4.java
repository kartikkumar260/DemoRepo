import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutor_basic4 {
static WebDriver driver;

/*
 question)  static  JavascriptExecutor js = (JavascriptExecutor) driver; ?
 answer => If we globally declare this above command then as result  "Null pointer exception" is displayed.
         eg =>Exception in thread "main" java.lang.NullPointerException.
 */
 
public static void main(String[] args) throws InterruptedException 
{
	
System.setProperty("webdriver.chrome.driver", "D:/Kartik_Eclipes_Projects/chromedrive/chromedriver.exe");
driver= new ChromeDriver();
driver.manage().window().maximize();
driver.manage().deleteAllCookies();
driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
driver.navigate().to("https://www.zoho.com/");

// Rule => declare below script it will be applicable to all.
JavascriptExecutor js = (JavascriptExecutor) driver;

driver.findElement(By.xpath("//*[@class='zh-login']")).click();
//js.executeScript("document.getElementByClass('zh-login').click();" );
//js.executeScript("arguments[0].click();", login_lk);

js.executeScript("document.getElementById('lid').value='kkumar@helm360.com';");
js.executeScript("document.getElementById('pwd').value='Gota6197';");
js.executeScript("document.getElementById('keepme').click();");
js.executeScript("document.getElementById('signin_submit').click();");
//*[@class='zicon-apps-projects zicon-apps-96']

// click on project icon
driver.findElement(By.xpath("//*[@class='zicon-apps-projects zicon-apps-96']")).click();


	}
}
