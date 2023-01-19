package google;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Screenshot_perticular {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\User\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	WebElement shraddha =driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']"));
	
	File src=shraddha.getScreenshotAs(OutputType.FILE);
	File dest=new File("C:\\\\Users\\\\User\\\\Desktop\\\\screenshot\\\\facebook.png");
	Files.copy(src,dest);
	
	
	
	
	
	
	
	}
	
	
	
	
	
	

}
