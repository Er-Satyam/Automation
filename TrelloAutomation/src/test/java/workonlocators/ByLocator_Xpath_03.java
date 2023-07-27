package workonlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByLocator_Xpath_03 {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:shop-global.malaicha.com");//check for facebook signup page
		//find the Login-register button
		WebElement registerButton = driver.findElement(By.xpath("//span[@class='loginRegister']/parent::button"));
		Thread.sleep(5000);
		registerButton.click();
		
		
Thread.sleep(4000);
		
		driver.manage().window().minimize();
		driver.quit();
	}
}
