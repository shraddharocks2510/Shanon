package TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Timeout {
	@Test//its work as main method as well as test case
	public void timeout1() {
		Reporter.log("passed successfully",true);
	}
	@Test(timeOut=60000)
	public void timeout2() {
		Reporter.log("time is up",true);
		Assert.fail();
	}
	

}
