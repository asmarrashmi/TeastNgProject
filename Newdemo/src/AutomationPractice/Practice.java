package AutomationPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		//
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		 List<WebElement> labels = driver.findElements(By.xpath("//div[@id=\"checkbox-example\"]/fieldset/label"));
		    String value="Option2";
		    //List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type=\"checkbox\"]"));
		    for (WebElement label : labels) {

		     /* if (label.getText().equalsIgnoreCase(value)) {

		        driver.findElement(By.xpath("//input[@value=\"option1\"]")).click();

		      } else if ((label.getText().equalsIgnoreCase(value))) {

		        driver.findElement(By.xpath("//input[@value=\"option2\"]")).click();
		      } else if ((label.getText().equalsIgnoreCase(value))) {

		        driver.findElement(By.xpath("//input[@value=\"option3\"]")).click();
		      }*/
		String s= label.getText();
		driver.findElement(By.xpath("//input[@value=\""+s+"\"]")).click();
		System.out.println(label.getText());
		
		

	}
		    

}
}