package methodsOfwebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfminimize {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//standard practice:minimize the browser after the operations
		driver.manage().window().minimize();
		Thread.sleep(2000);
		driver.quit();
	}

}
