package ecom_Flashcart_genericUtility_externalfileutility;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import ecom_Flashcart_genericUtility_enums.PropertyFileKey;

public class PropertyUtility {
	private Properties pobj;
		
	public PropertyUtility(String filepath) throws IOException
	{
		/**
		 * @param filepath
		 * @author shubh
		 * to fetch the data  from propertyfile
		 * it is a constructer used for initialization
		 */
		FileInputStream fispro=new FileInputStream(filepath);
		pobj=new Properties();
		pobj.load(fispro);
		fispro.close();
		
	}
	@Deprecated
	public void initializepropertyFile(String filepath) throws IOException
	{
		FileInputStream fisprop= new FileInputStream(filepath);
		pobj=new Properties();
		pobj.load(fisprop);
	fisprop.close();			
	}
	public String getPropertyData(String key)
	{
		String value= pobj.getProperty(key,"").trim();
		return value;
	}


	public String getData( PropertyFileKey key)
	{
		String data=key.name().toLowerCase();
		return pobj.getProperty(data, "please enter the properkey"+data+"" );

	}

}



