package tests;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base.TestBase;
@Listeners(listener.JyperionListener.class)
public class MiniStatementTest extends TestBase{
	//Account ID 7066
	//Account ID 7067
	
	@Test
	public void testInvalidAccountMiniStatementTest(){
		managerHomePage.miniStatementLink.click();
		miniStatementPage.miniStatementResetButton.click();
		miniStatementPage.miniStatementAccountField.sendKeys("2222222");
		miniStatementPage.miniStatementSubmitButton.click();
		miniStatementPage.handleAlert().accept();	
	}
	
	@Test
	public void testValidAccountMiniStatementTest(){
		managerHomePage.miniStatementLink.click();
		miniStatementPage.miniStatementResetButton.click();
		miniStatementPage.miniStatementAccountField.sendKeys("7066");
		miniStatementPage.miniStatementSubmitButton.click();
		miniStatementPage.miniStatementContinueLink.click();
	}
	

}
