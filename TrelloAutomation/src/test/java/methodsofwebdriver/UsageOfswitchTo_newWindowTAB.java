package methodsofwebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfswitchTo_newWindowTAB {
	
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
			//create the new tab with the same window with the same browser object reference
		
			driver.switchTo().newWindow(WindowType.TAB);
			//driver is referring to  the latest tab in the same window
			Thread.sleep(5000);
			driver.get("https://www.nationalgeographic.com/");
			
			Thread.sleep(7000);
			driver.manage().window().minimize();
	}}

