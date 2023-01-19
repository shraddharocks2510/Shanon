package google;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Setsize {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver b=new ChromeDriver();
		b.get("https://www.ajio.com/");
		Dimension s=new Dimension(100,200);
		b.manage().window().setSize(s);
		
		
	}

}
