import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsAndPopup {

	
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Kartik_Eclipes_Projects\\chromedrive\\chromedriver.exe");
		
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		// open rediff mail.com
		driver.get("https://www.rediff.com/");
		
		System.out.println("test12");
		
		// Click on 'Sign In' button.
		driver.findElement(By.xpath("//*[@title='Already a user? Sign in']")).click();
		
		// Click on 'Go' button.
		driver.findElement(By.xpath("//*[@title='Sign in']")).click();
		
		Thread.sleep(2000);
		
		Alert alert=driver.switchTo().alert();
		
		// fetching text of alert pop up
		
		System.out.println(alert.getText());
		
		//alert.dismiss();
		
		alert.accept();
		
		
		System.out.println("**************Scenario 2********************************");
		
		// Click on 'Go' button.
		driver.findElement(By.xpath("//*[@value='Go']")).click();
		
		Alert alert1=driver.switchTo().alert();
        String text=alert1.getText();
        
        if(text.equals("Please enter a valid user name")) {
        	System.out.println("correct error message is displayed");
        } else {
        	System.out.println("Incorrect error message is displayed");
        }
        alert.dismiss();
	}

}
