package webElementsMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfisDisplayedMethod {
public static void main(String[] args) {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/login.do");
	//isdisplayed returns boolean and verify if the element is present or not
	if(driver.findElement(By.id("username")).isDisplayed())
	{
		System.out.println("the username textfield is displayed and verified");
	}
	else {
		System.out.println("username textfield is not displayed");
		
	}
	driver.quit();
	
}
}
