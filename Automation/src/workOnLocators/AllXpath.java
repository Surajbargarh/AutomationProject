package workOnLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllXpath {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://shop-global.malaicha.com/");
//		find the login | register button by id 
		// driver.findElement(By.id("my-acc-btn")).click();
		// find element by class name
		// driver.findElement(By.className("transparent")).click();
		// find element by css selector
//		driver.findElement(By.cssSelector("button[class='transparent'")).click();
		driver.findElement(By.xpath("//button[text()='Login  |  Register']")).click();
		driver.close();
	}

}
