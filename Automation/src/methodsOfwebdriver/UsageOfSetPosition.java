package methodsOfwebdriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfSetPosition {
	public static void main(String[] args) throws Throwable {
		// instantiate the browser specific class
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		// define the new window driver
		driver.switchTo().newWindow(WindowType.WINDOW);
		Thread.sleep(2000);
		// set the size of the window
		// create a dimension type object
		Dimension targetwindowsize = new Dimension(200, 300);
		driver.manage().window().setSize(targetwindowsize);
		// specify the point of coordinate for new set screen
		// for this create new object of point class
		Point targetposition = new Point(250, 350);
		driver.manage().window().setPosition(targetposition);
		Thread.sleep(2000);
		driver.quit();
	}
}
