package workOnLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WrongIdlocatorAdd {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	WebElement Loginbutton = driver.findElement(By.id("u_0_5_K6"));
	 //NoSuchElementException - run - unchecked - Selenium
	 //Reason - When we write the wrong address
	Loginbutton.click();
	driver.quit();
}
}
