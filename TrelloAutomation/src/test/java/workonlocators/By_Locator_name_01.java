package workonlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class By_Locator_name_01 {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//find the login button
		WebElement loginButton = driver.findElement(By.name("login"));
		//click on the login Button"
		Thread.sleep(5000);
		loginButton.click();
		
Thread.sleep(4000);
		
		driver.manage().window().minimize();
		driver.quit();
	}

}
