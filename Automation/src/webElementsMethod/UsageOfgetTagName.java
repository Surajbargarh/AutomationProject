package webElementsMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfgetTagName {
public static void main(String[] args) {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
	driver.get("http://omayo.blogspot.com/");
	WebElement ele = driver.findElement(By.name("fname"));
	System.out.println(ele.getTagName());
	driver.quit();
	
}
}
