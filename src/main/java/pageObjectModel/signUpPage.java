package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class signUpPage {
	
	public WebDriver driver;
	
	By FIRST_NAME = By.xpath("//input[@name='UserFirstName']");
	By LAST_NAME = By.xpath("//input[@name='UserLastName']");
	By EMAIL = By.xpath("//input[@name='UserEmail']");
	By JOB_TITLE = By.xpath("//select[@name='UserTitle']");
	
	public signUpPage(WebDriver driver2) {
		this.driver = driver2;
	}

	public WebElement enterFirstName() {
		return driver.findElement(FIRST_NAME);
	}
	
	public WebElement enterLastName () {
		return driver.findElement(LAST_NAME);
	}
	
	public WebElement enterEmail() {
		return driver.findElement(EMAIL);
	}
	
	public WebElement selectJobTitle() {
		return driver.findElement(JOB_TITLE);
	}

}
