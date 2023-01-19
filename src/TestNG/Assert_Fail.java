package TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assert_Fail {
	

		@Test
		public void tc1() {//here once we fail the testcse first then remaining all verifications are failed
			Reporter.log("running tc1()",true);
			Assert.fail();
			System.out.println("i am after failing tc1");

	}
		@Test
		public void tc2() {
			Reporter.log("running tc2",true);
			
		}


}
