package Practise_Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed_Enabled_Selected {

	
	static WebDriver driver;
	
	public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "D:\\\\Kartik_Eclipes_Projects\\\\chromedrive\\\\chromedriver.exe");
	
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	driver.navigate().to("https://artoftesting.com/sampleSiteForSelenium.html");
	
	// closing modle pop up that appears at runtime.
	
    //driver.findElement(By.xpath("//*[@class='addthis_bar_x icon-arrow-up']")).click();
	
    // unchecked radiobutton(male) . Observer it is displayed and enable on webpage. However it is not selected.
    
    System.out.println("************scenario of checkbox****************");
    
    boolean b1= driver.findElement(By.xpath("//*[@id='male']")).isDisplayed();
    System.out.println(b1);
    
    boolean b2= driver.findElement(By.xpath("//*[@id='male']")).isEnabled();
    System.out.println(b2);
    
    boolean b3= driver.findElement(By.xpath("//*[@id='male']")).isSelected();
    System.out.println(b3);
    
    System.out.println("select male checkbox now");
    
    driver.findElement(By.xpath("//*[@id='male']")).click();
    
    boolean b4= driver.findElement(By.xpath("//*[@id='male']")).isSelected();
    System.out.println(b4);
	 System.out.println("deselect male radio button by selecting female radio button ");
     driver.findElement(By.xpath("//*[@id='female']")).click();

    
    boolean b5= driver.findElement(By.xpath("//*[@id='male']")).isSelected();
    System.out.println(b5);
    
    System.out.println("************scenario of Button***************");
    
    boolean button1=driver.findElement(By.id("idOfButton")).isDisplayed();
    System.out.println(button1);
    
    boolean button2=driver.findElement(By.id("idOfButton")).isEnabled();
    System.out.println(button2);
    
    boolean button3=driver.findElement(By.id("idOfButton")).isSelected();
    System.out.println(button3);
    
	}

}
