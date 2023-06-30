package TestScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class login {

	public static void main(String[] args) {
		try
		{
			ChromeOptions options = new ChromeOptions ();
			options.addArguments("--remote-allow-origins=*");
			WebDriver driver=new ChromeDriver (options);
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-selenium\\TMS\\chromedriver.exe");
			driver.get("http://tms.pisystindia.com/siteengineer/login");
			
			//WebElement email= driver.findElement(By.xpath("//input[@type='email']"));
			//email.sendKeys("siteengineer@gmail.com");
			
			WebElement email=driver.findElement(By.id("siteengineer_email"));
			email.sendKeys("siteengineer@gmail.com");
			
			WebElement password=driver.findElement(By.id("siteengineer_password"));
			password.sendKeys("123456");
			
			WebElement signin=driver.findElement(By.xpath("//button[@type='submit']"));
			signin.click();
			
			Thread.sleep(7000);
			driver.close();

			
			
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}

		

	}

}
