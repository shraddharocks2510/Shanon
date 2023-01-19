package POM_Designing;


	import org.openqa.selenium.SearchContext;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

public class Class{

		@FindBy(xpath="//input[@id='username']")private WebElement un;
		@FindBy(xpath="//input[@name='pwd']")private WebElement pwd;
		@FindBy(xpath="//div[text()='Login ']")private WebElement loginBtn;
	// use constructor
		public Class(WebDriver driver) {
			PageFactory.initElements(driver,this);
			
		}
		//getters and setters
		public void enterun() {
			un.sendKeys("admin");
		}
		public void enterpwd() {
			pwd.sendKeys("manager");
		}
		public void clickloginBtn() {
			loginBtn.click();
			
		}
		
	}
