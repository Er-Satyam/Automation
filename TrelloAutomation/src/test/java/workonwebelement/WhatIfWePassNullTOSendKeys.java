package workonwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WhatIfWePassNullTOSendKeys {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		
		// We Cannot Pass the Null value with sendKeys
		// IllegalArgumentException - Java - run - unchecked
		
		driver.findElement(By.id("username")).sendKeys(null);
		
		Thread.sleep(5000);
		driver.manage().window().minimize();
		driver.quit();
	}

}
