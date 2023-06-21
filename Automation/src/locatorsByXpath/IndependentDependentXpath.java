package locatorsByXpath;

import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IndependentDependentXpath {
public static void main(String[] args) throws Throwable {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/signup");
	//WebElement createButton=driver.findElement(By.partialLinkText("Create"));
	//createButton.click();
	WebElement maleRadiobutton =driver.findElement(ByXPath.xpath("//label[text()='Male']/../input[@type='radio']"));
	maleRadiobutton.click();
	Thread.sleep(3000);
	driver.quit();
	
	
}
}
