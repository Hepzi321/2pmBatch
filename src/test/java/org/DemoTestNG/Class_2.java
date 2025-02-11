package org.DemoTestNG;

import org.testng.annotations.Test;

public class Class_2 {
	
	@Test(groups="Smoke")
	public void m3()
	{
		System.out.println(System.currentTimeMillis());
		System.out.println("Method 3");
	}
	@Test(groups="Regression")
	public void m4()
	{
		System.out.println(System.currentTimeMillis());
		System.out.println("Method 4");
	}

}
