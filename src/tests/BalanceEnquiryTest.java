package tests;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base.TestBase;

@Listeners(listener.JyperionListener.class)
public class BalanceEnquiryTest extends TestBase {
	//Account ID 7066

	@Test
	public void testInvalidAccountBalanceEnquiry() {
		managerHomePage.balanceEnquiryLink.click();
		balanceEnquiryPage.balanceEnquiryResetButton.click();
		balanceEnquiryPage.balanceEnquiryAccountField.sendKeys("12345");
		balanceEnquiryPage.balanceEnquirySubmitButton.click();
		balanceEnquiryPage.handleAlert().accept();
	}

	@Test
	public void testValidAccountBalanceEnquiry() {
		managerHomePage.balanceEnquiryLink.click();
		balanceEnquiryPage.balanceEnquiryResetButton.click();
		balanceEnquiryPage.balanceEnquiryAccountField.sendKeys("7066");
		balanceEnquiryPage.balanceEnquirySubmitButton.click();
		balanceEnquiryPage.balanceEnquiryContinueLink.click();
	}
}
