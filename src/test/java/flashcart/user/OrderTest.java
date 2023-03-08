package flashcart.user;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.collections4.map.HashedMap;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import ObjectRepositry.pom.OrderLoginPage;
import annotation.ExtentReporter;
import ecom_Flashcart_genericUtility.ConfigClass;
import ecom_Flashcart_genericUtility.FileInputConstant;
import ecom_Flashcart_genericUtility.PopUpUtility;
import ecom_Flashcart_genericUtility.SeleniumUtility;
import ecom_Flashcart_genericUtility.VerificationUtility;
import ecom_Flashcart_genericUtility.WaitUtility;
import ecom_Flashcart_genericUtility_enums.ExcelFileData;
import ecom_Flashcart_genericUtility_enums.PropertyFileKey;
import ecom_Flashcart_genericUtility_externalfileutility.ExcelsheetxlxsUtility;
import ecom_Flashcart_genericUtility_externalfileutility.PropertyUtility;
import io.github.bonigarcia.wdm.WebDriverManager;
import listners.InstanceUtilityTransfer;

public class OrderTest extends ConfigClass {

	//public static void main(String[] args) throws IOException {
	//SeleniumUtility su= new SeleniumUtility();
	//	WaitUtility wu= new WaitUtility();



	//	PropertyUtility putil=new PropertyUtility();
	//	putil.initializepropertyFile(FileInputConstant.FILE_PROPERTY_DATA);
	///	String acurl1 = putil.getData(PropertyFileKey.URL1);
	//	String acurl2 = putil.getData(PropertyFileKey.URL2);
	//	String user1 = putil.getData(PropertyFileKey.USERNAME1);
	//	String pass1 = putil.getData(PropertyFileKey.PASSWORD1);
	//	String user2 = putil.getData(PropertyFileKey.USERNAME2);
	//	String pass2 = putil.getData(PropertyFileKey.PASSWORD2);
	//	ExcelsheetxlxsUtility eutil=new ExcelsheetxlxsUtility(FileInputConstant.FILE_EXCEL_DATA);
	//	Map<String, String> map = eutil.initializeExcel("order", ExcelFileData.CATEGORY.getSheetName());
	//	PopUpUtility pop=new PopUpUtility();
    @ExtentReporter(author = "Shubam")
	@Test
	public void Order() throws EncryptedDocumentException, IOException
	{


		//WebDriver driver = sutil.launchBrowser("chrome", " ");


		//sutil.launchApplication(acurl1);
		//sutil.maximizeBrowser();

		wutil.implicitlyWait(driver, 10);
olp.userLoginaction(putil.getData(PropertyFileKey.USERNAME1), putil.getData(PropertyFileKey.PASSWORD1));
Map<String, String> map = eutil.initializeExcel("order", ExcelFileData.CATEGORY.getSheetName());
System.out.println(ulp.userverification());
System.out.println(map.get("userverification"));


soft.assertEquals(ulp.userverification(),map.get("userverification"));
//report.info(InstanceUtilityTransfer.getExtenttest(), "data fetched properly");
		//Assert.assertEquals(driver.findElement(By.xpath("//h2[text()='Shopping Portal']")).getText(), "Shopping Portal");
		//OrderLoginPage olp= new OrderLoginPage(driver);
		//	olp.userLoginaction(putil.getData(PropertyFileKey.USERNAME1), putil.getData(PropertyFileKey.PASSWORD1));
		
		olp.productNametf(map.get("product"));
		olp.seachBtn();
		olp.addToCart();
		pputil.alertAccept(driver);


		olp.cheakOutBtn();
		olp.codBtn();
		olp.submitBtn();
		//olp.logoutBtn();

		//VerificationUtility vu=new VerificationUtility();

		//vutil.partialVerification(driver.findElement(By.xpath("//h2[text()='Shopping Portal']")).getText(), "Shopping Portal");


	}




}



