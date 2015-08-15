package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.PageBase;

public class WithdrawalPage extends PageBase{
	
	@FindBy(name="accountno")
	public WebElement withdrawalAccountField;
	
	@FindBy(name="ammount")
	public WebElement withdrawalAmountField;
	
	@FindBy(name="desc")
	public WebElement withdrawalDescriptionField;
	
	@FindBy(name="AccSubmit")
	public WebElement withdrawalSubmitButton;
	
	@FindBy(name="res")
	public WebElement withdrawalResetButton;
	
	@FindBy(id="withdraw")
	public WebElement transactionWithdrawTable;
	
	@FindBy(linkText="Continue")
	public WebElement withdrawPageContinueLink;
	
	public String getTransactionId(){
		List<WebElement> tableRows = transactionWithdrawTable.findElements(By
				.tagName("tr"));
		String transactionId = tableRows.get(5).getText();
		return transactionId;
	}
	
	
}
