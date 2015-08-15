package tests;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base.TestBase;
@Listeners(listener.JyperionListener.class)
public class NewAccountTest extends TestBase{
	
	@Test
	public void testAddNewAccount(){
		managerHomePage.newAccountLink.click();
		newAccountPage.newAccountResetButton.click();
		newAccountPage.newAccountCustomerIdField.sendKeys("55274");
		newAccountPage.selectAccountType("Current");
		newAccountPage.newAccountInitialDeposit.sendKeys("1000");
		newAccountPage.newAccountSubmitButton.click();
		Assert.assertEquals(newAccountPage.newAccountGenerateMessage.getText(), 
				"Account Generated Successfully!!!");
		System.out.println(newAccountPage.getCustomerId());
		newAccountPage.newAccountContinueLink.click();
	}
	@Test
	public void testInvalidCustomerId(){
		managerHomePage.newAccountLink.click();
		newAccountPage.newAccountResetButton.click();
		newAccountPage.newAccountCustomerIdField.sendKeys("35766");
		newAccountPage.selectAccountType("Current");
		newAccountPage.newAccountInitialDeposit.sendKeys("1000");
		newAccountPage.newAccountSubmitButton.click();
		Assert.assertEquals(newAccountPage.handleAlert().getText(), "Customer does not exist!!");
		newAccountPage.handleAlert().accept();
	}
	

}
