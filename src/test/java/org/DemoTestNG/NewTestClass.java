package org.DemoTestNG;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class NewTestClass extends BaseClassTest{  //base class cofig file reader
	
	@Test(dataProviderClass= ExcelReader.class, dataProvider = "getData")
	public void do_fbLogin(String uname, String pwd)
	{
		driver.findElement(By.id("email")).sendKeys(uname);
		driver.findElement(By.id("pass")).sendKeys(pwd);
		driver.findElement(By.name("login")).click();
	}
	
	

}
