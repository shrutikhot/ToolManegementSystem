package TestScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AddToolTMS {
	
	public static void main (String args[])
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
			driver.findElement(By.xpath("//html/body/div[1]/div/div/ul/li[4]/a")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//a[@class='btn btn-outline-danger btn-flat btn-sm float-right']")).click();
			driver.findElement(By.xpath("//input[@id=\"tool_no\"]")).sendKeys("1237");
			driver.findElement(By.xpath("//input[@id=\"tool_name\"]")).sendKeys("hammer");
			driver.findElement(By.xpath("//input[@id=\"tool_make\"]")).sendKeys("shruti");
			driver.findElement(By.xpath("//select[@id=\"select_tool_type\"]")).sendKeys("Standard Tool");
			driver.findElement(By.xpath("//textarea[@id=\"tool_description\"]")).sendKeys("ABCD");
			driver.findElement(By.xpath("//textarea[@id=\"other\"]")).sendKeys("ABCD");
			driver.findElement(By.xpath("//input[@class=\"form-check-input-reverse\"]")).click();
			driver.findElement(By.xpath("//button[@onclick=\"return add()\"]")).click();
			Thread.sleep(2000);
			//driver.close();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		//2. invalid tool no.(only alphabets0 and rest all valid data
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
			driver.findElement(By.xpath("//html/body/div[1]/div/div/ul/li[4]/a")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//a[@class='btn btn-outline-danger btn-flat btn-sm float-right']")).click();
			driver.findElement(By.xpath("//input[@id=\"tool_no\"]")).sendKeys("asd");
			driver.findElement(By.xpath("//input[@id=\"tool_name\"]")).sendKeys("hammer");
			driver.findElement(By.xpath("//input[@id=\"tool_make\"]")).sendKeys("shruti");
			driver.findElement(By.xpath("//select[@id=\"select_tool_type\"]")).sendKeys("Standard Tool");
			driver.findElement(By.xpath("//textarea[@id=\"tool_description\"]")).sendKeys("ABCD");
			driver.findElement(By.xpath("//textarea[@id=\"other\"]")).sendKeys("ABCD");
			driver.findElement(By.xpath("//input[@class=\"form-check-input-reverse\"]")).click();
			driver.findElement(By.xpath("//button[@onclick=\"return add()\"]")).click();
			Thread.sleep(2000);
			//driver.close();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		//3. invalid tool no.(only special symbol) and rest all valid data
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
			driver.findElement(By.xpath("//html/body/div[1]/div/div/ul/li[4]/a")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//a[@class='btn btn-outline-danger btn-flat btn-sm float-right']")).click();
			driver.findElement(By.xpath("//input[@id=\"tool_no\"]")).sendKeys("#@$");
			driver.findElement(By.xpath("//input[@id=\"tool_name\"]")).sendKeys("hammer");
			driver.findElement(By.xpath("//input[@id=\"tool_make\"]")).sendKeys("shruti");
			driver.findElement(By.xpath("//select[@id=\"select_tool_type\"]")).sendKeys("Standard Tool");
			driver.findElement(By.xpath("//textarea[@id=\"tool_description\"]")).sendKeys("ABCD");
			driver.findElement(By.xpath("//textarea[@id=\"other\"]")).sendKeys("ABCD");
			driver.findElement(By.xpath("//input[@class=\"form-check-input-reverse\"]")).click();
			driver.findElement(By.xpath("//button[@onclick=\"return add()\"]")).click();
			Thread.sleep(2000);
			//driver.close();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		//4. invalid tool no.(blank) and rest all valid data
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
					driver.findElement(By.xpath("//html/body/div[1]/div/div/ul/li[4]/a")).click();
					Thread.sleep(1000);
					driver.findElement(By.xpath("//a[@class='btn btn-outline-danger btn-flat btn-sm float-right']")).click();
					driver.findElement(By.xpath("//input[@id=\"tool_no\"]")).sendKeys("");
					driver.findElement(By.xpath("//input[@id=\"tool_name\"]")).sendKeys("hammer");
					driver.findElement(By.xpath("//input[@id=\"tool_make\"]")).sendKeys("shruti");
					driver.findElement(By.xpath("//select[@id=\"select_tool_type\"]")).sendKeys("Standard Tool");
					driver.findElement(By.xpath("//textarea[@id=\"tool_description\"]")).sendKeys("ABCD");
					driver.findElement(By.xpath("//textarea[@id=\"other\"]")).sendKeys("ABCD");
					driver.findElement(By.xpath("//input[@class=\"form-check-input-reverse\"]")).click();
					driver.findElement(By.xpath("//button[@onclick=\"return add()\"]")).click();
					Thread.sleep(2000);
					//driver.close();
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
				//5. invalid tool name (blank) and rest all valid data
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
					driver.findElement(By.xpath("//html/body/div[1]/div/div/ul/li[4]/a")).click();
					Thread.sleep(1000);
					driver.findElement(By.xpath("//a[@class='btn btn-outline-danger btn-flat btn-sm float-right']")).click();
					driver.findElement(By.xpath("//input[@id=\"tool_no\"]")).sendKeys("6754");
					driver.findElement(By.xpath("//input[@id=\"tool_name\"]")).sendKeys("");
					driver.findElement(By.xpath("//input[@id=\"tool_make\"]")).sendKeys("shruti");
					driver.findElement(By.xpath("//select[@id=\"select_tool_type\"]")).sendKeys("Standard Tool");
					driver.findElement(By.xpath("//textarea[@id=\"tool_description\"]")).sendKeys("ABCD");
					driver.findElement(By.xpath("//textarea[@id=\"other\"]")).sendKeys("ABCD");
					driver.findElement(By.xpath("//input[@class=\"form-check-input-reverse\"]")).click();
					driver.findElement(By.xpath("//button[@onclick=\"return add()\"]")).click();
					Thread.sleep(2000);
					//driver.close();
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
				
				//6. invalid tool name (only digits) and rest all valid data
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
					driver.findElement(By.xpath("//html/body/div[1]/div/div/ul/li[4]/a")).click();
					Thread.sleep(1000);
					driver.findElement(By.xpath("//a[@class='btn btn-outline-danger btn-flat btn-sm float-right']")).click();
					driver.findElement(By.xpath("//input[@id=\"tool_no\"]")).sendKeys("6754");
					driver.findElement(By.xpath("//input[@id=\"tool_name\"]")).sendKeys("2341");
					driver.findElement(By.xpath("//input[@id=\"tool_make\"]")).sendKeys("shruti");
					driver.findElement(By.xpath("//select[@id=\"select_tool_type\"]")).sendKeys("Standard Tool");
					driver.findElement(By.xpath("//textarea[@id=\"tool_description\"]")).sendKeys("ABCD");
					driver.findElement(By.xpath("//textarea[@id=\"other\"]")).sendKeys("ABCD");
					driver.findElement(By.xpath("//input[@class=\"form-check-input-reverse\"]")).click();
					driver.findElement(By.xpath("//button[@onclick=\"return add()\"]")).click();
					Thread.sleep(2000);
					//driver.close();
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
				
				//7. invalid tool name (only special symbol) and rest all valid data
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
					driver.findElement(By.xpath("//html/body/div[1]/div/div/ul/li[4]/a")).click();
					Thread.sleep(1000);
					driver.findElement(By.xpath("//a[@class='btn btn-outline-danger btn-flat btn-sm float-right']")).click();
					driver.findElement(By.xpath("//input[@id=\"tool_no\"]")).sendKeys("6754");
					driver.findElement(By.xpath("//input[@id=\"tool_name\"]")).sendKeys("@#$");
					driver.findElement(By.xpath("//input[@id=\"tool_make\"]")).sendKeys("shruti");
					driver.findElement(By.xpath("//select[@id=\"select_tool_type\"]")).sendKeys("Standard Tool");
					driver.findElement(By.xpath("//textarea[@id=\"tool_description\"]")).sendKeys("ABCD");
					driver.findElement(By.xpath("//textarea[@id=\"other\"]")).sendKeys("ABCD");
					driver.findElement(By.xpath("//input[@class=\"form-check-input-reverse\"]")).click();
					driver.findElement(By.xpath("//button[@onclick=\"return add()\"]")).click();
					Thread.sleep(2000);
					//driver.close();
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
				
				//8. invalid tool make (blank) and rest all valid data
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
					driver.findElement(By.xpath("//html/body/div[1]/div/div/ul/li[4]/a")).click();
					Thread.sleep(1000);
					driver.findElement(By.xpath("//a[@class='btn btn-outline-danger btn-flat btn-sm float-right']")).click();
					driver.findElement(By.xpath("//input[@id=\"tool_no\"]")).sendKeys("6754");
					driver.findElement(By.xpath("//input[@id=\"tool_name\"]")).sendKeys("hammer");
					driver.findElement(By.xpath("//input[@id=\"tool_make\"]")).sendKeys("");
					driver.findElement(By.xpath("//select[@id=\"select_tool_type\"]")).sendKeys("Standard Tool");
					driver.findElement(By.xpath("//textarea[@id=\"tool_description\"]")).sendKeys("ABCD");
					driver.findElement(By.xpath("//textarea[@id=\"other\"]")).sendKeys("ABCD");
					driver.findElement(By.xpath("//input[@class=\"form-check-input-reverse\"]")).click();
					driver.findElement(By.xpath("//button[@onclick=\"return add()\"]")).click();
					Thread.sleep(2000);
					//driver.close();
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
				
				//9. invalid tool make (only digits) and rest all valid data
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
					driver.findElement(By.xpath("//html/body/div[1]/div/div/ul/li[4]/a")).click();
					Thread.sleep(1000);
					driver.findElement(By.xpath("//a[@class='btn btn-outline-danger btn-flat btn-sm float-right']")).click();
					driver.findElement(By.xpath("//input[@id=\"tool_no\"]")).sendKeys("6754");
					driver.findElement(By.xpath("//input[@id=\"tool_name\"]")).sendKeys("hammer");
					driver.findElement(By.xpath("//input[@id=\"tool_make\"]")).sendKeys("980");
					driver.findElement(By.xpath("//select[@id=\"select_tool_type\"]")).sendKeys("Standard Tool");
					driver.findElement(By.xpath("//textarea[@id=\"tool_description\"]")).sendKeys("ABCD");
					driver.findElement(By.xpath("//textarea[@id=\"other\"]")).sendKeys("ABCD");
					driver.findElement(By.xpath("//input[@class=\"form-check-input-reverse\"]")).click();
					driver.findElement(By.xpath("//button[@onclick=\"return add()\"]")).click();
					Thread.sleep(2000);
					//driver.close();
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
				
				//10. invalid tool make (only special symbol) and rest all valid data
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
					driver.findElement(By.xpath("//html/body/div[1]/div/div/ul/li[4]/a")).click();
					Thread.sleep(1000);
					driver.findElement(By.xpath("//a[@class='btn btn-outline-danger btn-flat btn-sm float-right']")).click();
					driver.findElement(By.xpath("//input[@id=\"tool_no\"]")).sendKeys("6754");
					driver.findElement(By.xpath("//input[@id=\"tool_name\"]")).sendKeys("hammer");
					driver.findElement(By.xpath("//input[@id=\"tool_make\"]")).sendKeys("@#$");
					driver.findElement(By.xpath("//select[@id=\"select_tool_type\"]")).sendKeys("Standard Tool");
					driver.findElement(By.xpath("//textarea[@id=\"tool_description\"]")).sendKeys("ABCD");
					driver.findElement(By.xpath("//textarea[@id=\"other\"]")).sendKeys("ABCD");
					driver.findElement(By.xpath("//input[@class=\"form-check-input-reverse\"]")).click();
					driver.findElement(By.xpath("//button[@onclick=\"return add()\"]")).click();
					Thread.sleep(2000);
					//driver.close();
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
		
		
	}

}
