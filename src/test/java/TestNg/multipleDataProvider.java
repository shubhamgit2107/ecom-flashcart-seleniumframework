package TestNg;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class multipleDataProvider {
	@Test(dataProvider = "multiple")

	public void test(Object a,Object b,Object c)
	{
		System.out.println(a+ ""+b+""+c);
		System.out.println("run multiple dataprovider");
	}
	@DataProvider(name="multiple")
	public Object[][] data()
	{
		Object[][] obj= new Object[3][3];
		obj[0][0]="shubham";
		obj[0][1]=1234;
		obj[0][2]="bangalore";
		
		obj[1][0]="ram";
		obj[1][1]=1235;
		obj[1][2]="mangalore";
		
		obj[2][0]="shubham";
		obj[2][1]=1236;
		obj[2][2]="udupi";
		return obj;
	}

}
