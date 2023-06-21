package workOnLocators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsByTagname {
public static void main(String[] args) {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://shop-global.malaicha.com/login");
	//driver.findElement(By.tagName(""))
	//because tag name button has duplicates.
	driver.quit();
	
}
}
