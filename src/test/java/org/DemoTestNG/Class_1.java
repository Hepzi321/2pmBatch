package org.DemoTestNG;

import org.testng.annotations.Test;

public class Class_1 {
	
	@Test(groups = "Regression")
	public void m1()
	{
		System.out.println("login branch changes");
		System.out.println(System.currentTimeMillis());
		System.out.println("Method 1");
	}
	
	@Test(groups="Sanity")
	public void m2()
	{
		System.out.println(System.currentTimeMillis());
		System.out.println("Method 2");
	}

}
