package methodsOfwebdriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfSetSize {
	public static void main(String[] args) throws Throwable {
		// instantiate the browser specific class
		WebDriver driver = new ChromeDriver();
		// maximize the window
		driver.manage().window().maximize();
		// pass the main url
		driver.get("https://www.facebook.com/");
		// define the new window web driver
		driver.switchTo().newWindow(WindowType.WINDOW);
		Thread.sleep(2000);
		Dimension targetWindowSize = new Dimension(200, 300);
		// assign the specified dimension to setsize(Dimension targetsize)
		driver.manage().window().setSize(targetWindowSize);

	}

}
