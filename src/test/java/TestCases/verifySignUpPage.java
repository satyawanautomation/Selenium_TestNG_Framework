package TestCases;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Resources.baseClass;
import Resources.commonMethods;
import Resources.constant;
import pageObjectModel.loginPageObject;
import pageObjectModel.signUpPage;

public class verifySignUpPage extends baseClass{
	
	@Test
	public void signUP() throws IOException, InterruptedException {
		
//		initializeDriver();
//		driver.get("https://login.salesforce.com/?locale=in");
		
		loginPageObject LOP = new loginPageObject(driver);
		LOP.clickSignUP().click();
		
		Thread.sleep(5000);
		signUpPage SUP = new signUpPage(driver);
		SUP.enterFirstName().sendKeys(constant.first_name);
		SUP.enterLastName().sendKeys(constant.last_name);
		SUP.enterEmail().sendKeys(constant.email);
		
		commonMethods.handleDropdown(SUP.selectJobTitle(), 1);
		Thread.sleep(2000);
	}

}
