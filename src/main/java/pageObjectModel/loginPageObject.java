package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPageObject {
	
	public WebDriver driver;
	
	By USERNAME = By.xpath("//input[@id='username']");
	By PASSWORD = By.xpath("//input[@id='password']");
	By LOGIN_BTN = By.xpath("//input[@id='Login']");
	By SIGNUP_BTN = By.xpath("//a[@id='signup_link']");
	By ERROR_MSG = By.xpath("//div[@id='error']");
	
	public loginPageObject(WebDriver driver2) {
		this.driver=driver2;
	}

	public WebElement enterUsername() {
		return driver.findElement(USERNAME);
	}
	
	public WebElement enterPassword() {
		return driver.findElement(PASSWORD);
	}
	
	public WebElement clickLogin() {
		return driver.findElement(LOGIN_BTN);
	}
	
	public WebElement clickSignUP() {
		return driver.findElement(SIGNUP_BTN);
	}
	
	public WebElement errorMsg() {
		return driver.findElement(ERROR_MSG);
	}
	
	//GIT demo purpose modification
	

}
