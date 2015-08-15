package tests;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base.TestBase;
@Listeners(listener.JyperionListener.class)
public class DeleteCustomerTest extends TestBase{
	
	@Test
	public void testDeleteCustomer(){
		managerHomePage.deleteCustomerLink.click();
		deleteCustomerPage.deleteCustomerResetButton.click();
		deleteCustomerPage.deleteCustomerIdField.sendKeys("82197");
		deleteCustomerPage.deleteCustomerSubmitButton.click();
		Assert.assertEquals(deleteCustomerPage.handleAlert().getText(),
				"Do you really want to delete this Customer?");
		deleteCustomerPage.handleAlert().accept();
		String text = deleteCustomerPage.handleAlert().getText();
		deleteCustomerPage.handleAlert().accept();
		Assert.assertEquals(text,"Customer deleted Successfully");	
	}
	
	@Test
	public void testDeleteCustomerDoesNotExist(){
		managerHomePage.deleteCustomerLink.click();
		deleteCustomerPage.deleteCustomerResetButton.click();
		deleteCustomerPage.deleteCustomerIdField.sendKeys("46237");
		deleteCustomerPage.deleteCustomerSubmitButton.click();
		Assert.assertEquals(deleteCustomerPage.handleAlert().getText(),
				"Do you really want to delete this Customer?");
		deleteCustomerPage.handleAlert().accept();
		Assert.assertEquals(deleteCustomerPage.handleAlert().getText(),
				"Customer does not exist!!");
		deleteCustomerPage.handleAlert().accept();
	}

}
