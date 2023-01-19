package popups;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child_browser {


	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\User\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");//open flipcart application
	driver.manage().window().maximize();//maximize the window
	driver.findElement(By.xpath("//button[text()='✕']")).click();//close popups whatever display after opening the app
	driver.findElement(By.xpath("//input[@name='q']")).sendKeys("mobiles under 20000",Keys.ENTER);//search mobile  phone under 20000
	Thread.sleep(9000);
	
	driver.findElement(By.xpath("(//div[@class='_4rR01T']) [1]")).click();//click on first phone 
	
	Thread.sleep(5000);
	Set<String>allwindows=driver.getWindowHandles();//switch the control
ArrayList <String>al=new ArrayList<String>(allwindows);//create object of arraylist
String mainid=al.get(0);//print session id
System.out.println(mainid);//print main window id
driver.switchTo().window(al.get(1));
String cwind=al.get(1);
System.out.println(cwind);//print child window id
Thread.sleep(5000);
String a=driver.getTitle();
System.out.println(a);//print title of mobile
	
	
	
	}

}
