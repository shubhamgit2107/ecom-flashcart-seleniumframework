package TestNg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test2 
{
	@Test
	public void test()
	{
		System.out.println("automation");
	}
	@BeforeSuite
	public void BeforeSuitSetUp()
	{
	System.out.println("beforeSuit");	
	}
@BeforeTest
	public void BeforeTestSetUp()
	{
	System.out.println("beforetest");	
	}
@BeforeClass
	public void BeforeclassSetUp()
	{
	System.out.println("beforeclass");	
	}
@BeforeMethod
	public void BeforemethodSetUp()
	{
	System.out.println("beforemethod");	
	}
@AfterMethod
	public void AfterMethodTearUp()
	{
	System.out.println("aftermethod");	
	}
@AfterClass
	public void AfterClassTearUp()
	{
	System.out.println("afterclass");	
	}
@AfterTest
	public void AfterTestTearUp()
	{
	System.out.println("aftertest");	
	}
@AfterSuite
	public void AfterSuitTearUp()
	{
	System.out.println("Aftersuit");	
	}


	}

