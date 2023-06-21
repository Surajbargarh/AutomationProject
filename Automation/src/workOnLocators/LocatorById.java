package workOnLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorById {
	public static void main(String[] args) throws Throwable {
//		instantiate the browser
		WebDriver driver=new ChromeDriver();
//		maximize the browser 
		driver.manage().window().maximize();
//		pass the URL of the app
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
//		identify the login button by id
		WebElement emailtextfield = driver.findElement(By.id("input-email"));
         emailtextfield.click();
         Thread.sleep(3000);
         driver.quit();
		
		
		
	}

}
