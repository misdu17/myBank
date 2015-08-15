package tests;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base.TestBase;
@Listeners(listener.JyperionListener.class)
public class WithdrawTest extends TestBase{
	@Test
	public void testWithdrawInvalidAccount(){
		managerHomePage.withdrawalLink.click();
		withdrawalPage.withdrawalResetButton.click();
		withdrawalPage.withdrawalAccountField.sendKeys("2323223");
		withdrawalPage.withdrawalAmountField.sendKeys("100");
		withdrawalPage.withdrawalDescriptionField.sendKeys("none");
		withdrawalPage.withdrawalSubmitButton.click();
		Assert.assertEquals(withdrawalPage.handleAlert().getText(),"Account does not exist");
		withdrawalPage.handleAlert().accept();	
	}
	@Test
	public void testWithdrawValidAccount(){
		managerHomePage.withdrawalLink.click();
		withdrawalPage.withdrawalResetButton.click();
		withdrawalPage.withdrawalAccountField.sendKeys("6972");
		withdrawalPage.withdrawalAmountField.sendKeys("100");
		withdrawalPage.withdrawalDescriptionField.sendKeys("none");
		withdrawalPage.withdrawalSubmitButton.click();
		System.out.println(withdrawalPage.getTransactionId());
		withdrawalPage.withdrawPageContinueLink.click();
	}

	

}
