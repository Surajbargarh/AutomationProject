package webElementsMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfgetLocation {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://omayo.blogspot.com/");
		Point txtfld = driver.findElement(By.id("ta1")).getLocation();
		//Point class toString method is overridden so that if we pass the ref then it will print the 
		//value
		System.out.println(txtfld);
		System.out.println("x location"+ txtfld.getX()+"y loaction"+ txtfld.getY());
		//getlocation() returns Point (Point is a selenium class)
		//used to get the relative position of element 
		driver.manage().window().minimize();
		driver.quit();
		
		
		
		
															
		
	}

}
	