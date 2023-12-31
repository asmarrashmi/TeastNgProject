package Verifylogin;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import FirstDemo.BaseClass;
import PageObject.LoginpageObject;

public class Testcase extends  BaseClass {
	@Test
	public void login() throws IOException, InterruptedException {
		
		 
		 LoginpageObject objLoginpagepath = new LoginpageObject(driver);
		 objLoginpagepath.userName().sendKeys("rashmi");
		 objLoginpagepath.Password().sendKeys("Rashmi123");
		 objLoginpagepath.loginbtn().click();
		 objLoginpagepath.tryforfree().click();
		 Thread.sleep(5000);
		 objLoginpagepath.Firstname().sendKeys("abc");
		 objLoginpagepath.Lastname().sendKeys("Rashmiabc");
		Select objsel= objLoginpagepath.selectclass(objLoginpagepath.jobtitledrop());
		objsel.selectByIndex(1);
	}
	 @BeforeMethod
	  public void OpenApplication() throws IOException {
		 intilization();
	    driver.get("https://login.salesforce.com/?locale=in");
	  }
	
	 @AfterMethod
	  public void CloseApplication() throws IOException {
		 driver.close();
	  }
}
