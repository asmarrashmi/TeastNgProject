package calender;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practiceOfCalenderDate {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	    driver.manage().window().maximize();
	    driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_1']")).click();
	    driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date1']")).click();
	    List<WebElement> days=driver.findElements(By.xpath("//td[@data-month=\"6\"]"));
	    String date= "25";
	    for (WebElement day:days){
	    	if(day.getText().equalsIgnoreCase(date)) {
	    	day.click();
	    	break;
	    	
	    	}
	    }
	    driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date2']")).click();
	    List<WebElement> days1=driver.findElements(By.xpath("//td[@data-month='8']"));
	    String date1="6";
	    for(WebElement day:days1) { 
	        if(day.getText().equalsIgnoreCase(date1)) {
	          day.click(); 
	          break; 
	    	
	    }
	} 
	 
}
	}

