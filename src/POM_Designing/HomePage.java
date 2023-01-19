package POM_Designing;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(xpath="//td[text()='Enter Time-Track']")private WebElement text;
	public HomePage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
		
	}
	public void verifyText() {
		String expT="Enter Time-Track";
		String actT=text.getText();
		if(actT.equals(expT)) {
			System.out.println("tc is pass");
		}
		else {
			System.out.println("tc is fail");
		}
		
	}

}
