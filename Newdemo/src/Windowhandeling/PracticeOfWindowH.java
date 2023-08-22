package Windowhandeling;

import java.awt.Window;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.netty.util.AsciiString;

public class PracticeOfWindowH {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		    
		    driver.findElement(By.xpath("//button[@id=\"openwindow\"]")).click();
		    System.out.println(driver.getCurrentUrl());
		    Set<String> windowname= driver.getWindowHandles();
		    Iterator<String> it= windowname.iterator();
		   String parentwindow= it.next();
		   String chidwindow= it.next();
		   driver.switchTo().window(chidwindow);
		   System.out.println(driver.getCurrentUrl());
		   driver.quit();
	}

}
