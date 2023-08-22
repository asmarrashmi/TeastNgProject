import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;

//import junit.framework.Assert;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Desktop\\selenium\\chrome web driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://mail.google.com/gmail.com/*");
		driver.findElement(By.id("identifiredID"));WebDriver driver1= new ChromeDriver();
		driver1.get("http://www.javatpoint.com/");
		driver1.manage().window().maximize();
		driver1.findElement(By.xpath("//a[text()=' Java']")).click();
		driver1.close();
		Thread.sleep(5000);
		//Assert.assertTrue(verify_Java_tutorial_available());

			}
			
			public static boolean verify_Java_tutorial_available() {
				By driver;
				return true;
	}

}
