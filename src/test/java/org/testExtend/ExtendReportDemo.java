package org.testExtend;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtendReportDemo {
	ExtentSparkReporter spark;
	ExtentReports extent;
	ExtentTest test;
	@BeforeTest
	public void start()
	{
		spark = new ExtentSparkReporter(System.getProperty("user.dir")+"\\Report\\extendreport.html");
		extent = new ExtentReports();
		extent.attachReporter(spark);
	}
	
	    @Test
		public void signIn()
		{
			test = extent.createTest("User is signed on first page");
			test.log(Status.PASS, "Signed in page got pass");
		}
	    @Test
	    public void homePage()
	    {
	    	test = extent.createTest("HomePage Test").assignAuthor("Oranium").assignCategory("Smoke").assignDevice("chrome");
	        test.fail("Product page test got failed") ;
	        
	    }
	    @Test
	    public void productPage()
	    {
	    	test = extent.createTest("ProductPage Test").assignAuthor("Batch_2PM").assignCategory("Regression").assignDevice("edge");
	        test.pass("Product page test got failed") ;
	    }
	    
	    @AfterTest
	    public void quit()
	    {
	    	extent.flush();
	    }
	}

