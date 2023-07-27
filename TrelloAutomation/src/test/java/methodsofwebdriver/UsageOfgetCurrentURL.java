package methodsofwebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfgetCurrentURL {
	public static void main(String[] args) throws Throwable {
		//instantiate the browser specific class
		WebDriver driver = new ChromeDriver();
		//pass the main URL of the application
		driver.get("https://www.actitime.com/login.do");
		//go and capture triggered URL in the browser
		//we can capture triggered URL in the browser
		String actualLoginPageUrl = driver.getCurrentUrl();//getCurrentUrl()
		System.out.println("actualLoginPageUrl = "+ actualLoginPageUrl);
		
	//verify the URL of the login page
		String expectedLoginUrl = "https://demo.actitime.com/login.do";
		System.out.println("expectedLoginUrl =" + expectedLoginUrl);
		
		if(actualLoginPageUrl.contains("login.do"))
		{
			System.out.println("Pass : the login page is found correct & it is verified.");
		}
		else {
			System.out.println("Fail : the login page is found incorrect & it is verified.");
		}
		
Thread.sleep(4000);
		
		driver.manage().window().minimize();
		driver.quit();
	}

}
