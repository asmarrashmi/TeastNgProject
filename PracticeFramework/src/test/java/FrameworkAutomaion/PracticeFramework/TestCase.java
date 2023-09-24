package FrameworkAutomaion.PracticeFramework;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import BaseClass.Baseclass;
import BaseClass.locaters;

public class TestCase extends Baseclass {
	
	
	
	public void locatersadd()
		{
			locaters obj = new locaters(driver); 
			obj.Firstname().sendKeys("rashmi");
			
			
		}
	

@BeforeMethod
public void OpenApplication() throws IOException
	{
		intilization();
		driver.get("https://login.salesforce.com/?locale=in");
		driver.manage().window().maximize();
	}
@AfterMethod
public void CloseApplication()
{
	driver.close();
}
}