package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.PageBase;

public class LoginPage extends PageBase{
	
	@FindBy(name="uid")
	public WebElement userIdField;
	
	@FindBy(name="password")
	public WebElement userPasswordField;
	
	@FindBy(name="btnLogin")
	public WebElement loginButton;
	
	@FindBy(name="btnReset")
	public WebElement resetButton;
	
	@FindBy(id="message23")
	public WebElement blankMessageUserID;
	
	@FindBy(id="message18")
	public WebElement blankMessagePassword;
	
	@FindBy(linkText="here")
	public WebElement generateAccessLink;
	
	public void signIN(String username, String password){
		resetButton.click();
		userIdField.sendKeys(username);
		userPasswordField.sendKeys(password);
		loginButton.click();
	}
	
		
}
