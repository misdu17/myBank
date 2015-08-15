package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.PageBase;

public class BalanceEnquiryPage extends PageBase{
	
	@FindBy(name = "accountno")
	public WebElement balanceEnquiryAccountField;
	
	@FindBy(name = "AccSubmit")
	public WebElement balanceEnquirySubmitButton;
	
	@FindBy(name = "res")
	public WebElement balanceEnquiryResetButton;
	
	@FindBy(linkText = "Continue")
	public WebElement balanceEnquiryContinueLink;
	

}
