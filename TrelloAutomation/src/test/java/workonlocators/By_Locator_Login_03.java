package workonlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class By_Locator_Login_03 {
public static void main(String[] args) throws Throwable {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/");
		
		//identify the UserName TextField
		WebElement usernameTextField =driver.findElement(By.id("username"));
		
		//identify the password field"
		WebElement usernamePasswordField =driver.findElement(By.name("pwd"));
		
		//identify the login button
				WebElement loginButton =driver.findElement(By.id("loginButton"));
		
		//Enter the UserName
		usernameTextField.sendKeys("admin");
		Thread.sleep(4000);
		
		//Enter the Password
				usernamePasswordField.sendKeys("1231");
		Thread.sleep(4000);
		
				//click on the button
				loginButton.click();
				
				Thread.sleep(4000);
				
				driver.manage().window().minimize();
				driver.quit();
		
		
	}
}
