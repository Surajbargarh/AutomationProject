package locatorsByXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathCompleteAttribute {
	public static void main(String[] args) throws Throwable {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://shop-global.malaicha.com/login");
		//Xpath by complete attribute
		//tag name=button,attribute=type,attribute value=submit.
		WebElement signinbutton= driver.findElement(By.xpath("//button[@type='submit']"));
		
		Thread.sleep(3000);
		signinbutton.click();
		Thread.sleep(2000);
		driver.quit();
	}

}
