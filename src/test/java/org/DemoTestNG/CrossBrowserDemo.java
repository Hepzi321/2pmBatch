package org.DemoTestNG;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserDemo {
	WebDriver driver;
	
	@BeforeTest
	@Parameters({"browserName"})
	public void setUp(String browserName)
	{
		switch(browserName)
		{
		case "chrome":
			driver = new ChromeDriver();
			break;
		
		case "edge":
			driver = new EdgeDriver();
			break;
			
		case "firefox":
			driver = new FirefoxDriver();
			break;
			
		default:
		{
			System.out.println("Provide a valid browser name");
		}
		
		}
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		
	}
		@Test
		public void gTitle()
		{
			@Nullable
			String actualTitle = driver.getTitle();
			Assert.assertEquals(actualTitle, "Google");
		}
		
		@AfterTest
		public void quit()
		{
			driver.quit();
		}
	}


