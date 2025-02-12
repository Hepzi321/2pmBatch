package org.pageLayer;

import org.DemoTestNG.BaseClassTest;
import org.openqa.selenium.By;

public class LoginPageLayer extends BaseClassTest{
	
	//by locators
	
	By uname = By.id("email");
	By pwd = By.id("pass");
	By login = By.name("login");
	By forgot_pwd = By.linkText("Forgotten password?");
	
	//Actions or method
	
	public boolean checkLink()
	{
		boolean status = driver.findElement(forgot_pwd).isDisplayed();
	    return status;
		System.out.println("This is my new change");
	}
	
	public void do_login()
	{
		driver.findElement(uname).sendKeys("Oranium");
		driver.findElement(pwd).sendKeys("Tech");
		driver.findElement(login).click();
	}
}
