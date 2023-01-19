package Screenshot;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Screenshot {
	public static void main(String[] args)throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.facebook.com/");
		TakesScreenshot ts=(TakesScreenshot)d;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\User\\Desktop\\screenshot\\google.png");
		Files.copy(source, destination);
		
		
		
	}

}
