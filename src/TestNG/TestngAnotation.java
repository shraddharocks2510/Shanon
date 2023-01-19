package TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestngAnotation {
	@BeforeClass
	public void openbrowser() {
		Reporter.log("open the browser",true);
		
	}
	@BeforeMethod
	public void loginapp() {
		Reporter.log("login page",true);
	}
	@Test
	public void verifyTest() {
		Reporter.log("running actual test case",true);
	}
	@AfterMethod
	public void logoutapp() {
		Reporter.log("log out app",true);
	}
	@AfterClass
	public void closebrowser() {
		Reporter.log("close the browser",true);
	}

}
