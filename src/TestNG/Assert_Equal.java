package TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assert_Equal {
	private static final String Reoprter = null;

	@Test
	public void m1() {
		Reporter.log("running m1()",true);
		String expT="hii";
		String acT="hii";
		Assert.assertEquals(expT, acT);
	}

}
