package workOnLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorbyId2 {
	public static void main(String[] args) throws Throwable {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
//		since here the id of login button is dynamic
//		so we go for next priority i.e by name
		WebElement loginButton=driver.findElement(By.name("login"));
		loginButton.click();
		Thread.sleep(5000);
		driver.quit();

	}

}
