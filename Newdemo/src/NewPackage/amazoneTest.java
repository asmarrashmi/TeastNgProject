package NewPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazoneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone15");
		driver.findElement(By.id("nav-search-submit-text")).click();
		driver.findElement(By.id("nav-hamburger-menu")).click();
		//driver.close();
		driver.findElement(By.className("hmenu-close-icon")).click();
		driver.findElement(By.className("a-icon-checkbox")).click();
		driver.findElement(By.className("a-color-base")).click();
		WebDriver driver1 = new ChromeDriver();
		driver1.get("https://www.makemytrip.com/");
	}

}
