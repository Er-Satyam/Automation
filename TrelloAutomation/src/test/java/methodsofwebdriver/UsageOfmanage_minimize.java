package methodsofwebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfmanage_minimize {
	public static void main(String[] args) throws InterruptedException  {
		//Instantiate the browser specific class
				WebDriver driver= new ChromeDriver();
				//precondition
				//Maximize the browser
				//we will get the better view of the application
				//we are utilizing the browser with it's fullest capacity
				
				driver.manage().window().maximize();
				driver.get("https://www.facebook.com/");
				Thread.sleep(3000);
				//minimize the window before termination is the post-condition
				//and it is also one of the standard practice in automation
				//window will get surrendered to the task bar after the desired operation has got completed 
				driver.manage().window().minimize();
				
								
		
				driver.quit();
				
	}

}
