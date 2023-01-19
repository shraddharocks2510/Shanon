package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.Test;

public class Soft_Assert {
	@Test
	public void tc1() {//here if the test case fail then all remaning observation remains execute
		String S1="hii";
				String S2="hiii";
				SoftAssert s=new SoftAssert();
				
				s.assertEquals(S1, S2);
				System.out.println("i am after failing tc1()");
				s.assertAll();
		
			}

		}
	 

		
	

		

	


