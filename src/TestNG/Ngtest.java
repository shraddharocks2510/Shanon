package TestNG;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;





public class Ngtest {
	
	@Test
	public void tc() {
		Reporter.log("hello",true);
	}
	@Test
	public void tc1() {
		Reporter.log("i am very tired",true);
		Assert.fail();
	}
	@Test
	public void tc2() {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\User\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	Reporter.log("i am happily open",true);
	}
	@Test
	public void tc3() {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	Reporter.log("im not open",true);
	Assert.fail();
	
	}
	@Test
	public void tc4(){
		Reporter.log("i am fine",true);
		
		
	}
	@Test
	public void tc5() {
		Reporter.log("everyday after job i am facing traffic",true);
		Assert.fail();
	}
	@Test
	public void tc6() {
		Reporter.log(" now its time to welcome 2023",true);
	}
	
	
	
	
	

}
