package TestNG;

	import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;

	public class Open_GoogleUsingAnotation {
		@BeforeClass
		public void openbrowser() {
			System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\User\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.google.com/");
			Reporter.log("open browser",true);
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


