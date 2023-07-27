package workonlocators;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class By_Locator_Xpath_04 {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/search?q=redmi+note+10+pro&as=on&as-show=on&otracker=AS_Query_OrganicAutoSuggest_8_11_na_na_na&otracker1=AS_Query_OrganicAutoSuggest_8_11_na_na_na&as-pos=8&as-type=RECENT&suggestionId=redmi+note+10+pro&requestId=efe5679e-ff13-4691-8a52-e2e123c8f34d&as-searchtext=redmi%20note%20");//check for facebook signup page
		//find the Login-register button
		WebElement registerButton = driver.findElement(By.xpath("div[class='_30jeq3 _1_WHN1']"));
		Thread.sleep(5000);
		registerButton.getText();
		
Thread.sleep(4000);
		
		driver.manage().window().minimize();
		driver.quit();
	}
}
