package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.PageBase;

public class DeleteAccountPage extends PageBase {
	
	@FindBy(name="accountno")
	public WebElement deletePageAccountFieldNo;
	
	@FindBy(name="AccSubmit")
	public WebElement deletePageSubmitButton;
	
	@FindBy(name="res")
	public WebElement deletePageResetButton;

}
