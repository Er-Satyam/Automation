package methodsofwebdriver;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UsageOf_manage_maximize {
	public static void main(String[] args) throws Throwable {
		//Instantiate the browser specific class
		WebDriver driver= new ChromeDriver();
		//precondition
		//Maximize the browser
		//we will get the better view of the application
		//we are utilizing the browser with it's fullest capacity
		
	
		
		
		driver.manage().window().maximize();
		driver.get("https://www.dassault-aviation.com/en/");
	
       Thread.sleep(4000);
		
		driver.manage().window().minimize();
		driver.quit();
	}

}
