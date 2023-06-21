package seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeLaunch {
public static void main(String[] args) {
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://accounts.stockedge.com/Account/Login?ReturnUrl=%2Fconnect%2Fauthorize%2Fcallback%3Fclient_id%3D463cb477-c9e2-4268-99f1-0deb0caa0f21%26redirect_uri%3Dhttps%253A%252F%252Fstockedge.com%252Fauthorization-code%252Fcallback%26response_type%3Dcode%26scope%3Dopenid%2520profile%2520email%2520se.website%26code_challenge%3DWR0GbFYZ_6fonfbjyYUA4QZW3qkrAFJkGApNnm5EF3Y%26code_challenge_method%3DS256%26state%3DOpenIdConnect.AuthenticationProperties%253DfK0O19aECqZyxNH4zKRIXLYrY9ZSKBHIAs-gtnwganRQuh8kNm-DMjBrshSLL7Egx1FxAUGH_9MAnqF9-F_qSAluTtRLq7PW8cwxt7SQFTRxEtiG8GlO2YnSa75Ol5tuGhPWFT0jIy0_fjIPu32gP7O-K13vxKhPbPVJs2rCwaHVynlVjRWM6ZP0nADspi8S37V1By6CQdBYMSou6p2M9Tvw5sD4aPZ423bFVInXChGfEQzvWDlZmkDbk2F_rXHr6mAQPAAUgtpxHIaMw5teBw%26response_mode%3Dform_post%26lang%3Den%26x-client-SKU%3DID_NET461%26x-client-ver%3D5.3.0.0");
	WebElement a=driver.findElement(By.name("Username"));
	a.sendKeys("sg2611994@gmail.com");
	WebElement b= driver.findElement(By.name("Password"));
	b.sendKeys("12345678");
	driver.findElement(By.name("button")).click();
	
	String exptitle="Best Indian Stock Market App for Android and iPhone - StockEdge";
	String acttitle=driver.getTitle();
	if(exptitle.equalsIgnoreCase(acttitle))
	{
		System.out.println("test pass");
	}
	else
	{
	System.out.println("fail");	
	}
	//driver.
}
}
