package TestNg;

import org.testng.annotations.Test;

public class IncludeExclude {
	@Test(groups="regresion")
	public void test1() {
		System.out.println("test");
		
	}
	@Test(groups= {"regression","major"})
	public void tes2()
	{
		System.out.println("test2");
	}
	@Test(groups="sanity")
	public void tes3()
	{
		System.out.println("test3");
	}
	@Test(groups= {"regression","minnor"})
	public void tes4()
	{
		System.out.println("test4");
	}
	@Test(groups="sanity")
	public void tes5()
	{
		System.out.println("test5");
	}

}
