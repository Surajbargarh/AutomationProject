package webElementsMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfSubmit {
public static void main(String[] args) throws Throwable {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
	driver.get("http://omayo.blogspot.com/");
	//find element--->> xpath by partial main/subtag text 
	WebElement element = driver.findElement(By.xpath("//button[contains(.,' LogIn ')]"));
	element.submit();
	Thread.sleep(3000);
	driver.quit();
}
}
