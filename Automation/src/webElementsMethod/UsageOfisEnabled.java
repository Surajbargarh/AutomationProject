package webElementsMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfisEnabled {
	public static void main(String[] args) throws Throwable {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ssc.nic.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement submitbtn = driver.findElement(By.id("btnSubmit"));
		//submitbtn.click();
		if(submitbtn.isEnabled())
		{
			System.out.println("the btn is enabled evenif username and pwd field is empty ");
		}
		else
		{
			System.out.println("the btn is disabled and verified with the condition of empty username and pwd textfield ");
		}
		Thread.sleep(3000);
		driver.quit();
		
		
		
		
	
	
	
	
	}
	

}
