package parametarization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Boolean {
	public static void main(String[] args) throws Throwable {
		FileInputStream file=new FileInputStream("C:\\Users\\User\\Desktop\\para.xlsx");
		
	boolean condition =WorkbookFactory.create(file).getSheet("sheet1").getRow(0).getCell(3).getBooleanCellValue();
		System.out.println(condition);
		
	}

}
