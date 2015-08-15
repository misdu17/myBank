package tests;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base.TestBase;
@Listeners(listener.JyperionListener.class)
public class ManagerMenuTest extends TestBase {

	@Test
	public void testBlickManagerLink() {
		managerHomePage.managerLink.click();
		Assert.assertEquals(managerHomePage.managerIdMessage.getText(),
				"Manger Id : mngr15102");
	}
	@Test
	public void testClickNewCustomerLink() {
		managerHomePage.newCustomerLink.click();
	}
	@Test
	public void testClickEditCustomerLinkLink() {
		managerHomePage.editCustomerLink.click();
	}
	@Test
	public void testClickDeleteCustomerLink() {
		managerHomePage.deleteCustomerLink.click();
	}
	@Test
	public void testClickNewAccountLink() {
		managerHomePage.newAccountLink.click();
	}
	@Test
	public void testClickEditAccountLink() {
		managerHomePage.editAccountLink.click();
	}
	@Test
	public void testClickDeleteAccountLink() {
		managerHomePage.deleteAccountLink.click();
	}
	@Test
	public void testClickDepositLink() {
		managerHomePage.depositLink.click();
	}
	@Test
	public void testClickWithdrawalLink() {
		managerHomePage.withdrawalLink.click();
	}
	@Test
	public void testClickFundTransferLink() {
		managerHomePage.fundTransferLink.click();
	}
	@Test
	public void testClickChangePasswordLink() {
		managerHomePage.changePasswordLink.click();
	}
	@Test
	public void testClickBalanceEnquiryLink() {
		managerHomePage.balanceEnquiryLink.click();
	}
	@Test
	public void testClickMiniStatementLink() {
		managerHomePage.miniStatementLink.click();
	}
	@Test
	public void testClickCustomisedStatementLink() {
		managerHomePage.customisedStatementLink.click();
	}
	
}
