package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.PageBase;

public class MiniStatementPage extends PageBase{

	@FindBy(name = "accountno")
	public WebElement miniStatementAccountField;
	
	@FindBy(name = "AccSubmit")
	public WebElement miniStatementSubmitButton;
	
	@FindBy(name = "res")
	public WebElement miniStatementResetButton;
	
	@FindBy(linkText = "Continue")
	public WebElement miniStatementContinueLink;
	
	

}
