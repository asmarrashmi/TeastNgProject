package NewPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locaters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			WebDriver driver = new ChromeDriver();
			driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
			driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
			//driver.click();
			driver.findElement(By.linkText("Amritsar (ATQ)")).click();
			driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
			driver.findElement(By.linkText("Goa (GOI)")).click();
			driver.findElement(By.className("book")).click();
			driver.findElement(By.id("divpaxinfo")).click();
			driver.findElement(By.id("hrefIncAdt")).click();
			WebDriver driver1 = new ChromeDriver();
			//driver.findElement(By.id("checkBoxOption2")).click();
			driver1.get("https://rahulshettyacademy.com/AutomationPractice/");
			//driver1.findElement(By.xpath("//label[@id='checkBoxOption1']")).click();
			
			
	}

}
