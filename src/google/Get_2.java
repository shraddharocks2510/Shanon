package google;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_2 {
	public static void main(String[] args)
	throws Throwable{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver g=new ChromeDriver();
		g.get("https://mail.google.com/");//get url
		String Title=g.getTitle();//get title
		System.out.println(Title);
		Thread.sleep(4000);
		g.manage().window().maximize();//maximize browser
		//g.close();
		Thread.sleep(8000);
		g.manage().window().minimize();//minimize browser
		
		g.navigate().to("https://www.facebook.com/");
		g.navigate().back();
		g.navigate().forward();
		g.navigate().refresh();
		g.close();
		
	}

}