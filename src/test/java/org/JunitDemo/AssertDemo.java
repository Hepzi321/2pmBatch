package org.JunitDemo;

import org.junit.Assert;
import org.junit.Test;
import org.testng.asserts.SoftAssert;

public class AssertDemo {
	
	@Test
	public void login()
	{
		Assert.assertEquals(10, 10);
	}
	
	@Test
	public void test2()
	{
		Assert.assertTrue(false);
		System.out.println("After hard assert fails");
	}
	
	@Test
	public void test3()
	{
		SoftAssert s = new SoftAssert();
		s.assertTrue(false);
		
		System.out.println("After soft assert");
		s.assertAll();
	}

}
