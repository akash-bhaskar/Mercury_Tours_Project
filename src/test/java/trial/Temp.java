package trial;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Temp 
{
	public static void main(String[] args) 
	{
		//launch browser
		System.setProperty("webdriver.chrome.driver", "D:\\Automation Support\\Selenium\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			
		//open Application
			driver.get("https://demo.guru99.com/test/newtours/index.php");
		
		//click on register
			driver.findElement(By.xpath("//*[text()='REGISTER']")).click();
			
		//enter first name
			driver.findElement(By.xpath("//*[@name='firstName']")).sendKeys("Akash");
			
		//enter last name
			driver.findElement(By.xpath("//*[@name='lastName']")).sendKeys("Bhaskar");
			
		//enter phone number
			driver.findElement(By.xpath("//*[@name='phone']")).sendKeys("9011651247");
		
		//enter email address
			driver.findElement(By.xpath("//*[@id='userName']")).sendKeys("bhaskarakash1104@gmail.com");
			
		//select country
			Select a=new Select(driver.findElement(By.xpath("//*[@name='country']"))); 
				a.selectByVisibleText("INDIA");
			
		//click on submit
			driver.findElement(By.xpath("//*[@type='submit']")).click();
		
	}
}
