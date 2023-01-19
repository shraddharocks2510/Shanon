package POM_Designing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleException {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\User\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
	driver.get("https://demo.actitime.com/login.do");
	WebElement UN=driver.findElement(By.xpath("//input[@name='username']"));
	driver.navigate().refresh();
	UN.sendKeys("admin");
	
	
	
	
	
	
	}
	
	
	
	
	
	
	
	

}
