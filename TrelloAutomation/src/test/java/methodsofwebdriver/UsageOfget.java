package methodsofwebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfget {
public static void main(String[] args) throws Throwable {
	WebDriver driver = new ChromeDriver();
	//pass the main URL of the application
	//main URL= protocol+domain
	driver.get("https://www.facebook.com/");
	//if we don't follow the syntax of the URL which is mandatory ----InvalidArgumentException
	//if network error than----WebDriverException
	driver.get("https://www.facebook.com/pages/create/?ref_type=registration_form");
	
	
	Thread.sleep(4000);
	
	driver.manage().window().minimize();
	driver.quit();
}
}
