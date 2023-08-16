package TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Resources.baseClass;
import Resources.commonMethods;
import Resources.constant;
import pageObjectModel.loginPageObject;

public class verifyLogin extends baseClass{
	
	@Test
	public void invalidLogin() throws IOException, InterruptedException {
		
//		initializeDriver();
//		driver.get("https://login.salesforce.com/?locale=in");
		
		loginPageObject LPO = new loginPageObject(driver);
		
		LPO.enterUsername().sendKeys(constant.username);
		LPO.enterPassword().sendKeys(constant.password);
		LPO.clickLogin().click();
		Thread.sleep(5000);
		
		commonMethods.handleAssertions(LPO.errorMsg().getText(),constant.login_error_msg, "Error message is incorrect");
	}

}
