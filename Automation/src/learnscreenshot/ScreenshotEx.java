package learnscreenshot;

import java.io.File;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenshotEx {
	public static void main(String[] args) throws Throwable {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://shop-global.malaicha.com/");
		TakesScreenshot t = (TakesScreenshot)driver;
		File tempaddress=t.getScreenshotAs(OutputType.FILE);
		String address= tempaddress.getAbsolutePath();
		System.out.println(address);
		String timestamp= LocalDateTime.now().toString().replace(':', '-');
		File permanentaddress= new File("./errorShots/"+timestamp+"screen.png");
		Files.copy(tempaddress,permanentaddress);
		driver.quit();
	}

}
