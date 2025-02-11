package org.JunitDemo;

import org.junit.Assert;
import org.testng.annotations.Test;

public class AttributesDemo {
	@Test(priority=-2, description="Register page check")
	public void register()
	{
		System.out.println("Register Page");
	}
	@Test(priority=-1, invocationCount=2, invocationTimeOut=2000)
	public void login()
	{
		System.out.println("Login Page");
		Assert.assertTrue(false);
	}
	@Test(priority=0, dependsOnMethods="login", alwaysRun=true)
	public void homePage()
	{
		System.out.println("Home Page");
		Assert.assertTrue(true);
	}
	@Test(priority=1, enabled=false)
	public void productPage()
	{
		System.out.println("Product Page");
	}
	@Test(priority=2, timeOut=1000)
	public void addTocart() throws InterruptedException
	{
		Thread.sleep(2000);
		System.out.println("Add to Cart");
	}
	
			

}
