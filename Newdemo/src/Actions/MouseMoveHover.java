package Actions;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMoveHover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		Actions a = new Actions(driver);
		WebElement w = driver.findElement(By.xpath("//button[@id='mousehover']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(2,1000)", "");
		a.moveToElement(w).build().perform();
		

	}

}
