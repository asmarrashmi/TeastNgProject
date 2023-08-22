package calender;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Makemytrip_calender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
	     driver.get("https://www.makemytrip.com/");
	    driver.manage().window().maximize();
	   // driver.findElement(By.className("//div[@class='choosFrom appendBottom20'] ")).click();
	    driver.getWindowHandle();
	   // driver.findElement(By.className("headerOuter")).click();
	}

}
