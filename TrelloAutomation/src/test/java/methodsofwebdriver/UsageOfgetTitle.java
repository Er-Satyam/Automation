package methodsofwebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfgetTitle {
public static void main(String[] args) throws Throwable {
	//instantiate the browser specific class
WebDriver driver=new ChromeDriver();
//pass the main URL of the application
driver.get("https://www.facebook.com/login/identify/?ctx=recover&ars=facebook_login&from_login_screen=0");//forgot password
//capture and print the title of the WebPage 
//we can verify the title of any WebPage
String webpageTitle= driver.getTitle();
System.out.println("webpageTitle = " + webpageTitle);

Thread.sleep(5000);//InterruptedException

driver.get("https://www.facebook.com/");//same operation for FB main page 

String LoginPageTitle = driver.getTitle();//getTitle()
System.out.println("LoginPageTitle =" +LoginPageTitle);

Thread.sleep(4000);

driver.manage().window().minimize();
driver.quit();
}
}
