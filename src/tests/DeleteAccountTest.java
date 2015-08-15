package tests;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base.TestBase;
@Listeners(listener.JyperionListener.class)
public class DeleteAccountTest extends TestBase {

	@Test
	public void testUndeleteValidAccount(){
		managerHomePage.deleteAccountLink.click();
		deleteAccountPage.deletePageResetButton.click();
		deleteAccountPage.deletePageAccountFieldNo.sendKeys("7080");
		deleteAccountPage.deletePageSubmitButton.click();
		Assert.assertEquals(deleteAccountPage.handleAlert().getText(), "Do you really want to delete this Account?");
		deleteAccountPage.handleAlert().dismiss();
		deleteAccountPage.deletePageResetButton.click();
	}
	@Test
	public void testDeleteInvalidAccount(){
		managerHomePage.deleteAccountLink.click();
		deleteAccountPage.deletePageResetButton.click();
		deleteAccountPage.deletePageAccountFieldNo.sendKeys("666666");
		deleteAccountPage.deletePageSubmitButton.click();
		deleteAccountPage.handleAlert().accept();
		Assert.assertEquals(deleteAccountPage.handleAlert().getText(), "Account does not exist");
		deleteAccountPage.handleAlert().accept();
	}
	
	

}
