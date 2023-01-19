package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class Multibrowser_1 {
	


	
		@Parameters("browsername")
		
		@Test
		public void tc1(String browsername) {
			//parametrized method
			//declare global variables
			WebDriver driver=null; //runtime polymorphism
			if(browsername.equals("chrome")) {
			//for chrome driver
			System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\User\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
	driver=new ChromeDriver();

			}

	else
		if(browsername.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\User\\Downloads\\geckodriver-v0.32.0-win32\\geckodriver.exe");
					
	driver = new FirefoxDriver();
		
		
		}
		driver.get("https://www.facebook.com/");
		
		
	}

}
