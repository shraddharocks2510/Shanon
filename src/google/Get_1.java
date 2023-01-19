package google;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32(1)\\chromedriver.exe");
		WebDriver n=new ChromeDriver();
		n.get("https://www.selenium.dev/");
		
		
		
	}

}
