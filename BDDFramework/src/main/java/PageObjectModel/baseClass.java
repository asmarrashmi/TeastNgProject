package PageObjectModel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class baseClass {

	public WebDriver driver ;
	public void intilization() throws IOException {
		
		FileInputStream fis = new FileInputStream("C:\\Users\\Lenovo\\eclipse-workspace\\BDDFramework\\src\\main\\java\\PageObjectModel\\Data.properties");
		Properties pro = new Properties();
		pro.load(fis);
		String browser = pro.getProperty("browser");
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
