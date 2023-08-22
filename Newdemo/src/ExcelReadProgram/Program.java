package ExcelReadProgram;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.collect.Table.Cell;

public class Program {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		 File file = new File("C:\\Users\\Lenovo\\Desktop\\selenium class\\exelsheet\\Book1.xlsx");
	        
	        //Create an object of FileInputStream class to read excel file
	        FileInputStream inputStream = new FileInputStream(file);
	        
	        //create object of XSSFWorkbook class for .xlsx file
	        XSSFWorkbook fileName = new XSSFWorkbook(inputStream);
	        
	        //Read sheet inside the workbook by its name
	        XSSFSheet sheet = fileName.getSheet("Sheet1");
	        
	        //To select the Row
	        Row row = sheet.getRow(0);
	        
	        //To select cell
	        org.apache.poi.ss.usermodel.Cell cell = row.getCell(1);
	        
	        Row row1 = sheet.getRow(1);
	        //To select cell
	        org.apache.poi.ss.usermodel.Cell cell1 = row1.getCell(0);
	        org.apache.poi.ss.usermodel.Cell cell2 = row1.getCell(1);
	        //System.out.println(row);
	        System.out.println(row);
	        
	        System.out.println(row1);
	        System.out.println(cell1);
	        System.out.println(cell2);
	        
	        String username=cell.toString();
	        String password=cell.toString();

	        //To Launch Crome Browser
	        WebDriver driver = new ChromeDriver();
	        //Open URL
	        driver.get("https://login.salesforce.com/?locale=in");
	        driver.findElement(By.xpath("//input[@id=\"username\"]")).sendKeys(username);
	        driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys(password);
	        //driver.findElement(By.xpath("//input[@id=\"Login\"]")).click();

			
		}

	}




