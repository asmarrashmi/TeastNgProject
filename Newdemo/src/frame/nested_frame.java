package frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class nested_frame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//open browser
				WebDriver driver=new ChromeDriver();
				
				 //maximize windows
				 driver.manage().window().maximize();
				
				 //open url
				 //driver.get("https://www.selenium.dev/selenium/docs/api/java/org/openqa/selenium/package-frame.html");
			     driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");

			     //switch to first frame
			     WebElement iframeElement =driver.findElement(By.name("packageListFrame"));
			     driver.switchTo().frame(iframeElement);
			     
			     //find web element
			     driver.findElement(By.linkText("org.openqa.selenium")).click();
			     //switch to main page
				 driver.switchTo().defaultContent();
			     
				 //switch to first frame
				 driver.switchTo().frame(1);
			     //switch frame2nd
			     driver.findElement(By.linkText("Alert")).click();
			     
			     //main frame
			     driver.switchTo().defaultContent();
			     
			     //switch to first frame
			     int obj=driver.findElements(By.tagName("iframe")).size();
			     System.out.println("no of frame'"+obj);
			     
			     //switch to parent frame
			  driver.switchTo().frame("frame1");//parent frame /outer frame
			  driver.switchTo().frame("frame2");
			  System.out.println("frame1"+"frame2");
			}

	}


