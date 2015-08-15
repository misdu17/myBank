package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class EditAccountPage {
	
	@FindBy(name="accountno")
	public WebElement editAccountNoField;
	
	@FindBy(name="AccSubmit")
	public WebElement editAccountSubmitButton;
	
	@FindBy(name="res")
	public WebElement editAccountResetButton;
	
	@FindBy(name="a_type")
	public WebElement editAccountType;
	
	@FindBy(linkText="Continue")
	public WebElement editAccountContinueLink;
	
	public void selectAccountType(String type){
		Select dropdown = new Select(editAccountType);
		dropdown.selectByVisibleText(type);
	}
	
	
	
	

}
