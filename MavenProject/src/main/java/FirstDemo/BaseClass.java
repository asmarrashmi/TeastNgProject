package FirstDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	
	public WebDriver driver;
	public void intilization() throws IOException
	{
		FileInputStream fis = new FileInputStream("C:\\\\Users\\\\Lenovo\\\\eclipse-workspace\\\\MavenProject\\\\src\\\\main\\\\java\\\\FirstDemo\\\\Data.Properties");
		//for read the file
		Properties pros = new Properties();
		//for load all file data
		pros.load(fis);
		String browser = pros.getProperty("browser");
		System.out.println(browser);
			if(browser.equalsIgnoreCase("Chrome"))
				
			{
				 driver = new ChromeDriver();
			}
			else if(browser.equalsIgnoreCase("FireFox")) 
			{
				
			
				 driver = new FirefoxDriver();
			}
			else
			{
				System.out.println("Select proper browser");
			}
			
		
		
	}
	

	 
	
}
