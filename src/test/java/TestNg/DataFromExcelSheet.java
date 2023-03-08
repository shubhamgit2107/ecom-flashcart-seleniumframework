package TestNg;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import ecom_Flashcart_genericUtility.FileInputConstant;
import ecom_Flashcart_genericUtility_externalfileutility.ExcelsheetxlxsUtility;

public class DataFromExcelSheet {
	@Test(dataProvider="data")
	public void test(String subcategory)
	{
		System.out.println("exceltest");
		System.out.println(subcategory+" ");

	}
	
public String[][] data() throws EncryptedDocumentException, IOException
		{
	ExcelsheetxlxsUtility excel= new ExcelsheetxlxsUtility(FileInputConstant.FILE_EXCEL_DATA);
	 return excel.getDataProvider("category");
	
		}

}
