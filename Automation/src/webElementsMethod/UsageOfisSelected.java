package webElementsMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfisSelected {
	public static void main(String[] args) throws Throwable {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement keeplogincheckbox = driver.findElement(By.id("keepLoggedInCheckBox"));
		keeplogincheckbox.click();
		Thread.sleep(5000);
		if(keeplogincheckbox.isSelected())
		{
			System.out.println("the keeplogin check box is selected");
		}
		else
		{
			System.out.println("keeplogin check box not working");
		}
		driver.quit();
		
		

}
	}

