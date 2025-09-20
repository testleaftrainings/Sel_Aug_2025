package testcases;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
		//locate the workbook
		XSSFWorkbook wb=new XSSFWorkbook("./data/createLead.xlsx");
		//worksheet
		XSSFSheet ws = wb.getSheetAt(0);
		//row
		/*
		 * XSSFRow row = ws.getRow(1); //System.out.println(row); XSSFCell cell =
		 * row.getCell(1);
		 */
		
		String stringCellValue = ws.getRow(1).getCell(1).getStringCellValue();
		System.out.println(stringCellValue);
		//header row
		/*
		 * int physicalNumberOfRows = ws.getPhysicalNumberOfRows();
		 * System.out.println(physicalNumberOfRows);
		 */
		int rowCount= ws.getLastRowNum();
		System.out.println( rowCount);
		//columnCount
		int columnCount = ws.getRow(2).getLastCellNum();
		System.out.println(columnCount);
		
		//entireData
		for (int i = 1; i <= rowCount; i++) {
			for (int j = 0; j < columnCount; j++) {
				String stringCellValue2 = ws.getRow(i).getCell(j).getStringCellValue();
				System.out.println(stringCellValue2);
				
			}
			
		}
		
		wb.close();
		
		

	}

}
