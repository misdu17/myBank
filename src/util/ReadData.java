package util;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import util.NewCustomersData;

public class ReadData {
	
	public ReadData() throws Exception{
		super();
	}
	
	int rows_total;
	NewCustomersData dataSheet = null;
	List<NewCustomersData> dataSheetList = new ArrayList<NewCustomersData>();
	Row row = null;
	Cell cell = null;
	
	public List<NewCustomersData> readDataFromExcel(String filePath, String sheetName) throws Exception{
		FileInputStream inputStream = new FileInputStream(filePath);
		Workbook myworkbook = WorkbookFactory.create(inputStream);
		Sheet sheet = myworkbook.getSheet(sheetName);
		rows_total = sheet.getLastRowNum();
		System.out.println(rows_total);
		for (int i=1; i<=rows_total;i++){
			row = sheet.getRow(i);
			dataSheet = new NewCustomersData();
			cell = (Cell) row.getCell(0);
			dataSheet.setNewCustomerNameField(cell.getStringCellValue());
			cell = (Cell) row.getCell(1);
			dataSheet.setGenderRadioButton(cell.getStringCellValue());
			cell = (Cell) row.getCell(2);
			dataSheet.setDateOfBirthField(cell.getStringCellValue());
			cell = (Cell) row.getCell(3);
			dataSheet.setAddressField(cell.getStringCellValue());
			cell = (Cell) row.getCell(4);
			dataSheet.setCityField(cell.getStringCellValue());
			cell = (Cell) row.getCell(5);
			dataSheet.setStateField(cell.getStringCellValue());
			cell = (Cell) row.getCell(6);
			dataSheet.setPinnoField(cell.getStringCellValue());
			cell = (Cell) row.getCell(7);
			dataSheet.setTelePhoneNoField(cell.getStringCellValue());
			cell = (Cell) row.getCell(8);
			dataSheet.setEmailIdField(cell.getStringCellValue());
			cell = (Cell) row.getCell(9);
			dataSheet.setPasswordField(cell.getStringCellValue());
			dataSheetList.add(dataSheet);
		}
		return dataSheetList;
	}
	

}
