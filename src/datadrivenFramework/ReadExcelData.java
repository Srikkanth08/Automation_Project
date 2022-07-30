package datadrivenFramework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcelData {
	//Guide the control
	public static void main(String[] args) throws Throwable {
		//Open the File in read mode
		FileInputStream fis = new FileInputStream
				("C:\\Users\\QSP-ADMIN\\Desktop\\inputData.xlsx");
		//Get the Control of the file
		Workbook wb = WorkbookFactory.create(fis);
		//Go to the particular Sheet
		Sheet sh = wb.getSheet("Sheet1");
		//Go to the particular Row
		Row r = sh.getRow(4);
		//Go to the particular Cell
		Cell c = r.getCell(1);
		//Get the cell String value
		String val = c.getStringCellValue();
		//Print it
		System.out.println(val);
		
		
		
	}

}
