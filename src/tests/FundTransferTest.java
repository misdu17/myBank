package tests;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base.TestBase;
@Listeners(listener.JyperionListener.class)
public class FundTransferTest extends TestBase{
	//Account ID 7066
	//Account ID 7067
	
	@Test
	public void testInvalidFundTransfer(){
		managerHomePage.fundTransferLink.click();
		fundTransferPage.fundTransferResetButton.click();
		fundTransferPage.payersAccountNoField.sendKeys("2222222");
		fundTransferPage.payeeAccountNoField.sendKeys("222222");
		fundTransferPage.fundTransferAmount.sendKeys("1000");
		fundTransferPage.fundTransferDescription.sendKeys("invalid account");
		fundTransferPage.fundTransferSubmitButton.click();
		fundTransferPage.handleAlert().accept();
	}
	
	@Test
	public void testValidFundTransfer(){
		managerHomePage.fundTransferLink.click();
		fundTransferPage.fundTransferResetButton.click();
		fundTransferPage.payersAccountNoField.sendKeys("7066");
		fundTransferPage.payeeAccountNoField.sendKeys("7067");
		fundTransferPage.fundTransferAmount.sendKeys("10");
		fundTransferPage.fundTransferDescription.sendKeys("invalid account");
		fundTransferPage.fundTransferSubmitButton.click();	
		fundTransferPage.fundTransferContinueLink.click();
	}

}
