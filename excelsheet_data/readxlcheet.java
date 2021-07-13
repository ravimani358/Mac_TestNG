package excelsheet_data;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readxlcheet {

	public static void main(String[] args) throws IOException {
		
		XSSFWorkbook wb = new XSSFWorkbook("./Data/CreateLead.xlsx");
		
		XSSFSheet ws = wb.getSheet("Sheet1");
		
		int rowcount  = ws.getLastRowNum();
		
		int cellcount = ws.getRow(1).getLastCellNum();
		
		for(int i=1; i< rowcount; i++) {
			for(int j=0; j< cellcount; j++) {
				
				String cellValue = ws.getRow(i).getCell(j).getStringCellValue();
				System.out.println(cellValue);
				
			}
		}
		
		wb.close();

	}

}
