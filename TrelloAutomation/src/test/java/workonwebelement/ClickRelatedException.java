package workonwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickRelatedException {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		Thread.sleep(5000);
		
		// identify the men T-shirts under top wear//xpath by independent and dependent element
		WebElement menTshirts = driver.findElement(By.xpath("//a[text()='Topwear']/../..//a[text()='T-Shirts']"));
		//WebElement menTshirts = driver.findElement(By.xpath("//div[@class='desktop-navLink']/child::a[text()='Men']/..//a[text()='Topwear']/../..//a[text()='T-Shirts']"));
		////div[@class='desktop-navLink']/child::a[text()='Men']/..//a[text()='Topwear']/../..//a[text()='T-Shirts']
		
		//ElementNotInteractableException
		
		//Element is their in the DOM but it is not  visible and hence it is Non-Interactable.
		
		menTshirts.click();
		
		Thread.sleep(5000);
		driver.manage().window().minimize();
		driver.quit();
	}

}
