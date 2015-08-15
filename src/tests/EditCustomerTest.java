package tests;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base.TestBase;
@Listeners(listener.JyperionListener.class)
public class EditCustomerTest extends TestBase{
	
	@Test(priority=1)
	public void testEditCustomerChangeAddress(){
		managerHomePage.editCustomerLink.click();
		editCustomerPage.editPageResetButton.click();
		editCustomerPage.editPageCustomerIdField.sendKeys("55274");
		editCustomerPage.editPageSubmitButton.click();
		editCustomerPage.editCustomerAddressField.clear();
		editCustomerPage.editCustomerAddressField.sendKeys("ress");
		editCustomerPage.editCustomerSubmitButton.click();
		Assert.assertEquals(editCustomerPage.editCutomerUpdateMessage.getText(),
				"Customer details updated Successfully!!!");
		editCustomerPage.editCustomerContinueLink.click();
	}
	
	@Test(priority=2)
	public void testEditCustomerChangeAddressNo(){
		managerHomePage.editCustomerLink.click();
		editCustomerPage.editPageResetButton.click();
		editCustomerPage.editPageCustomerIdField.sendKeys("55274");
		editCustomerPage.editPageSubmitButton.click();
		editCustomerPage.editCustomerSubmitButton.click();
		Alert myalert = driver.switchTo().alert();
		Assert.assertEquals(myalert.getText(), "No Changes made to Customer records");
		myalert.accept();
	}

}
