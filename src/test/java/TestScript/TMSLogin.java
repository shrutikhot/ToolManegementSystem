package TestScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TMSLogin {

	public static void main(String[] args) {
		try
		{
			ChromeOptions options = new ChromeOptions ();
			options.addArguments("--remote-allow-origins=*");
			WebDriver driver=new ChromeDriver(options);
			System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse_selenium-Shruti\\ToolManegementSystem\\chromedriver.exe");
			driver.get("http://tms.pisystindia.com/siteengineer/login");
			driver.findElement(By.xpath("//input[@type='email']")).sendKeys("siteengineer@gmail.com");
			driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			Thread.sleep(3000);
			driver.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		//2. invalid username valid password
		
		try
		{
			ChromeOptions options=new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			WebDriver driver=new ChromeDriver(options);
			System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\hp\\\\eclipse_selenium-Shruti\\\\ToolManegementSystem\\\\chromedriver.exe");
			driver.get("http://tms.pisystindia.com/siteengineer/login");
			driver.findElement(By.xpath("//input[@type='email']")).sendKeys("site@gmail.com");
			driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			Thread.sleep(3000);
			driver.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		

	}

}
