package com.FileOprationsTests;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import jxl.CellFeatures;
import jxl.CellType;
import jxl.LabelCell;
import jxl.Workbook;
import jxl.format.CellFormat;
import jxl.write.Label;
import jxl.write.WritableCell;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class C6_ExcelWrite_JXL {

	public static void main(String[] args) throws IOException, RowsExceededException, WriteException {
		// TODO Auto-generated method stub
		FileOutputStream fos = new FileOutputStream(
				"F:\\TrainingBatches\\Batches\\B7_Oct16th2019\\Selenium\\Files\\xls_FileWriting.xls");

		WritableWorkbook wb = Workbook.createWorkbook(fos);
		WritableSheet wsh = wb.createSheet("DemoExcelWrite", 1);
		Label lbl1 = new Label(0, 0, "S.No");
		Label lbl2 = new Label(0, 1, "001");

		wsh.addCell(lbl1);
		wsh.addCell(lbl2);

		wb.write();
		wb.close();

		System.out.println("Excel Sheet written");
	}

}

//Tasks
//1) Print All Sheet Names.
//2) Get the Number of a particular Sheet
//3) Read all the Data from Excel 1 and Write all the Data into Excel 2. Write Cell by cell






