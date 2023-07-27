package methodsofwebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfnavigate_toStringURL {
public static void main(String[] args) throws Throwable {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.dassault-aviation.com/en/");
	
	//go to passion page-pass the sub-URL
	//URL of the same application but different WebPages
	Thread.sleep(6000);
	driver.navigate().to("https://www.dassault-aviation.com/en/passion/");
	
	//get back to previous page
	Thread.sleep(2000);
	driver.navigate().back();//navigate () back() method
	
	//move forward to passion page
	Thread.sleep(2000);
	driver.navigate().forward();//navigate () forward() method
	
	Thread.sleep(7000);
	//post-condition
	driver.manage().window().minimize();
	//terminate the session
	driver.quit();
	
	
}
}
