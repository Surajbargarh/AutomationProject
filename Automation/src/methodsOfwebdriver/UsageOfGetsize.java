package methodsOfwebdriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetsize {
	public static void main(String[] args) throws Throwable {
		//instantiate the browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//open a new window 
		driver.switchTo().newWindow(WindowType.WINDOW);
		Thread.sleep(2000);
		Dimension targetsize= new Dimension(300, 400);
		//set the size of the window
		driver.manage().window().setSize(targetsize);
		Point Position= new Point(202, 402);
		//set the position of the window
		driver.manage().window().setPosition(Position);
		//get the size of the window
		driver.manage().window().getSize();
		int windowHeight=targetsize.getHeight();
		System.out.println("height of the window"+windowHeight);
		int windowWidth= targetsize.getWidth();
		System.out.println("width of the window"+windowWidth);
		//capture the window position
		int windowpositionX= Position.getX();
		System.out.println("start x"+windowpositionX);
		int windowpositionY = Position.getY();
		System.out.println("start y"+windowpositionY);
		Thread.sleep(3000);
		driver.quit();
		
		
	}

}
