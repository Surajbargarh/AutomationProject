package methodsOfwebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetCurrentUrl {
	public static void main(String[] args) throws Throwable {
		//instantiate the browser
		WebDriver driver= new ChromeDriver();
		//pass the main url
		driver.get("https://demo.actitime.com/");
		//go and capture the main URL of the web page
		//we can capture the triggered URl in the browser
		String actualLoginPageUrl=driver.getCurrentUrl();
		System.out.println("actual login page url="+ actualLoginPageUrl);
	    
		//verify the url of the login page
		String expectedLoginPageUrl="https://demo.actitime.com/";
		System.out.println("actual login page url is"+expectedLoginPageUrl );
		if(actualLoginPageUrl.contains("login.do"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail:url is not matching");
		}
		Thread.sleep(4000);
		driver.quit();
	}
	

}
