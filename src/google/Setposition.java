package google;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Setposition {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver g=new ChromeDriver();
		g.get("https://www.trivago.in/");
		Point p=new Point(400, 500);
		g.manage().window().setPosition(p);
		
	}

}
