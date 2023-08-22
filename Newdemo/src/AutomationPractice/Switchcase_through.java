package AutomationPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switchcase_through {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		//
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		 List<WebElement> labels = driver.findElements(By.xpath("//div[@id=\"checkbox-example\"]/fieldset/label"));
		 String value = "Option1";
		 switch(value) {
		 
		 case "Option1" :
			 //(label.getText().equalsIgnoreCase(value))
			   driver.findElement(By.xpath("//input[@value=\"option1\"]")).click();
			   System.out.println("Option1");
			 break;
		 case "Option2":
			 driver.findElement(By.xpath("//input[@value=\"option2\"]")).click();
			 System.out.println("option2");
			 break;
		 default:
			 driver.findElement(By.xpath("//input[@value=\"option3\"]")).click();
			 System.out.println("option3");
			 break;
		 }
		 //for click 'ok' alert;
		 driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
		 driver.switchTo().alert().accept();
		 //for send keys in message box
		 driver.findElement(By.xpath("//input[@name='enter-name']")).sendKeys("rashmi");
		 
		 
		 
		
		 
			 
		 }
		 
	//driver.switchTo().alert().sendKeys("Text");
	
		
	}


