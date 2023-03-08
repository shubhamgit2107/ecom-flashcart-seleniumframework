package TestNg;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SingleArrayDataprovider {
	@Test(dataProvider = "testData")
	public void test(String a) 
		{
		System.out.println(a);
			System.out.println("data Provider run");
		}
	@DataProvider()
	public String[] testData()
	{
		String[] arr= new String[4];
		arr[0]="patna";
		arr[1]="gaya";
		arr[2]="muzzafer";
		arr[3]="jehanabad";
		return arr;
	}
	
	}




