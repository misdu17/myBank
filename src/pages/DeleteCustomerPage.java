package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.PageBase;

public class DeleteCustomerPage extends PageBase{
	
	@FindBy(name="cusid")
	public WebElement deleteCustomerIdField;
	
	@FindBy(name="AccSubmit")
	public WebElement deleteCustomerSubmitButton;
	
	@FindBy(name="res")
	public WebElement deleteCustomerResetButton;
	

}
