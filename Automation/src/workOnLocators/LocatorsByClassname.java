package workOnLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsByClassname {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement loginbutton = driver.findElement(By.className("_42ft_4jy0_6lth_4jy6_4jy1selected_51sy"));
		loginbutton.click();
		Thread.sleep(3000);
		driver.quit();

	}
}
