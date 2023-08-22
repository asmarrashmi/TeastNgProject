package calender;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Open browser
	    WebDriver driver = new ChromeDriver();
	    // Open URL
	    driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	    driver.manage().window().maximize();
	    driver.findElement(By.xpath("//input[@id=\"ctl00_mainContent_view_date1\"]")).click();
	    List<WebElement> days=driver.findElements(By.xpath("//td[@data-month=\"6\"]"));
	    String date="25";
	    for(WebElement day:days) {
	      if(day.getText().equalsIgnoreCase(date)) {
	        day.click();
	        break;
	      }
	    }
	    
	    //To click on Return date field
	    driver.findElement(By.xpath("//input[@id=\"ctl00_mainContent_view_date2\"]")).click();
	    //Thread.sleep(2000);
	    //driver.findElement(By.xpath("//a[@title=\"Next\"]")).click();
	    
	   String Monthdata="";
	    while(!(Monthdata.equals("September 2023"))) {
	      WebElement month=driver.findElement(By.xpath("(//div[@class=\"ui-datepicker-title\"])[2]"));
	      System.out.println(month.getText());
	      Monthdata=month.getText();
	      driver.findElement(By.xpath("//a[@title=\"Next\"]")).click();
	    }
	    
	    List<WebElement> Returndays=driver.findElements(By.xpath("//td[@data-month=\"7\"]"));
	    String date1="17";
	    
	      for(WebElement day:Returndays) { 
	        if(day.getText().equalsIgnoreCase(date1)) {
	          day.click(); 
	          break; 
	          }
	        }
	  }
	}

