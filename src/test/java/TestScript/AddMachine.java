package TestScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AddMachine {

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
			
			driver.findElement(By.xpath("//a[@href='http://tms.pisystindia.com/siteengineer/machine']")).click();
			
			driver.findElement(By.xpath("//a[@class='btn btn-outline-danger btn-flat btn-sm float-right']")).click();
			
			driver.findElement(By.xpath("//input[@id='machine_name']")).sendKeys("printer");
			driver.findElement(By.xpath("//input[@id='machine_no']")).sendKeys("5674");
			driver.findElement(By.xpath("//textarea[@id='machine_description']")).sendKeys("It is used for printing");
			driver.findElement(By.xpath("//input[@id='image']")).sendKeys("C:\\Users\\hp\\Downloads\\printer.jpg");
			
			driver.findElement(By.xpath("//button[@onclick='return add()']")).click();
			Thread.sleep(3000);
		    driver.close();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
		/*
		
		//2. Invalid machine name(only digits) and rest all valid data
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
			
			driver.findElement(By.xpath("//a[@href='http://tms.pisystindia.com/siteengineer/machine']")).click();
			
			driver.findElement(By.xpath("//a[@class='btn btn-outline-danger btn-flat btn-sm float-right']")).click();
			
			driver.findElement(By.xpath("//input[@id='machine_name']")).sendKeys("12345");
			driver.findElement(By.xpath("//input[@id='machine_no']")).sendKeys("5672");
			driver.findElement(By.xpath("//textarea[@id='machine_description']")).sendKeys("It is used for printing");
			driver.findElement(By.xpath("//input[@id='image']")).sendKeys("C:\\Users\\hp\\Downloads\\printer.jpg");
			
			driver.findElement(By.xpath("//button[@onclick='return add()']")).click();
			Thread.sleep(1000);
		    //driver.close();	
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		//3. Invalid machine name(only special symbol) and rest all valid data
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
					
					driver.findElement(By.xpath("//a[@href='http://tms.pisystindia.com/siteengineer/machine']")).click();
					
					driver.findElement(By.xpath("//a[@class='btn btn-outline-danger btn-flat btn-sm float-right']")).click();
					
					driver.findElement(By.xpath("//input[@id='machine_name']")).sendKeys("@#$");
					driver.findElement(By.xpath("//input[@id='machine_no']")).sendKeys("5670");
					driver.findElement(By.xpath("//textarea[@id='machine_description']")).sendKeys("It is used for printing");
					driver.findElement(By.xpath("//input[@id='image']")).sendKeys("C:\\Users\\hp\\Downloads\\printer.jpg");
					
					driver.findElement(By.xpath("//button[@onclick='return add()']")).click();
					Thread.sleep(1000);
				    //driver.close();
					
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				
			//4. Invalid machine name(blank) and rest all valid data
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
					
					driver.findElement(By.xpath("//a[@href='http://tms.pisystindia.com/siteengineer/machine']")).click();
					
					driver.findElement(By.xpath("//a[@class='btn btn-outline-danger btn-flat btn-sm float-right']")).click();
					
					driver.findElement(By.xpath("//input[@id='machine_name']")).sendKeys("");
					driver.findElement(By.xpath("//input[@id='machine_no']")).sendKeys("5675");
					driver.findElement(By.xpath("//textarea[@id='machine_description']")).sendKeys("It is used for printing");
					driver.findElement(By.xpath("//input[@id='image']")).sendKeys("C:\\Users\\hp\\Downloads\\printer.jpg");
					
					driver.findElement(By.xpath("//button[@onclick='return add()']")).click();
					Thread.sleep(1000);
				    //driver.close();
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				//5. Invalid machine name(combination of alphabets and digits) and rest all valid data
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
					
					driver.findElement(By.xpath("//a[@href='http://tms.pisystindia.com/siteengineer/machine']")).click();
					
					driver.findElement(By.xpath("//a[@class='btn btn-outline-danger btn-flat btn-sm float-right']")).click();
					
					driver.findElement(By.xpath("//input[@id='machine_name']")).sendKeys("printer2");
					driver.findElement(By.xpath("//input[@id='machine_no']")).sendKeys("5665");
					driver.findElement(By.xpath("//textarea[@id='machine_description']")).sendKeys("It is used for printing");
					driver.findElement(By.xpath("//input[@id='image']")).sendKeys("C:\\Users\\hp\\Downloads\\printer.jpg");
					
					driver.findElement(By.xpath("//button[@onclick='return add()']")).click();
					Thread.sleep(1000);
				    //driver.close();
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				//6. Invalid machine number(only special symbol) and rest all valid data
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
					
					driver.findElement(By.xpath("//a[@href='http://tms.pisystindia.com/siteengineer/machine']")).click();
					
					driver.findElement(By.xpath("//a[@class='btn btn-outline-danger btn-flat btn-sm float-right']")).click();
					
					driver.findElement(By.xpath("//input[@id='machine_name']")).sendKeys("printer");
					driver.findElement(By.xpath("//input[@id='machine_no']")).sendKeys("@#$");
					driver.findElement(By.xpath("//textarea[@id='machine_description']")).sendKeys("It is used for printing");
					driver.findElement(By.xpath("//input[@id='image']")).sendKeys("C:\\Users\\hp\\Downloads\\printer.jpg");
					
					driver.findElement(By.xpath("//button[@onclick='return add()']")).click();
					Thread.sleep(1000);
				    //driver.close();
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				//7. Invalid machine number(combination of digits and special symbol) and rest all valid data
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
					
					driver.findElement(By.xpath("//a[@href='http://tms.pisystindia.com/siteengineer/machine']")).click();
					
					driver.findElement(By.xpath("//a[@class='btn btn-outline-danger btn-flat btn-sm float-right']")).click();
					
					driver.findElement(By.xpath("//input[@id='machine_name']")).sendKeys("printer");
					driver.findElement(By.xpath("//input[@id='machine_no']")).sendKeys("afd@#$");
					driver.findElement(By.xpath("//textarea[@id='machine_description']")).sendKeys("It is used for printing");
					driver.findElement(By.xpath("//input[@id='image']")).sendKeys("C:\\Users\\hp\\Downloads\\printer.jpg");
					
					driver.findElement(By.xpath("//button[@onclick='return add()']")).click();
					Thread.sleep(1000);
				    //driver.close();
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				//8. Invalid machine number(blank) and rest all valid data
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
					
					driver.findElement(By.xpath("//a[@href='http://tms.pisystindia.com/siteengineer/machine']")).click();
					
					driver.findElement(By.xpath("//a[@class='btn btn-outline-danger btn-flat btn-sm float-right']")).click();
					
					driver.findElement(By.xpath("//input[@id='machine_name']")).sendKeys("printer");
					driver.findElement(By.xpath("//input[@id='machine_no']")).sendKeys("");
					driver.findElement(By.xpath("//textarea[@id='machine_description']")).sendKeys("It is used for printing");
					driver.findElement(By.xpath("//input[@id='image']")).sendKeys("C:\\Users\\hp\\Downloads\\printer.jpg");
					
					driver.findElement(By.xpath("//button[@onclick='return add()']")).click();
					Thread.sleep(1000);
				    //driver.close();
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				//9. Invalid machine description(blank) and rest all valid data
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
					
					driver.findElement(By.xpath("//a[@href='http://tms.pisystindia.com/siteengineer/machine']")).click();
					
					driver.findElement(By.xpath("//a[@class='btn btn-outline-danger btn-flat btn-sm float-right']")).click();
					
					driver.findElement(By.xpath("//input[@id='machine_name']")).sendKeys("printer");
					driver.findElement(By.xpath("//input[@id='machine_no']")).sendKeys("");
					driver.findElement(By.xpath("//textarea[@id='machine_description']")).sendKeys("");
					driver.findElement(By.xpath("//input[@id='image']")).sendKeys("C:\\Users\\hp\\Downloads\\printer.jpg");
					
					driver.findElement(By.xpath("//button[@onclick='return add()']")).click();
					Thread.sleep(1000);
				    //driver.close();
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				
				//10. Invalid machine image (blank) and rest all valid data
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
					
					driver.findElement(By.xpath("//a[@href='http://tms.pisystindia.com/siteengineer/machine']")).click();
					
					driver.findElement(By.xpath("//a[@class='btn btn-outline-danger btn-flat btn-sm float-right']")).click();
					
					driver.findElement(By.xpath("//input[@id='machine_name']")).sendKeys("printer");
					driver.findElement(By.xpath("//input[@id='machine_no']")).sendKeys("");
					driver.findElement(By.xpath("//textarea[@id='machine_description']")).sendKeys("");
					driver.findElement(By.xpath("//input[@id='image']")).sendKeys("");
					
					driver.findElement(By.xpath("//button[@onclick='return add()']")).click();
					Thread.sleep(1000);
				    //driver.close();
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				*/

	}

}
