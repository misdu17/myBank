package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.PageBase;

public class FundTransferPage extends PageBase{
	
	@FindBy(name = "payersaccount")
	public WebElement payersAccountNoField;
	
	@FindBy(name = "payeeaccount")
	public WebElement payeeAccountNoField;
	
	@FindBy(name = "ammount")
	public WebElement fundTransferAmount;
	
	@FindBy(name = "desc")
	public WebElement fundTransferDescription;
	
	@FindBy(name = "AccSubmit")
	public WebElement fundTransferSubmitButton;
	
	@FindBy(name = "res")
	public WebElement fundTransferResetButton;	
	
	@FindBy(linkText = "Continue")
	public WebElement fundTransferContinueLink;

}
