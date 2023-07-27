package workonlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class By_Locators_LinkText_01 {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//FIND THE FORGOTTEN PASSWORD?
		WebElement linktext = driver.findElement(By.linkText("Forgotten password?"));
		Thread.sleep(5000);
		linktext.click();
		driver.manage().window().minimize();
		driver.quit();
	}

}
