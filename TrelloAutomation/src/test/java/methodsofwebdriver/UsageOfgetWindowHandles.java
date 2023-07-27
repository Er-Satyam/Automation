package methodsofwebdriver;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfgetWindowHandles {
public static void main(String[] args) throws Throwable {
	//instantiate the browser specific class
		WebDriver driver=new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//pass the main URL of the application
		driver.get("https:www.facebook.com/");
		//create a new window here upon same object reference
		driver.switchTo().newWindow(WindowType.WINDOW).get("https://www.nationalgeographic.com/");
		
		//capture all the windows id 
		Set<String> allwindowsId = driver.getWindowHandles();

		
		//check how many windows id
		int windowwidCount = allwindowsId.size();//size method of set
		System.out.println(" windowwidCount ="+ windowwidCount);
		//iterate the set of windows Id 
		for(String wid : allwindowsId) {
			System.out.println(wid);//print each window ID
			
			
			Thread.sleep(4000);
			
			driver.manage().window().minimize();
			driver.quit();
		}
		
}
}
