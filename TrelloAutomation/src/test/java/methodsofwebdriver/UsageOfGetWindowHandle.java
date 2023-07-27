package methodsofwebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetWindowHandle {
public static void main(String[] args) {
	
	//instantiate the browser specific class
	WebDriver driver=new ChromeDriver();
	//maximize the browser
	driver.manage().window().maximize();
	//pass the main URL of the application
	driver.get("https:www.facebook.com/");
	//get the window ID 
	//capture current wid which is under driver control
	String facebookWid = driver.getWindowHandle();
	System.out.println("facebookWid = " + facebookWid);
	//terminate the session
	driver.quit();
}
}
