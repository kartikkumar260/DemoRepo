import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic_program1 {

	public static void main(String[] args) {
		WebDriver driver ;
		
		System.setProperty("webdriver.chrome.driver","D:\\Kartik_Eclipes_Projects\\chromedrive\\chromedriver.exe");
		System.out.println("test1234");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://artoftesting.com");
	        
	        //Closing the browser
	     driver.quit();
	 
	}

}
