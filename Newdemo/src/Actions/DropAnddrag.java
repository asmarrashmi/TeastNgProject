package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DropAnddrag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		WebElement source = driver.findElement(By.xpath("//*[@id=\"gallery\"]/li[1]/img"));
		WebElement target = driver.findElement(By.xpath("//div[@id='trash']"));
		Actions act=new Actions(driver);
		act.dragAndDrop(source, target).build().perform();
		
	}

}
