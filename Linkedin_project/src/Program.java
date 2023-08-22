import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;


public class Program {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","E:\\Automation jar files\\driver\\chromedriver.exe");
WebDriver driver= new ChromeDriver();
driver.get("http://www.javatpoint.com/");
driver.manage().window().maximize();
driver.findElement(By.xpath("//a[text()=' Java']")).click();
driver.close();
Thread.sleep(5000);
Assert.assertTrue(verify_Java_tutorial_available());

	}
	
	public static boolean verify_Java_tutorial_available() {
		driver.findElement(By.xpath("//span[text()='Java Tutorial']"));
		return true;
		
	}

}
