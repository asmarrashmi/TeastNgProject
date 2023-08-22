package NewPackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Time;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class SeleniumProject {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
	    driver.get("https://www.facebook.com");
	    driver.manage().window().maximize();
	    driver.findElement(By.id("email")).sendKeys("asmarrashmi00523@gmail.com");
	    driver.findElement(By.id("pass")).sendKeys("rashmi");
	    driver.findElement(By.name("login")).click();
	    TimeUnit.MILLISECONDS.sleep(10000); 
	    driver.close();
	    

	}

}
