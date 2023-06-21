package workOnLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GrowW {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.get("https://groww.in/");
		// driver.findElement(By.tagName("div")).click();
		// driver.findElement(By.xpath("//span[text()='Get started']")).click();
		// driver.findElement(By.className("absolute-center btn51ParentDimension")).click();//not running
		// driver.findElement(By.className("absolute-center")).click();//not running
		driver.findElement(By.className("btn51ParentDimension")).click();// running

		Thread.sleep(2000);
		driver.quit();
	}

}
