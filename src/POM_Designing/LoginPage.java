package POM_Designing;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage  {
	//WebDriver driver=new ChromeDriver();
	//driver.get("https://www.facebook.com/login/")
	@FindBy(xpath="//input[@id=\"username\"]")private WebElement un;
	@FindBy(xpath="//input[@name='pwd']")private WebElement pwd;
	@FindBy(xpath="//div[text()='Login ']")private WebElement loginBtn;
// use constructor
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}
	//public LoginPage() {
		// TODO Auto-generated constructor stub
	//}
	//getters and setters
	public void enterUn() {
		un.sendKeys("admin");
	}
	public void enterPWD() {
		pwd.sendKeys("manager");
	}
	public void clickLoginBtn() {
		loginBtn.click();
		
	}
	
}
