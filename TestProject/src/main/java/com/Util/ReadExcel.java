package com.Util;

import org.testng.annotations.DataProvider;

import com.Base.BaseClass;

public class ReadExcel extends BaseClass{
	
	@DataProvider(name = "filterData")
	public Object[][] filterData()
	{
		int rowCount = sheet.getPhysicalNumberOfRows();
	    Object[][] data = new Object[rowCount-1][5];

	    for (int i=1; i<rowCount; i++) {
	        data[i-1][0] = sheet.getRow(i).getCell(0).getStringCellValue();
	        data[i-1][1] = sheet.getRow(i).getCell(1).getStringCellValue();
	        data[i-1][2] = sheet.getRow(i).getCell(2).getStringCellValue();
	        data[i-1][3] = sheet.getRow(i).getCell(3).getStringCellValue();
	        data[i-1][4] = sheet.getRow(i).getCell(4).getStringCellValue();
	    }
	    return data;
	}
	

}
