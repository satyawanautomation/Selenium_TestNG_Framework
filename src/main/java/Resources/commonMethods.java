package Resources;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class commonMethods {
	
	public static void handleDropdown(WebElement a , int b) {
		
		Select s = new Select(a);
		s.selectByIndex(b);
		
	}
	
	public static void handleAssertions(String actual , String expected , String errorMsg) {
		
		SoftAssert assertions = new SoftAssert();
		assertions.assertEquals(actual, expected, errorMsg);
		assertions.assertAll();
	}

}
