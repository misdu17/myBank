package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import base.PageBase;

public class NewAccountPage extends PageBase{
	
	@FindBy(name="cusid")
	public WebElement newAccountCustomerIdField;
	
	@FindBy(name="selaccount")
	public WebElement newAccountTypeDropDown;
	
	@FindBy(name="inideposit")
	public WebElement newAccountInitialDeposit;
	
	@FindBy(name="button2")
	public WebElement newAccountSubmitButton;
	
	@FindBy(name="reset")
	public WebElement newAccountResetButton;
	
	@FindBy(name="account")
	public WebElement newAccountGenerateTable;
	
	@FindBy(linkText="Continue")
	public WebElement newAccountContinueLink;
	
	@FindBy(xpath="//*[@id='account']/tbody/tr[1]/td/p")
	public WebElement newAccountGenerateMessage;
	
	public void selectAccountType(String type){
		Select dropdown = new Select(newAccountTypeDropDown);
		dropdown.selectByVisibleText(type);
	}
	
	public String getCustomerId(){
		List<WebElement> tableRows = newAccountGenerateTable.findElements(By
				.tagName("tr"));
		String accountId = tableRows.get(3).getText();
		return accountId;
	}
}
