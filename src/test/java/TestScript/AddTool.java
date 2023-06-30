package TestScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AddTool {

	public static void main(String[] args) 
	{
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
			Thread.sleep(1000);

			driver.findElement(By.xpath ("//html/body/div[1]/div/div/ul/li[4]/a")).click();
			Thread.sleep(1000);

			
			driver.findElement(By.xpath("//a[@class='btn btn-outline-danger btn-flat btn-sm float-right']")).click();
			driver.findElement(By.xpath("//input[@id='tool_no']")).sendKeys("3456");
			driver.findElement(By.xpath("//input[@id='tool_name']")).sendKeys("Hammer");
			driver.findElement(By.xpath("//input[@id='tool_make']")).sendKeys("Shruti");
			driver.findElement(By.xpath("//textarea[@id='tool_description']")).sendKeys("This is useful tool");
			driver.findElement(By.xpath("//textarea[@name='other']")).sendKeys("This is useful tool");
			driver.findElement(By.xpath ("button[@onclick='return add()']"));
			
			//Thread.sleep(3000);
			driver.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
