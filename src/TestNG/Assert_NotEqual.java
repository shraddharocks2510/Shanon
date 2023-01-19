package TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assert_NotEqual {
				@Test
		public void m1() {
			Reporter.log("running m1()",true);
			String expT="hii";
			String acT="hiee";
			Assert.assertNotEquals(expT, acT);
		}

	}



