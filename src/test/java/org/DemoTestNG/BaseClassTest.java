package org.DemoTestNG;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.pageLayer.LoginPageLayer;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClassTest {
	
	public static WebDriver driver;
	
	public static LoginPageLayer fb = new LoginPageLayer();
	
	@BeforeMethod
	public void setup() throws IOException
	{
		File f = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Config\\configFile.properties");
	
		FileReader fr = new FileReader(f);
		
		Properties prop = new Properties();
		
		prop.load(fr);
		
		if(prop.getProperty("browser").equalsIgnoreCase("chrome"))
	
		{
			driver = new ChromeDriver();
			driver.get(prop.getProperty("testURL"));
		}
		
		else
			
			if(prop.getProperty("browser").equalsIgnoreCase("edge"))
				
			{
				driver = new EdgeDriver();
				driver.get(prop.getProperty("testURL"));
			}
		
			else
				if(prop.getProperty("browser").equalsIgnoreCase("firefox"))
					
				{
					driver = new FirefoxDriver();
					driver.get(prop.getProperty("testURL"));
				}
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
