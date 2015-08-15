package tests;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base.TestBase;
@Listeners(listener.JyperionListener.class)
public class EditAccountTest extends TestBase{
	
	@Test
	public void testChangeAccountType(){
		managerHomePage.editAccountLink.click();
		editAccountPage.editAccountNoField.sendKeys("7066");
		editAccountPage.editAccountSubmitButton.click();
		editAccountPage.selectAccountType("Current");
		editAccountPage.editAccountSubmitButton.click();
		editAccountPage.editAccountContinueLink.click();
	}
	@Test
	public void testChangeAccountTypeNew(){
		managerHomePage.editAccountLink.click();
		editAccountPage.editAccountNoField.sendKeys("7066");
		editAccountPage.editAccountSubmitButton.click();
		editAccountPage.selectAccountType("Current");
		editAccountPage.editAccountSubmitButton.click();
		Alert myAlert = driver.switchTo().alert();
		Assert.assertEquals(myAlert.getText(), "No Changes made to Account records");
		myAlert.accept();
	}
	

}
