package methodsofwebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfswitchTo_newWindowWINDOW  {
	public static void main(String[] args) throws InterruptedException  {
	//Instantiate the browser specific class
		WebDriver driver= new ChromeDriver();
		//precondition
		//Maximize the browser
		//we will get the better view of the application
		//we are utilizing the browser with it's fullest capacity
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		
		Thread.sleep(5000);
		//create the new window with the same browser object reference
		//new window WebDriver
		driver.switchTo().newWindow(WindowType.WINDOW);
		//driver is controlling the latest window in the session
		driver.get("https://www.nationalgeographic.com/");
		
		Thread.sleep(7000);
		driver.manage().window().minimize();
}}
