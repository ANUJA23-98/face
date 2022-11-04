package utility1;

import org.openqa.selenium.chrome.ChromeDriver;

public class simpleProg
{
	public static void main(String[] args)
		{
			
			System.setProperty("webdriver.chrome.driver", "E:\\Automation support\\chromedriver.exe");
			
			ChromeDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			
			
			//app open
			driver.get("https://www.facebook.com/");
			//driver.close();
			
			//provide mail
			driver.findElementByXPath("//*[@type='text']").sendKeys("anuja12589@gmail.com");
			//MethodnName.ReturnType.className
			
			//provide pass
			 driver.findElementByXPath("//*[@type='password']").sendKeys("52565854"); //If class name have space in bet then Selenium dosn't works
			
			//click on log in
			driver.findElementByXPath("//*[@name='login']").click();
			
			 //forgot pass
		/*	driver.findElementByXPath("//*[text()='Forgotten password?']").click(); 
			
			driver.findElementByXPath("//*[@type='text']").sendKeys("anuja123@gmail.com");
			
			//To cancel 
			driver.findElementByXPath("(//*[@role='button'])[3]").click();*/
		
		}
	}


