package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Invocation {
	@Test(invocationCount=8)
	public void tc1() {
		Reporter.log("running tc1",true);
	}

}
