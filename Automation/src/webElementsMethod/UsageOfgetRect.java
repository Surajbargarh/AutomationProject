package webElementsMethod;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfgetRect {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	driver.get("http://omayo.blogspot.com/");
	 WebElement image = driver.findElement(By.xpath("//div[@id='HTML29']/child::div/img"));
	//getRect() returns rectangle and rectangle is a selenium class
	//getRect()  is a replacement of getLocation and getSize method
	//it help us to find both x & Y coordinate and also the height and width of the element
    //Rectangle class toString is not overridden so that it print the address
	Rectangle r = image.getRect();
	System.out.println(r);
	System.out.println("get height"+r.getHeight());
	System.out.println("get width"+r.getWidth());
	System.out.println("get y coordinate"+r.getY());
	System.out.println("get x coordinate"+r.getX());
	driver.quit();
       
}
}
