package google;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Robot_class {//USED TO HANDLE THE SCROLL UP AND SCROLL DOWN
	public static void main(String[] args) throws  Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	Robot y=new Robot();
	y.keyPress(KeyEvent.VK_PAGE_DOWN);
	y.keyRelease(KeyEvent.VK_PAGE_DOWN);
	Thread.sleep(4000);
	
	y.keyPress(KeyEvent.VK_PAGE_UP);
	y.keyPress(KeyEvent.VK_PAGE_UP);
	Thread.sleep(4000);
	
	y.keyPress(KeyEvent.VK_PAGE_DOWN);
	y.keyRelease(KeyEvent.VK_PAGE_DOWN);
	Thread.sleep(4000);
	
	y.keyPress(KeyEvent.VK_PAGE_DOWN);
	y.keyRelease(KeyEvent.VK_PAGE_DOWN);
	Thread.sleep(4000);
	

	y.keyPress(KeyEvent.VK_PAGE_DOWN);
	y.keyRelease(KeyEvent.VK_PAGE_DOWN);
	Thread.sleep(4000);
	
	
	
	
	
	
	
	}

}
