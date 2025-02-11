package org.DemoTestNG;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class MyRetry implements IRetryAnalyzer{

	int mincount = 0;
	int maxcount = 3;
	@Override
	public boolean retry(ITestResult result) {
		while(mincount<maxcount)
		{
			mincount++;
			return true;
		}
		
		return false;
	}

}
