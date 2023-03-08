package flashcart.admin;


import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.util.Map;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import annotation.ExtentReporter;
import ecom_Flashcart_genericUtility.ConfigClass;
import ecom_Flashcart_genericUtility_enums.ExcelFileData;
import ecom_Flashcart_genericUtility_enums.PropertyFileKey;

public class CreateUserTest extends ConfigClass {

	
	@ExtentReporter(author="shubham")	
	@Test
		public void Order() throws EncryptedDocumentException, IOException 
		{
		// WebDriver driver = sutil.launchBrowser("chrome", "");
		 olp.userLoginaction(putil.getData(PropertyFileKey.USERNAME1), putil.getData(PropertyFileKey.PASSWORD1));
		 Map<String, String> map = eutil.initializeExcel("create user", ExcelFileData.CATEGORY.getSheetName());
		 soft.assertEquals(ulp.userverification(),map.get("userverification"));
		
	
		
		 
		ulp.textFieldAction(map.get("billingaddress"), map.get("bilingstate"), map.get("billingcity"), map.get("billingpincode"));
		
		
		pputil.alertAccept(driver);
	//ulp.userLogout();
		sutil.launchApplication(putil.getData(PropertyFileKey.URL2));
	
		//ulp.adLoginAction(user2, pass2);
		ulp.adLoginAction(putil.getData(PropertyFileKey.USERNAME2), putil.getData(PropertyFileKey.PASSWORD2));
		soft.assertEquals(ulp.adminverification(),map.get("adminverification"));

		ulp.adsignout();
		String actitle=driver.getTitle();
		System.out.println(actitle);
		
	
	

			}

	

	}

		


	



