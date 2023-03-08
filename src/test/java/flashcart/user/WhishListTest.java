package flashcart.user;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.collections4.map.HashedMap;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import ObjectRepositry.pom.WishlistPage;
import ecom_Flashcart_genericUtility.ConfigClass;
import ecom_Flashcart_genericUtility.FileInputConstant;
import ecom_Flashcart_genericUtility.SeleniumUtility;
import ecom_Flashcart_genericUtility.VerificationUtility;
import ecom_Flashcart_genericUtility.WaitUtility;
import ecom_Flashcart_genericUtility_enums.ExcelFileData;
import ecom_Flashcart_genericUtility_enums.PropertyFileKey;
import ecom_Flashcart_genericUtility_externalfileutility.ExcelsheetxlxsUtility;
import ecom_Flashcart_genericUtility_externalfileutility.PropertyUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WhishListTest extends ConfigClass {

	//public static void main(String[] args) throws IOException {
	//	SeleniumUtility su=new SeleniumUtility();
	//	PropertyUtility putil=new PropertyUtility();
	//	putil.initializepropertyFile(FileInputConstant.FILE_PROPERTY_DATA);
	//	WaitUtility wu=new WaitUtility();
	////	ExcelsheetxlxsUtility eutil=new ExcelsheetxlxsUtility(FileInputConstant.FILE_EXCEL_DATA);
	//Map<String, String> map = eutil.initializeExcel("wishlist", ExcelFileData.CATEGORY.getSheetName());
		

		//String acurl1=putil.getData(PropertyFileKey.URL1);
	//	String acurl2=putil.getData(PropertyFileKey.URL2);
	//	String user1=putil.getData(PropertyFileKey.USERNAME1);
	//	String pass1=putil.getData(PropertyFileKey.PASSWORD1);
	//	String user2=putil.getData(PropertyFileKey.USERNAME2);
	//	String pass2=putil.getData(PropertyFileKey.PASSWORD2);

		@Test
		public void wishList() throws EncryptedDocumentException, IOException
		{
			
		//WebDriver driver = sutil.launchBrowser("chrome", "");
		wutil.implicitlyWait(driver,10);
		Map<String, String> map = eutil.initializeExcel("wishlist", ExcelFileData.CATEGORY.getSheetName());
		olp.userLoginaction(putil.getData(PropertyFileKey.USERNAME1), putil.getData(PropertyFileKey.PASSWORD1));
		
		 soft.assertEquals(ulp.userverification(),map.get("userverification"));
		
		
		
		wlp.wishlistAction(map.get("product"));
		
		wlp.addToCart();
		//wlp.wishlistLogout();
		
		
		
		


	}

}

