package testcases;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CommonExcelIntegration {

	public static String[][] readData (String excelFileName) throws IOException {
		//locate the workbook
		XSSFWorkbook wb=new XSSFWorkbook("./data/"+excelFileName+".xlsx");
		//worksheet
		XSSFSheet ws = wb.getSheetAt(0);
		//rowCount
		int rowCount= ws.getLastRowNum();
		System.out.println( rowCount);
		//columnCount
		int columnCount = ws.getRow(2).getLastCellNum();
		System.out.println(columnCount);
		
		String[][] data=new String[rowCount][columnCount];
		
		//entireData
		for (int i = 1; i <= rowCount; i++) {
			for (int j = 0; j < columnCount; j++) {
				String stringCellValue2 = ws.getRow(i).getCell(j).getStringCellValue();
				//System.out.println(stringCellValue2);
				data[i-1][j]=stringCellValue2 ;//data[0][0]
				
			}
			
		}
		
		wb.close();
		return data;
		
		

	}

}
