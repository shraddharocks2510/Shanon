package iframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe_1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\User\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/selenium/package-summary.html");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//implicit wait
	driver.manage().window().maximize();
	
	driver.switchTo().frame("packageListFrame");//switch to 1st frame
	String s1=driver.findElement(By.xpath("//a[text()='org.openqa.selenium']")).getText();
	System.out.println(s1);
	driver.switchTo().defaultContent();//switch to main webpage
	
	driver.switchTo().frame("packageFrame");//switch to 2nd frame
	String s2=driver.findElement(By.xpath("//a[text()='AbstractAnnotations']")).getText();
	System.out.println(s2);
	driver.switchTo().defaultContent();//switch to main webpage
	
	
	driver.switchTo().frame("classFrame");//switch to 3rd frame
	String s3=driver.findElement(By.xpath("//h1[text()='Package org.openqa.selenium']")).getText();
	
	System.out.println(s3);
	
	
	}

}
