package com.FileOprationsTests;

import java.io.FileInputStream;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.read.biff.File;

public class C5_ExcelRead_JXL {

	public static void main(String[] args) throws BiffException, IOException {

		/*
		 * JXL : old. it can read only xls files Apache POI: new. it can read almost all
		 * ms office docs excel, word, outlook...etc
		 * 
		 * download JXL: goto
		 * https://sourceforge.net/projects/jexcelapi/files/jexcelapi/2.6.12/ download
		 * jexcelapi_2_6_12.zip extract the file in extracted folder you will find
		 * jxl.jar fie add it to build path
		 */

		// TODO Auto-generated method stub

		FileInputStream fis = new FileInputStream(
				"F:\\TrainingBatches\\Batches\\B7_Oct16th2019\\Selenium\\Files\\xls_FileReading.xls");

		// Getting the workBook object
		Workbook wb = Workbook.getWorkbook(fis);

		// Getting Sheet using sheeet number
		Sheet sht = wb.getSheet(0);

		System.out.println("Using Col and Row num:" + sht.getCell(5, 1).getContents());

		// Getting sheet using Sheet Name
		Sheet sht2 = wb.getSheet("TCs");

		System.out.println("Using String Cell Identifiers:" + sht.getCell("K5").getContents());

		// Read all the Values from Excel

		// Getting Row Count
		int rcnt = sht2.getRows();
		System.out.println("Number of Rows are :" + rcnt);

		// Getting Column Count
		int ccnt = sht2.getColumns();
		System.out.println("Nuber of Columns are :" + ccnt);

		// Getting All the Data
		for (int r = 0; r < rcnt; r++) {
			for (int c = 0; c < ccnt; c++) {
				System.out.println(sht2.getCell(c, r).getContents());
			}
			System.out.println("******Row" + (r) + "Completed******");
		}

		System.out.println("**************Particluar Data**************");
		// Get only Particlar set of Data
		for (int r = 0; r < rcnt; r++) {
			if (sht2.getCell(0, r).getContents().equalsIgnoreCase("TC_02")) {
				for (int c = 0; c < ccnt; c++) {
					System.out.println(sht2.getCell(c, r).getContents());
				}
				break;
			}
			System.out.println("******Row" + (r) + "Completed******");
		}

	}

}

//Task:
//Write a methods which returns the Column Number of a column
//Ex:getColumnNumber("TCNum") --> return int value starting from 0, if not found return -1

//Write a methods which checks the presence of the given data
//Ex: isValuePresent("sdl") --> Returns boolean value

//Write a method which returns the cell value of the particular data
//Ex: getCellNumber("TC_03") --> returns Map which has Column and Row values
