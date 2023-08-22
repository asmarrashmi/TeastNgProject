package Windowhandeling;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		 driver.manage().window().maximize();
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,250)", "");
		 driver.findElement(By.xpath("//*[@id=\"newWindowBtn\"]")).click();
		 System.out.println(driver.getCurrentUrl());
		 Set<String> windowname= driver.getWindowHandles();
		 Iterator<String> it = windowname.iterator();
		 String parentwindow= it.next();
		 String childwindow = it.next();
		 driver.switchTo().window(childwindow);
		 driver.manage().window().maximize();
		 //System.out.println(driver.getCurrentUrl());
		 driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("rashmi");
		 driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Asmar");
		 driver.findElement(By.xpath("//input[@id='femalerb']")).click();
		 WebElement checkbox= driver.findElement(By.xpath("//*[@id=\"post-body-7593811851313663875\"]/div/div/label"));
		 String value= "englishchbx";
		 switch(value) {
		 case "englishchbx":
		 
			 driver.findElement(By.id("englishchbx")).click();
			 System.out.println("englishchbx");
			 //break;

		 case "hindichbx":{
			 
			 driver.findElement(By.id("hindichbx")).click();
			 System.out.println("hindichbx");
			// break;
			 
		 }
		 driver.switchTo().window(parentwindow);
		 //driver.quit();
		 
		 }
	}
}
	




