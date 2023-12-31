package PageObject;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;

public class LoginpageObject {
	WebDriver driver;
	public LoginpageObject (WebDriver driver2){
	driver = driver2;	
	}
	
	By userName= By.xpath("//input[@id='username']");
	By Password = By.xpath("//input[@id='password']");
	By loginbtn = By.xpath("//input[@id='Login']");
	By tryforfree = By.xpath("//a[@id='signup_link']");
	By Firstname = By.xpath("//input[@name='UserFirstName']");
	By Lastname = By.xpath("//input[@name='UserLastName']");
	By jobtitledrop = By.xpath("//select[@name='UserTitle']");
	public WebElement userName()
	{
		return driver.findElement(userName);
	}
	public WebElement Password()
	{
		return driver.findElement(Password);
	}
	public WebElement loginbtn()
	{
		return driver.findElement(loginbtn);
	}
	public WebElement tryforfree()
	{
		return driver.findElement(tryforfree);
	}
	public WebElement Firstname()
	{
		return driver.findElement(Firstname);
	}
	public WebElement Lastname()
	{
		return driver.findElement(Lastname);
	}
	public WebElement jobtitledrop()
	{
		return driver.findElement(jobtitledrop);
	}
	public Select selectclass(WebElement ele) {
	      Select sel = new Select(ele);
	      return sel;
	    }
	  
	  public Select selectDropDown(WebElement element) {
	    Select s1 = new Select(element);
	    return s1;  
	  }
}
