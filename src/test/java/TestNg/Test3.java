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

public class Test3 {
	@Test
	public void test()
	{
		
		System.out.println("test-3");
	}
	@BeforeSuite
	public void bsconfig()
	{
		
		System.out.println("beforesuit-3");
	}
	@BeforeTest
	public void btconfig()
	{
		
		System.out.println("beforetest-3");
	}
	@BeforeClass
	public void bcconfig()
	{
		
		System.out.println("beforeclass-3");
	}
	@BeforeMethod
	public void bmconfig()
	{
		
		System.out.println("beforemethod-3");
	}
	@AfterMethod
	public void amTeardown()
	{
		
		System.out.println("aftermethod-3");
	}
	@AfterClass
	public void acTeardown()
	{
		
		System.out.println("afterclass-3");
	}
	@AfterTest
	public void afterTestTearDown()
	{
		
		System.out.println("afterTest-3");
	}
	@AfterSuite
	public void afterSuitTearDown()
	{
		
		System.out.println("aftersuit-3");
	}
}
