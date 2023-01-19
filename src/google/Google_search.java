package google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_search {
	public static void main(String[] args)throws Throwable{
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver h=new ChromeDriver();
	h.get("https://demo.actitime.com/login.do");
	h.findElement(By.name("username")).sendKeys("admin");
	h.findElement(By.name("pwd")).sendKeys("manager");
	h.findElement(By.xpath("//div[text()='Login ']")).click();
	String expT="actiTIME - Login";
	String actT = h.getTitle();
	System.out.println(actT);
	if(expT.equals(actT)) {
		System.out.println("TC is pass");
		Thread.sleep(8000);
	}
	else
 {
	System.out.println("TC is fail");
	}
	}}

