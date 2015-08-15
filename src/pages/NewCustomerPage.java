package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.PageBase;

public class NewCustomerPage extends PageBase{
	
	@FindBy(name="name")
	public WebElement newCustomerNameField;
	
	@FindBy(name="rad1")
	public List<WebElement> genderRadioButton;

	@FindBy(name="dob")
	public WebElement dateOfBirthField;

	@FindBy(name="addr")
	public WebElement addressField;

	@FindBy(name="city")
	public WebElement cityField;

	@FindBy(name="state")
	public WebElement stateField;

	@FindBy(name="pinno")
	public WebElement pinnoField;

	@FindBy(name="telephoneno")
	public WebElement telePhoneNoField;

	@FindBy(name="emailid")
	public WebElement emailIdField;

	@FindBy(name="password")
	public WebElement passwordField;

	@FindBy(name="sub")
	public WebElement submitButton;

	@FindBy(name="res")
	public WebElement resetButton;
	
	public void selectGenderButton(String gender){
		WebElement selectGender = findElementFromList(genderRadioButton, gender);
		selectGender.click();	
	}
	
	
	
}
