package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Class_action {
	

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");//open amazon by using get method
		
		WebElement shr = driver.findElement(By.xpath("//span[@class='nav-cart-icon nav-sprite']"));
		driver.manage().window().maximize();//maximize the browser
		
		
		
		

Actions act=new Actions(driver);//use action class to handle the browser
act.moveToElement(shr).perform();//use this method to move the curser on that particular element
act.contextClick(shr).perform();//right click
act.click(shr).perform();//left click

	}

}
