package google;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wd_method {
	public static void main(String[] args)
	throws Throwable{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver s=new ChromeDriver();
		s.get("https://www.google.com/");
		Thread.sleep(4000);
		
		s.manage().window().maximize();//maximize the browser
		//close method
		s.close();
		
	}

}
