package pagefactory_testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home1Page {
	@FindBy(xpath="//td[text()='Enter Time-Track']")private WebElement text;
	public Home1Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyText() {
		String actText=text.getText();
		return actText;
			
		}
	}


