package Actions;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Doubleclick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		Actions a = new Actions(driver);
		WebElement live = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		a.doubleClick(live).perform();
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
	}

}
