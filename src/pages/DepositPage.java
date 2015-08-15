package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.PageBase;

public class DepositPage extends PageBase{
	
	@FindBy(name="accountno")
	public WebElement depostiPageAccountFieldNo;
	
	@FindBy(name="ammount")
	public WebElement depositPageAmountField;
	
	@FindBy(name="desc")
	public WebElement depositPageDescription;
	
	@FindBy(name="AccSubmit")
	public WebElement depositPageSubmitButton;
	
	@FindBy(name="res")
	public WebElement depositPageResetButton;
	
	@FindBy(id="deposit")
	public WebElement transactionDepositTable;
	
	@FindBy(linkText="Continue")
	public WebElement depositPageContinueLink;
	
	public String getTransactionId(){
		List<WebElement> tableRows = transactionDepositTable.findElements(By
				.tagName("tr"));
		String transactionId = tableRows.get(5).getText();
		return transactionId;
	}

}
