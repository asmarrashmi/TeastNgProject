package calender;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Skyscanner {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 WebDriver driver = new ChromeDriver();
			driver.get("https://www.goibibo.com/");
		    driver.manage().window().maximize();
		    driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[1]/div/div/div[2]/span/span")).click();
		    driver.findElement(By.xpath("//*[@id=\"root\"]/div[4]/div/div/ul/li[2]/span[2]")).click();
		    driver.findElement(By.xpath("//*[@id=\"root\"]/div[4]/div/div/div[1]/div[1]/div/div/p")).click();
		    WebElement E=  driver.findElement(By.xpath("//*[@id=\"root\"]/div[4]/div/div/div[1]/div[1]/div/div[2]/div/input"));
		    E.sendKeys("Mumbai");
		   // driver.findElement(by.)
		 Thread.sleep(2000);
		 //WebDriverWait wait = new WebDriverWait(driver,time);
		   driver.findElement(By.xpath("//*[@id=\"autoSuggest-list\"]/li[1]")).click();
		   WebElement R =driver.findElement(By.xpath("//*[@id=\"root\"]/div[4]/div/div/div[1]/div[2]/div/div[2]/div/input"));
		  
		   R.sendKeys("Dubai");
		   
		   //R.click();
		   Thread.sleep(2000);
		   driver.findElement(By.xpath("//*[@id=\"autoSuggest-list\"]/li[1]/div")).click();
		   /*List<WebElement> s= (List<WebElement>) driver.findElement(By.xpath("//*[@id=\"root\"]/div[4]/div/div/div[1]/div[3]/div[2]/div[2]/div/div/div[2]/div[2]/div[3]/div[1]/div[3]/p"));
		   ((WebElement) s).click();
		   String str= "25";
		   for(WebElement day: s) {
			   if(((WebElement) s).getText().equalsIgnoreCase(str))
				   ((WebElement) s).click();
			  */ 
		   Thread.sleep(5000);
		   driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/p[1]")).click();
		   driver.findElement(By.xpath("//span[@class='sc-12foipm-21 lerOcM fswDownArrow fswDownArrowTraveller']"));
		   Thread.sleep(2000);
		  driver.findElement(By.xpath("//span[text()='Travellers & Class']/following-sibling::p/span")).click();
		  Thread.sleep(2000);
		
		  for(int i = 0; i<=7; i++) {
			  driver.findElement(By.xpath("//p[text()='Adults']/following-sibling::div/span[3]")).click();
			 
		   }
		  
		  for (int i=0; i<3; i++) {
			  driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div/div/div[1]/div[5]/div[2]/div[2]/div/div[1]/div[2]/div/span[3]")).click();
		  }
		  driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div/div/div[2]/div[1]/div")).click();
			  
	}
}

		    
		    
		   
	


