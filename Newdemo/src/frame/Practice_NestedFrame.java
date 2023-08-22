package frame;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Practice_NestedFrame {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		
		 //maximize windows
		 driver.manage().window().maximize();
		
		 //open url
		 driver.get("https://the-internet.herokuapp.com/nested_frames");
	    //driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
	    WebElement top= driver.findElement(By.name("frame-top"));
	    driver.switchTo().frame("frame-top");
	    WebElement text = driver.findElement(By.name("frame-left"));
	    driver.switchTo().frame("frame-left");
	    String str= text.getText();
	    System.out.println(str);
	  
	     
	     
	     

	}

	private static char[] getText() {
		// TODO Auto-generated method stub
		return null;
	}

}
