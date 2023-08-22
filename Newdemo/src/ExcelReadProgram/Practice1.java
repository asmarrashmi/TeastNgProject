package ExcelReadProgram;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File file= new File ("C:\\\\Users\\\\Lenovo\\\\Desktop\\\\selenium class\\\\exelsheet\\\\Book1.xlsx");
		FileInputStream input= new FileInputStream(file);
		XSSFWorkbook filename = new XSSFWorkbook(input);
		XSSFSheet sheet = filename.getSheet("sheet1");
		XSSFWorkbook wb = filename;
		//Row row = sheet.getRow(0);
		//XSSFSheet sheet1 = wb.getSheetAt(0);
		for (Row myrow: sheet)
		{
			String con = "";
			for (Cell mycell: myrow)
			{
				con += mycell +"|";
				//System.out.println(mycell);
				//System.out.printf("| %-10s | %-8s | %4s |%n", mycell, "Password", "Raj",sheet);
			}
			System.out.println
			(con);
		}
		
		
		//Cell coll = row.getCell(0);
		//Row row1 = sheet.getRow(1);
		//Cell coll1 = row.getCell(1);
		//System.out.println(row);
		//System.out.println(coll);
		 //String username=coll.toString();
	       // String password=coll.toString();
		
		// WebDriver driver = new ChromeDriver();
	        //Open URL
	        //driver.get("https://login.salesforce.com/?locale=in");
	       //driver.findElement(By.xpath("//input[@id=\"username\"]")).sendKeys(username);
	        //driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys(password);
		
		
		

	}

}
