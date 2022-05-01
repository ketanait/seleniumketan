package javaautomation;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DataValidation {

	
	
	@Test
	public void compare () {
	String a="ketan";
	String b="yogesh";
	if (a.equals(b))
	{
	Assert.assertEquals(true, true);
	}
	else
		Assert.assertEquals(false, false);
	}
}


