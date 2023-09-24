package DataProvider;

import java.io.File;
import java.io.FileInputStream;

import javax.security.auth.spi.LoginModule;

import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Demo {
		File file= new File("C:\\\\Users\\\\Lenovo\\\\Desktop\\\\selenium class\\\\exelsheet\\\\Book1.xlsx");
		 FileInputStream inputStream = new FileInputStream(file);
	        
	        //create object of XSSFWorkbook class for .xlsx file
	        XSSFWorkbook fileName = new XSSFWorkbook(inputStream);
	        
	        //Read sheet inside the workbook by its name
	        XSSFSheet sheet = fileName.getSheet("Sheet1");
	    public Object[][] dataProviderMethod() {
	        return new Object[][] { { "data one" }, { "data two" }, { "data three" } };
	    }

	    @Test(dataProvider = "data-provider")
	    public void testMethod(String data) {
	        System.out.println("Data is: " + data);
	}

	public FileInputStream FileInputStream(File file) {
		// TODO Auto-generated method stub
		return null;
	}

	public XSSFWorkbook XSSFWorkbook(java.io.FileInputStream inputstream) {
		// TODO Auto-generated method stub
		return null;
	}
}
