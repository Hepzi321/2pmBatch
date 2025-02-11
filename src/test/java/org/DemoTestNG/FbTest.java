package org.DemoTestNG;

import org.jspecify.annotations.Nullable;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class FbTest extends BaseClassTest{
	@Test
	public void fbTitle()
	{
		@Nullable
		String actualtitle = driver.getTitle();
		String expectedTitle = "Facebook – log in or sign up";
		Assert.assertEquals(actualtitle, expectedTitle);
	}

}
