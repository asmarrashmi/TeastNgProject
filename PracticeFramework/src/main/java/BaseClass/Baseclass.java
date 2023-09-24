package BaseClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class Baseclass {

	public WebDriver driver;
	public void intilization() throws IOException {
		
		FileInputStream fis = new FileInputStream(System.getProperty("User.dir")+"\\src\\main\\java\\BaseClass\\Data.properties)");
		Properties pro = new Properties();
		pro.load(fis);
		String browser = pro.getProperty("Chrome");
	}
	
}

