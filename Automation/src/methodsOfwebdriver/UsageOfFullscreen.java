package methodsOfwebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfFullscreen {
public static void main(String[] args) throws Throwable {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.nationalgeographic.com/environment");
	Thread.sleep(3000);
	driver.manage().window().fullscreen();
	Thread.sleep(3000);
	driver.quit();
	
	
}
}
