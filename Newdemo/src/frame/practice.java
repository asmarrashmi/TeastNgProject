package frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		
		//maximize windows
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		
		//switch frame
		driver.switchTo().frame("frame-top");
		driver.switchTo().frame("frame-left");
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("frame-top");
		driver.switchTo().frame("frame-right");
		
		driver.switchTo().defaultContent();
		
		
		driver.switchTo().defaultContent();
		driver.switchTo().parentFrame();
		driver.switchTo().frame("frame-top");
		driver.switchTo().frame("frame-right");
		driver.switchTo().parentFrame();
		driver.switchTo().frame("frame-top");
		driver.switchTo().frame("frame-middle");
		
		//driver.switchTo().frame("frame-top");
		//driver.switchTo().frame("frame-left");
	
		//driver.switchTo().defaultContent();
	
		
		//driver.switchTo().frame("frame-top");
		//driver.switchTo().frame("frame-bottom");
		//driver.switchTo().frame("frame-top");
		
		WebElement element=driver.findElement(By.tagName("body"));
		String str=element.getText();
		String left= element.getText();
	//driver.findElement(By.xpath("/html/frameset"));
		System.out.println(str);
		System.out.println(left);
	}

}
