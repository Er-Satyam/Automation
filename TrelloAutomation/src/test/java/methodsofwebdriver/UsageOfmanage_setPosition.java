package methodsofwebdriver;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfmanage_setPosition {
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
				driver.switchTo().newWindow(WindowType.WINDOW);
				
				//set the size of the window
				//Create the Dimension Object to define the window target size
				Dimension targetWindowSize = new Dimension(200,300);
				//assign the specified dimension to the setSIze(Dimension targetSize)
				driver.manage().window().setSize(targetWindowSize);
				
				
				Thread.sleep(5000);
				//specify the position or coordinates of window on the screen
				
				Point targetWindowPosition = new Point(150,200);
				driver.manage().window().setPosition(targetWindowPosition);
				
				Thread.sleep(4000);
				
				driver.manage().window().minimize();
				driver.quit();
				
				
}
}
