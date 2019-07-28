import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed_Enabled_Selected {

	static WebDriver driver;
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "D:\\Kartik_Eclipes_Projects\\chromedrive\\chromedriver.exe");
	
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(21, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	driver.navigate().to("https://artoftesting.com/sampleSiteForSelenium.html");
	
	
	// closing model pop up that appears
	driver.findElement(By.xpath("//div[contains(@class,'addthis_bar_x icon-arrow-up')]")).click();
	
   // unchecked radiobutton(male) . Observer it is displayed and enable on webpage. However it is not selected.
	 boolean b1=driver.findElement(By.id("male")).isDisplayed();
	 System.out.println(b1);
	 boolean b2=driver.findElement(By.id("male")).isEnabled();
	 System.out.println(b2);
	 boolean b3=driver.findElement(By.id("male")).isSelected();
	 System.out.println(b3);
	 
	 System.out.println("Select male radiobutton");
   // select  male radiobutton. Observe IsSelected is displayed as true
	 driver.findElement(By.id("male")).click();
	 boolean b4=driver.findElement(By.id("male")).isSelected();
	 System.out.println(b4);
	 System.out.println("deselect male radio button by selecting female radio button ");
	 driver.findElement(By.id("female")).click();
	 boolean b5=driver.findElement(By.id("male")).isSelected();
	 System.out.println(b5);
	 
	
	 System.out.println("*******Button scenario*********************");
	 boolean b6=driver.findElement(By.id("idOfButton")).isDisplayed();
     System.out.println(b6);
     boolean b7=driver.findElement(By.id("idOfButton")).isEnabled();
     System.out.println(b7);
     boolean b8=driver.findElement(By.id("idOfButton")).isSelected();
     System.out.println(b8);
	}

}
