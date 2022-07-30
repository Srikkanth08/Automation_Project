package datadrivenFramework;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteData {

	public static void main(String[] args) throws Throwable {

		// Open the File in read mode
FileInputStream fis = new FileInputStream
("C:\\Users\\QSP-ADMIN\\Desktop\\inputData.xlsx");
		// Get the Control of the file
		Workbook wb = WorkbookFactory.create(fis);
		// Go to the particular Sheet
		Sheet sh = wb.getSheet("Sheet1");
		// Go to the particular Row
		Row r = sh.getRow(3);
		//prepare the particular Cell
		Cell c = r.createCell(2);
		// Get the cell String value
		c.setCellValue("Raghav Sir");
		
		// Open the File in write mode
		FileOutputStream fos = new FileOutputStream
				("C:\\Users\\QSP-ADMIN\\Desktop\\inputData.xlsx");
		//Save the file
		wb.write(fos);
		//Print a msg for our confirmation
		System.out.println("Done Writing");
		
		
		
		
		
		
		
		
		
		

	}

}
