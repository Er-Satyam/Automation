package workonwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfsendKeys {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		//identify the user name text field
		
		WebElement usernameTextField = driver.findElement(By.id("username"));
		
		usernameTextField.sendKeys("admin");
		
		Thread.sleep(5000);
		driver.manage().window().minimize();
		driver.quit();
	}

}
