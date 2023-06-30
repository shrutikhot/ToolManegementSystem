package TestScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AddComponentTMS {
	public static void main(String args[])
	{
		try
		{
			ChromeOptions options = new ChromeOptions ();
			options.addArguments("--remote-allow-origins=*");
			WebDriver driver=new ChromeDriver (options);
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-selenium\\TMS\\chromedriver.exe");
			//driver.get("http://tms.pisystindia.com/siteengineer/tools/addview");
			driver.get("http://tms.pisystindia.com/siteengineer/login");
			driver.findElement(By.xpath("//input[@type='email']")).sendKeys("siteengineer@gmail.com");
			driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
			driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
			Thread.sleep(1000);
			
			
		}
		catch (Exception e)
		{
			
		}
	}

}
