package methodsofwebdriver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfnavigate_toURLurl {
	public static void main(String[] args) throws MalformedURLException, Throwable {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.dassault-aviation.com/en/");
		
		
		
		URL mainURL=new URL("https://www.dassault-aviation.com/en/");
		
		//build the group pages URL
		URL groupsPageURL = new URL( mainURL,"group/");
		
		
		//build the defense pages URL
				URL defensePageURL = new URL( mainURL,"defense/");
				
				//build the civil pages URL
				URL civilPageURL = new URL( mainURL,"civil/");
	
				//build the space pages URL
				URL spacePageURL = new URL( mainURL,"space/");
				
				//build the passion pages URL
				URL passionPageURL = new URL( mainURL,"passion/");
				
			Thread.sleep(3000);
			
			driver.navigate().to(defensePageURL);
			
			Thread.sleep(3000);
			driver.navigate().to(passionPageURL);
			
			Thread.sleep(3000);
			driver.navigate().to(spacePageURL);
			
			Thread.sleep(3000);
			driver.navigate().to(civilPageURL);
			
			Thread.sleep(3000);
			driver.navigate().to(groupsPageURL);
			
			
			
			//post-condition
			driver.manage().window().minimize();
			//terminate the session
			driver.quit();
			
			
	}

}
