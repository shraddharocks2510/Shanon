package parametarization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.usermodel.WorkbookProvider;

public class Parametarization_1 {
	public static void main(String[] args) throws Throwable {
		FileInputStream file=new FileInputStream("C:\\Users\\User\\Desktop\\para.xlsx");
		String data=WorkbookFactory.create(file).getSheet("sheet1").getRow(0).getCell(0).getStringCellValue();
	System.out.println(data);	
	//Double value=WorkbookFactory.create(file).getSheet("sheet1").getRow(0).getCell(2).getNumericCellValue();
	//System.out.println(value);
	//Boolean condition =WorkbookFactory.create(file).getSheet("sheet1").getRow(0).getCell(3).getBooleanCellValue();
	//System.out.println(condition);
	
	
	}

}
