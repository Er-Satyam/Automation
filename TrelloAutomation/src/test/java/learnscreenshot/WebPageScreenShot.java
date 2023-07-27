package learnscreenshot;


import java.io.File;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




public class WebPageScreenShot {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kids.nationalgeographic.com/animals");
		
		
		TakesScreenshot	ts=(TakesScreenshot)driver;//Explicit Type Casting because we are taking webdriver reference for 
		                                           //takesscreenshot interface
		
		File tempAddress = ts.getScreenshotAs(OutputType.FILE);//capturing the screenshot by getScreenshotAs method
		System.out.println("temp = "+tempAddress);
		
		
		String address = tempAddress.getAbsolutePath();
		System.out.println("permanent = "+address);//printing the address
		
		
		String timeStamp = LocalDateTime.now().toString().replace(':', '-');//capturing time and manipulation
		System.out.println("timeStamp = "+timeStamp);
		
		File permanentAddress = new File("./errorshots/"+timeStamp+"animals.png");//creating the file in the folder
		//screenshot will be auto deleted
		FileUtils.copyFile(tempAddress, permanentAddress); //copy the img from tempAddress to permanentAddress

		//		Thread.sleep(20000);
		
		driver.quit();
		
	}

}
