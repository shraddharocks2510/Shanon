package Parallel_Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parallel_3 {
	@Test
	public void tc1() {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\User\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	
	}

}
