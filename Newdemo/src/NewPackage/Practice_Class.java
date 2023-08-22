package NewPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		//for get title of website
		driver.getTitle();
		System.out.println(driver.getTitle());
		driver.navigate().back();
		driver.quit();
		//for new window create object of that interface
	//	WebDriver driver1 = new ChromeDriver();
		//driver1.get("https://www.makemytrip.com/");
		//driver.close();
		//driver.quit();
		String str1 = "rashmi";
		String str2 = "Rashmi";
		boolean result = str1.equals(str2);
		driver.switchTo();
	

}
}
