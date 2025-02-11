package org.testLayer;

import org.DemoTestNG.BaseClassTest;
import org.junit.Assert;
import org.pageLayer.LoginPageLayer;
import org.testng.annotations.Test;


public class LoginTestClass extends LoginPageLayer{

	@Test
	public void checkForgotPwd()
	{
	  boolean status = fb.checkLink();
	  Assert.assertTrue(status);
	
	}
	@Test
	public void login()
	{
		fb.do_login();
	}
}
