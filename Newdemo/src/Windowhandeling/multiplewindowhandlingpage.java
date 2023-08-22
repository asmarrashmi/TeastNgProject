package Windowhandeling;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class multiplewindowhandlingpage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		 driver.manage().window().maximize();
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,250)", "");
		 driver.findElement(By.xpath("//*[@id=\"newWindowBtn\"]")).click();
		 System.out.println(driver.getCurrentUrl());
		 Set<String> windowname = driver.getWindowHandles();
		 Iterator<String> it= windowname.iterator();
		 String parentwindow= it.next();
		 String childwindow = it.next();
		 System.out.println(driver.getCurrentUrl());
		 
	}

}
