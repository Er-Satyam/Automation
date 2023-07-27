package workonlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Problem_With_LinkText {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.nbtindia.gov.in/");
		//When not to go link text?
		
		//Note: Link text will never identify the <a> element if it contains an unbreakable space
		
//		WebElement element = driver.findElement(By.linkText("CATALOGUES        
		//                                                               
		//                                                        
		//                                                                   
		//                                                                                        
		//                                                                                              
		//                                                                                   
		//                               "));
		
		WebElement element = driver.findElement(By.partialLinkText("CATALOGUES"));
		Thread.sleep(5000);//clt + 1 ==QuickFix
		element.click();
		
Thread.sleep(4000);
		
		driver.manage().window().minimize();
		driver.quit();
	}

}
