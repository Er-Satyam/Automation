package methodsofwebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfswitchToWindow {
	public static void main(String[] args) throws Throwable {

		// Instantiate the browser specific class
		WebDriver driver = new ChromeDriver();
		// precondition
		// Maximize the browser
		// we will get the better view of the application
		// we are utilizing the browser with it's fullest capacity

		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		Thread.sleep(5000);
		// create the new window with the same browser object reference
		// new window WebDriver
		driver.switchTo().newWindow(WindowType.WINDOW).get("https://www.nationalgeographic.com/");

		// capture all the windows id
		for (String wid : driver.getWindowHandles()) {
			String url = driver.switchTo().window(wid).getCurrentUrl();// getting the current url

			if (url.equals("https://www.facebook.com/")) {
				driver.close();
			} else if (url.equals("https://www.nationalgeographic.com/")) {
				// driver.close();
			}

		}

	}
}
