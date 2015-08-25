package tests;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base.TestBase;

@Listeners(listener.JyperionListener.class)
public class CustomisedStatementTest extends TestBase{
	
	@Test
	public void testInvalidAccountCuatomizedStatement(){
		managerHomePage.customisedStatementLink.click();
		customisedStatementPage.customisedResetButton.click();
		customisedStatementPage.customisedAccountField.sendKeys("12345");
		customisedStatementPage.customisedFromDateField.sendKeys("12/12/2014");
		customisedStatementPage.customisedToDateField.sendKeys("01/02/2015");
		customisedStatementPage.customisedMinimumValue.sendKeys("10");
		customisedStatementPage.customisedNumberOfTransaction.sendKeys("2");
		customisedStatementPage.customisedSubmitButton.click();
		customisedStatementPage.handleAlert().accept();
	}
	
	@Test
	public void testValidAccountCuatomizedStatement(){
		managerHomePage.customisedStatementLink.click();
		customisedStatementPage.customisedResetButton.click();
		customisedStatementPage.customisedAccountField.sendKeys("7066");
		customisedStatementPage.customisedFromDateField.sendKeys("7/12/2015");
		customisedStatementPage.customisedToDateField.sendKeys("07/31/2015");
		customisedStatementPage.customisedMinimumValue.sendKeys("10");
		customisedStatementPage.customisedNumberOfTransaction.sendKeys("2");
		customisedStatementPage.customisedSubmitButton.click();
		customisedStatementPage.customisedContinueLink.click();
	}

}
