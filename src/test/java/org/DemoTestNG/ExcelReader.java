package org.DemoTestNG;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

public class ExcelReader {
	
	@DataProvider
	public String[][] getData() throws EncryptedDocumentException, IOException
	{
		
		String excelsheetname = "Login";
		//step 1
		File f = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Data\\InputDataNew.xlsx");
	
	    FileInputStream fis = new FileInputStream(f);
		
		//step 2
		
		Workbook wb = WorkbookFactory.create(fis);
	
	    //step 3
		Sheet sheetname = wb.getSheet(excelsheetname);
		
		//step 4
		
		int rows = sheetname.getPhysicalNumberOfRows();
	    System.out.println(rows);
	    
	    int cols = sheetname.getRow(0).getPhysicalNumberOfCells();
	    System.out.println(cols);
	    
	    //Step 5
	    
	    DataFormatter format = new DataFormatter();
	    
	    String[][] testdata = new String[rows-1][cols];
	    
	    for(int r = 1; r<rows; r++)
	    {
	    	for(int c = 0; c<cols; c++)
	    	{
	    		testdata[r-1][c]= format.formatCellValue(sheetname.getRow(r).getCell(c));
	    	
	    	    System.out.println(testdata[r-1][c]);
	    	}
	    }
	    
	    return testdata;
	}

}
