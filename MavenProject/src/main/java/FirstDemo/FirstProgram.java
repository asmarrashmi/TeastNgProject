package FirstDemo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstProgram{
	

	public void initializeBrowser() throws IOException {
	
	
	FileInputStream fis = new FileInputStream("C:\\Users\\Lenovo\\eclipse-workspace\\MavenProject\\src\\main\\java\\FirstDemo\\Data.Properties");
	Properties prop = new Properties();
	prop.load(fis);
	String browserName=prop.getProperty("browser");
	{
	
	if(browserName.equalsIgnoreCase("chrome"))
	{
		WebDriver driver = new ChromeDriver();
	}
	else if(browserName.equalsIgnoreCase("firefox"))
	{
		WebDriver driver = new FirefoxDriver();
	}
	else {
		System.out.println("Please select proper broser");
	}
	}
	}
}

	

