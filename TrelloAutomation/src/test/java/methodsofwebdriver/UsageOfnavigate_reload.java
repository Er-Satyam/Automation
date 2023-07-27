package methodsofwebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfnavigate_reload {
public static void main(String[] args) throws Throwable {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	Thread.sleep(2000);
	driver.navigate().refresh();
	Thread.sleep(2000);
	driver.navigate().refresh();
	
	
	//post-condition
	driver.manage().window().minimize();
	//terminate the session
	driver.quit();
	
	Thread.sleep(4000);
	
	driver.manage().window().minimize();
	driver.quit();
}
}
