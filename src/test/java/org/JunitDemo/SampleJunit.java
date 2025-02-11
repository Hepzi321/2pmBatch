package org.JunitDemo;

import org.jspecify.annotations.Nullable;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleJunit {
	public static WebDriver driver;

	@BeforeClass
	public static void beforeClass()
	{
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		System.out.println("beforeClass");
		
	}
	@AfterClass
	public static void afterClass()
	{
		System.out.println("Test completed");
		driver.close();
		System.out.println("AfterClass");
	}
	
	@Before
	public void before()
	{
		driver.manage().window().maximize();
		System.out.println("Before");
	}
	
	@After
	public void after()
	{
		driver.navigate().refresh();
		System.out.println("After");
	}
	@Test
	public void test1()
	{
		driver.findElement(By.id("email")).sendKeys("Oranium");
		driver.findElement(By.id("pass")).sendKeys("12345");
		driver.findElement(By.name("login")).click();
		System.out.println("Test");
	}
	@Test
	public void test2()
	{
		System.out.println("Test 2");
		@Nullable
		String title = driver.getTitle();
		System.out.println(title);
	}
	
}
