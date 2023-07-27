package methodsofwebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfmanage_fullscreeen {
	public static void main(String[] args) throws InterruptedException  {
	//Instantiate the browser specific class
	WebDriver driver= new ChromeDriver();
	//precondition
	//Maximize the browser
	//we will get the better view of the application
	//we are utilizing the browser with it's fullest capacity
	
	driver.manage().window().maximize();
	driver.get("https://www.nationalgeographic.com/");
	
	
	Thread.sleep(3000);
	//go to fullScreen mode
	driver.manage().window().fullscreen();
	
	Thread.sleep(3000);
	driver.manage().window().minimize();
	
	
	
	
	driver.quit();
}}
