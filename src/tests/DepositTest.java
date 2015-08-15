package tests;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base.TestBase;
@Listeners(listener.JyperionListener.class)
public class DepositTest extends TestBase{
	
	@Test
	public void testDepositInvalidAccount(){
		managerHomePage.depositLink.click();
		depositPage.depositPageResetButton.click();
		depositPage.depostiPageAccountFieldNo.sendKeys("2323223");
		depositPage.depositPageAmountField.sendKeys("100");
		depositPage.depositPageDescription.sendKeys("none");
		depositPage.depositPageSubmitButton.click();
		Assert.assertEquals(depositPage.handleAlert().getText(),"Account does not exist");
		depositPage.handleAlert().accept();	
	}
	@Test
	public void testDepositValidAccount(){
		managerHomePage.depositLink.click();
		depositPage.depositPageResetButton.click();
		depositPage.depostiPageAccountFieldNo.sendKeys("6972");
		depositPage.depositPageAmountField.sendKeys("100");
		depositPage.depositPageDescription.sendKeys("none");
		depositPage.depositPageSubmitButton.click();
		System.out.println(depositPage.getTransactionId());
		depositPage.depositPageContinueLink.click();
	}

}
