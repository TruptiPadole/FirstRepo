package testNG_example;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class demo {
  
	@BeforeClass
	public void beforeclass1()
	{
		System.out.println("Before class");
	}
	@BeforeMethod
	public void beforeMethod1()
	{
		System.out.println("Before Method");
	}
	@Test
	public void testMethod1()
	{
		System.out.println("test Method");
	}
	@AfterMethod
	public void afterMethod1()
	{
		System.out.println("after Method");
	}
	@AfterClass
	public void aclass()
	{
		System.out.println("after class from server");
	}
}
