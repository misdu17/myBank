package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.PageBase;

public class EditCustomerPage extends PageBase{
	
	@FindBy(name="cusid")
	public WebElement editPageCustomerIdField;
	
	@FindBy(name="AccSubmit")
	public WebElement editPageSubmitButton;
	
	@FindBy(name="res")
	public WebElement editPageResetButton;
	
	@FindBy(name="name")
	public WebElement editCustomerNameField;
	
	@FindBy(name="gender")
	public WebElement editCustomerGenderField;

	@FindBy(name="dob")
	public WebElement editCustomerDateOfBirthField;

	@FindBy(name="addr")
	public WebElement editCustomerAddressField;

	@FindBy(name="city")
	public WebElement editCustomerCityField;

	@FindBy(name="state")
	public WebElement editCustomerStateField;

	@FindBy(name="pinno")
	public WebElement editCustomerPinField;

	@FindBy(name="telephoneno")
	public WebElement editCustomerTelephoneField;

	@FindBy(name="emailid")
	public WebElement editCustomerEmailIdField;
	
	@FindBy(name="sub")
	public WebElement editCustomerSubmitButton;
	
	@FindBy(linkText="Continue")
	public WebElement editCustomerContinueLink;
	
	@FindBy(xpath="//*[@id='customer']/tbody/tr[1]/td/p")
	public WebElement editCutomerUpdateMessage;

}
