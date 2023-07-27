package workonlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByLocator_Xpath_02 {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/reg/");//check for facebook signup page
		//find the Male Radio button
		WebElement registerButton = driver.findElement(By.xpath("//label[text()='Male']/../input[@type='radio']"));
		Thread.sleep(5000);
		registerButton.click();
		
Thread.sleep(4000);
		
		driver.manage().window().minimize();
		driver.quit();
	}
}
