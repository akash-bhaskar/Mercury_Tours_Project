package utility;


import java.util.Hashtable;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumOperations 
{
	public static ChromeDriver driver=null;
	
	public static Hashtable<String, Object> outputParameters= new Hashtable<String,Object>();
	
	public static Hashtable<String, Object> browserLaunch(Object[] inputParameters)
	{
		try 
		{
		String key=(String) inputParameters[0];
		String value=(String) inputParameters[1];
				System.setProperty(key, value);
				driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				
				outputParameters.put("STATUS", "PASS");
				outputParameters.put("MESSAGE", "MethodUsed : browserLaunch, Input given : "+inputParameters[0]);
		} catch (Exception e) 
		{
			outputParameters.put("STATUS", "FAIL");
			outputParameters.put("MESSAGE", "MethodUsed : browserLaunch, Input given : "+inputParameters[0]);
		}
		return outputParameters;
	}
	public static Hashtable<String, Object> openApplication(Object[] inputParameters)
	{
		try 
		{
		String url=(String) inputParameters[0];
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		outputParameters.put("STATUS", "PASS");
		outputParameters.put("MESSAGE", "MethodUsed : openApplication, Input given : "+inputParameters[0]);
		} catch (Exception e) 
		{
			outputParameters.put("STATUS", "FAIL");
			outputParameters.put("MESSAGE", "MethodUsed : openApplication, Input given : "+inputParameters[0]);
		}
		return outputParameters;
	}
	public static Hashtable<String, Object> clickable(Object[] inputParameters)
	{
		try 
		{
		String path=(String) inputParameters[0];
		driver.findElement(By.xpath(path)).click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		outputParameters.put("STATUS", "PASS");
		outputParameters.put("MESSAGE", "MethodUsed : clickable, Input given : "+inputParameters[0]);
		} catch (Exception e) 
		{
			outputParameters.put("STATUS", "FAIL");
			outputParameters.put("MESSAGE", "MethodUsed : clickable, Input given : "+inputParameters[0]);
		}
		return outputParameters;
	}
	public static Hashtable<String, Object> sendText(Object[] inputParameters)
	{
		try 
		{
		String path=(String) inputParameters[0];
		String text=(String) inputParameters[1];
		driver.findElement(By.xpath(path)).sendKeys(text);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		outputParameters.put("STATUS", "PASS");
		outputParameters.put("MESSAGE", "MethodUsed : sendText, Input given : "+inputParameters[1]);
		} catch (Exception e) 
		{
			outputParameters.put("STATUS", "FAIL");
			outputParameters.put("MESSAGE", "MethodUsed : sendText, Input given : "+inputParameters[1]);
		}
		return outputParameters;
	}
	public static Hashtable<String, Object> select(Object[] inputParameters)
	{
		try 
		{
		String choose=(String) inputParameters[0];
		Select a=new Select(driver.findElement(By.xpath(choose))); 
		a.selectByVisibleText("INDIA");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		outputParameters.put("STATUS", "PASS");
		outputParameters.put("MESSAGE", "MethodUsed : select, Input given : "+inputParameters[0]);
		} catch (Exception e) 
		{
			outputParameters.put("STATUS", "FAIL");
			outputParameters.put("MESSAGE", "MethodUsed : select, Input given : "+inputParameters[0]);
		}
		return outputParameters;
	}
	public static Hashtable<String, Object> validation(Object[] inputParameters)
	{
		try 
		{
		String actualtext=(String) inputParameters[0];
		String locator=(String) inputParameters[1];
		String capturedText= driver.findElement(By.xpath(locator)).getText();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		outputParameters.put("STATUS", "PASS");
		outputParameters.put("MESSAGE", "MethodUsed : validation, Input given : "+inputParameters[0]);		
		if (actualtext.equalsIgnoreCase(capturedText)) 
		{
			System.out.println("Test Case Passed");
		}else 
		{
			System.out.println("Test Case failed");
		}
		} catch (Exception e) 
		{
			outputParameters.put("STATUS", "FAIL");
			outputParameters.put("MESSAGE", "MethodUsed : validation, Input given : "+inputParameters[0]);
		}
		return outputParameters;
	}
	
	//Main Method Starts 
	public static void main(String[] args) 
	{
		//launch browser
		Object [] input1=new Object[2];
			input1[0]="webdriver.chrome.driver";
			input1[1]="D:\\Automation Support\\Selenium\\chromedriver.exe";
		SeleniumOperations.browserLaunch(input1);
			
		//open Application
		Object [] input2=new Object[1];
			input2[0]="https://demo.guru99.com/test/newtours/index.php";
		SeleniumOperations.openApplication(input2);
		
		
		//click on register
		Object [] input3=new Object[1];
			input3[0]="//*[text()='REGISTER']";
		SeleniumOperations.clickable(input3);
			
		//enter first name
		Object [] input4=new Object[2];
			input4[0]="//*[@name='firstName']";
			input4[1]="Akash";
		SeleniumOperations.sendText(input4);
			
		//enter last name
		Object [] input5=new Object[2];
			input5[0]="//*[@name='lastName']";
			input5[1]="Bhaskar";
		SeleniumOperations.sendText(input5);
			
		//enter phone number
		Object [] input6=new Object[2];
			input6[0]="//*[@name='phone']";
			input6[1]="9011651247";
		SeleniumOperations.sendText(input6);
		
		//enter email address
		Object [] input7=new Object[2];
			input7[0]="//*[@id='userName']";
			input7[1]="bhaskarakash1104@gmail.com";
		SeleniumOperations.sendText(input7);
			
		//select country
		Object [] input8=new Object[1];
			input8[0]="//*[@name='country']";
		SeleniumOperations.select(input8);
						
		//click on submit
		Object [] input9=new Object[1];
			input9[0]="//*[@type='submit']";
		SeleniumOperations.clickable(input9);	
		
	}
	
}
