package org.DemoTestNG;

import org.testng.annotations.Test;

public class Class_3 {
	@Test(groups ="Smoke")
	public void m5()
	{
		System.out.println(System.currentTimeMillis());
		System.out.println("Method 5");
	}
@Test(groups="Sanity")
	public void m6()
	{
	System.out.println(System.currentTimeMillis());
		System.out.println("Method 6");
	}
@Test(groups={"Smoke", "Sanity"})
	public void m7()
	{
	System.out.println(System.currentTimeMillis());
		System.out.println("Method 7");
	}
}
