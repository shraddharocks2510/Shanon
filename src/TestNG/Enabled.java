package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Enabled {
	@Test
	public void tc1() {
		Reporter.log("its my first prog",true);
	}
@Test(enabled=false)//after using enabled=false there no need to use assert.log its automatically fail tc
public void tc2() {
	Reporter.log("its my second prog",true);
}
}
//note-just ignore test case second after run prog