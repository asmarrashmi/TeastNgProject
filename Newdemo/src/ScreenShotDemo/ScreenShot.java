package ScreenShotDemo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//for entire screen
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotFile , new File("C:\\Users\\Lenovo\\Desktop\\rashi\\Screenshotselenium\\screenshot1.png"));
		//Particular web webElement SS and send keys.
		WebElement name = driver.findElement(By.xpath("//input[@id='name']"));
		name.sendKeys("rashmi");
		File screenshotFile1 = name.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotFile1 , new File("C:\\Users\\Lenovo\\Desktop\\rashi\\Screenshotselenium\\screenshot2.png"));
		
	}

}
