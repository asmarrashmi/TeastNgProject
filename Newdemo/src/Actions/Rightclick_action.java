package Actions;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Rightclick_action {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//driver.findElement(By.id("//*[@id=\"select-class-example\"]/fieldset/legend"));
		Actions action = new Actions(driver);

		WebElement element = driver.findElement(By.xpath("//*[@id=\\\"select-class-example\\\"]/fieldset/legend"));
		action.contextClick(element).click().perform();
		
	}

}
