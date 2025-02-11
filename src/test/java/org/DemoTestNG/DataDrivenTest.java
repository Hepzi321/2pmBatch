package org.DemoTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DataDrivenTest {
	WebDriver driver;
	
	@Test(priority=0, dataProvider = "data1")
	public void fburl(String URL)
	{
		driver = new ChromeDriver();
		driver.get(URL);
		driver.manage().window().maximize();
	}
	
	@Test(priority=1, dataProvider = "data2")
	public void login(String uname, String password)
	{
		driver.findElement(By.id("email")).sendKeys(uname);
		driver.findElement(By.id("pass")).sendKeys(password);
		driver.findElement(By.name("login")).click();
	}
	
@DataProvider
public Object data1()
{
	
	Object[] arr = {"https://www.facebook.com/"};
	return arr;
}
	
	@DataProvider
	
	public Object[][] data2()
	{
		Object[][] tarr = {{"Oranium@gmail.com", "7894612"},
				           {"Tech123", "45631" },
		                   {"Hello@gmail.com","258341"} 
		                  };
		
		return tarr;
		}
	
	}

