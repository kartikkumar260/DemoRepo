import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFileUpload {

	static WebDriver driver;
	
	public static void main(String[] args) 
	{
	System.setProperty("webdriver.chrome.driver", "D:\\Kartik_Eclipes_Projects\\chromedrive\\chromedriver.exe");
	
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://html.com/input-type-file/");
	
	driver.findElement(By.id("fileupload")).sendKeys("C:\\Users\\kkumar\\Desktop\\Test.html");
	


	}

}
