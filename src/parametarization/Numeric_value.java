package parametarization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Numeric_value {
	public static void main(String[] args) throws Throwable {
		
	

FileInputStream file=new FileInputStream("C:\\Users\\User\\Desktop\\para.xlsx");
//String data=WorkbookFactory.create(file).getSheet("sheet1").getRow(0).getCell(0).getStringCellValue();
//System.out.println(data);	
Double value=WorkbookFactory.create(file).getSheet("sheet1").getRow(0).getCell(2).getNumericCellValue();
System.out.println(value);
}}