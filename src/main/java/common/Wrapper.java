package common;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Wrapper {

	static String excelPath="C:\\Users\\AnithaRaman\\eclipse-workspace1\\ElearningExercise\\resource\\testdata.xlsx";
	static String sheet="Sheet1";
	
	
	
	public static String getDataFromExcel(int row, int col) throws IOException {
	    FileInputStream fs = new FileInputStream(excelPath);
	        
	        //workbook declaration
	        Workbook wb = new XSSFWorkbook(fs);
	        
	        //Sheet declaration
	        Sheet sh = wb.getSheet(sheet);
	        Row rows = sh.getRow(row);
	        Cell cell = rows.getCell(col);
	    //    String val = cell.getStringCellValue();
	    //    System.out.println("Value is " + val);
	        
	        DataFormatter df = new DataFormatter();
	    String formatValue =    df.formatCellValue(cell);
	    System.out.println("Formated value " + formatValue);
	    wb.close();
	    return formatValue;
	    }
	    
     	
}
