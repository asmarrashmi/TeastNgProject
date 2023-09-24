package Alerts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Simple_alert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		//
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		 List<WebElement> labels = driver.findElements(By.xpath("//div[@id=\"checkbox-example\"]/fieldset/label"));
		
		 //for click 'ok' alert;
		 driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
		
		 driver.switchTo().alert().accept();
		 //for send keys in message box
		 driver.findElement(By.xpath("//input[@name='enter-name']")).sendKeys("rashmi");
		 
		 //for dismiss message.
		 driver.findElement(By.xpath("//input[@id='confirmbtn']")).click();
		 //Thread.sleep(8000);
		 driver.switchTo().alert().dismiss();
		 driver.close();
		
		 
	}

}
