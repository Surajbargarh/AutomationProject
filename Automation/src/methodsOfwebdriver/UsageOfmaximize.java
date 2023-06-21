package methodsOfwebdriver;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfmaximize {
	public static void main(String[] args) throws Throwable {
		//instantiate the browser specific class
		WebDriver driver = new ChromeDriver();
		//pre condition
		//maximize the browser to get better view of app
		//to utilize the browser in full capacity
		driver.manage().window().maximize();
		driver.get("https://www.dassault-aviation.com/en/");
	
		Thread.sleep(2000);
		driver.quit();
	}

}
