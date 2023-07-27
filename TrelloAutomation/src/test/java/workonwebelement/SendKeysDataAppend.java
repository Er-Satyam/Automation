package workonwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysDataAppend {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.vtiger.com/vtigercrm/");
		
		
		//identify the  username textfield
		WebElement usernametextField = driver.findElement(By.id("username"));
		
		//append the data to the same
		usernametextField.clear();
		usernametextField.sendKeys("selenium");
		Thread.sleep(5000);
		driver.manage().window().minimize();
		driver.quit();
	}

}
