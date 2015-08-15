package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.PageBase;

public class CustomisedStatementPage extends PageBase{
	
	@FindBy(name = "accountno")
	public WebElement customisedAccountField;
	
	@FindBy(name = "fdate")
	public WebElement customisedFromDateField;
	
	@FindBy(name = "tdate")
	public WebElement customisedToDateField;
	
	@FindBy(name = "amountlowerlimit")
	public WebElement customisedMinimumValue;
	
	@FindBy(name = "numtransaction")
	public WebElement customisedNumberOfTransaction;
	
	@FindBy(name="AccSubmit")
	public WebElement customisedSubmitButton;
	
	@FindBy(name="res")
	public WebElement customisedResetButton;
	
	@FindBy(linkText = "Continue")
	public WebElement customisedContinueLink;
	
}
