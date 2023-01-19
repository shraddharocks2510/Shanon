package pagefactory_testng;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test1 {
	Sheet sh;
	WebDriver driver;
	Login1Page l;
	Home1Page h;
	
	@BeforeClass
	public void openBrowser() throws Throwable {
		FileInputStream fis=new FileInputStream("C:\\Users\\User\\Desktop\\para.xlsx");
		
		sh = WorkbookFactory.create(fis).getSheet("Sheet2");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Downloads\\chromedriver_win32(1)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.actitime.com/login.do");
		
		 l=new Login1Page(driver);// create object of two variable
	 h=new Home1Page(driver);
		
		}
	
	@BeforeMethod
	public void openApp() {//open browser
		String username=sh.getRow(0).getCell(0).getStringCellValue();
		l.enterUN(username);
		
		String passward=sh.getRow(0).getCell(1).getStringCellValue();
			l.enterPWD(passward);
			l.clickLoginBTN();
		
	}
	
	@Test
	public void verifyText() {
		Reporter.log("ruuning verifyText",true);
		String expText =sh.getRow(0).getCell(2).getStringCellValue();
		String actText=h.verifyText();
		Assert.assertEquals(expText, actText);
				
	}
	@AfterMethod
	public void logout() {
		Reporter.log("logout application",true);
		
	}
	@AfterClass
	public void closeBrowser() {
		Reporter.log("close the browser",true);
	
	}}
	
	
	


