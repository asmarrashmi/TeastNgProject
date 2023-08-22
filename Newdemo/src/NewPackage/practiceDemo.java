package NewPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practiceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://web.telegram.org/k/");
		driver.manage().window().maximize();
		driver.findElement(By.id("chatlist-container")).sendKeys("Rashmi");
	}

}
