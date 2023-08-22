import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login_page {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// WebDriver d;
		System.setProperty("webdriver.chrome.driver","E:\\Automation jar files\\driver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.linkedin.com");
		d.findElement(By.id("session_key")).sendKeys("asmarrashmi00523@gmail.com");
		d.findElement(By.id("session_password")).sendKeys("Canyaman@123");
		d.findElement(By.xpath("//*[@id=\"main-content\"]/section[1]/div/div/form/button")).click();
		String u=d.getCurrentUrl();
		if(u.equals("//*[@id=\"main-content\"]/section[1]/div/div/form/button"))
		{
				System.out.println("Test case passed");
				
		}
		else
		{
			System.out.println("Test case faild");
		}
		d.close();
	}
	

}

