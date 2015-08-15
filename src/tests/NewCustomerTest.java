package tests;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import util.NewCustomersData;
import base.TestBase;
@Listeners(listener.JyperionListener.class)
public class NewCustomerTest extends TestBase{
	//Customer ID 35766
	//Customer ID 55274
	//Customer ID 77184
	//Customer ID 42292
	//Customer ID 30105
	//Customer ID 82197
	
	@Test
	public void testAddNewCustomer(){
		if(dataSheetList.size()==0){
			System.out.println("No Data Found");
		}else{
			System.out.println(dataSheetList.size());
			for(NewCustomersData gData:dataSheetList){
				managerHomePage.newCustomerLink.click();
				newCustomerPage.resetButton.click();
				newCustomerPage.newCustomerNameField.sendKeys(gData.getNewCustomerNameField());
				newCustomerPage.selectGenderButton(gData.getGenderRadioButton());
				newCustomerPage.dateOfBirthField.sendKeys(gData.getDateOfBirthField());
				newCustomerPage.addressField.sendKeys(gData.getAddressField());
				newCustomerPage.cityField.sendKeys(gData.getCityField());
				newCustomerPage.stateField.sendKeys(gData.getStateField());
				newCustomerPage.pinnoField.sendKeys(gData.getPinnoField());
				newCustomerPage.telePhoneNoField.sendKeys(gData.getTelePhoneNoField());
				newCustomerPage.emailIdField.sendKeys(gData.getEmailIdField());
				newCustomerPage.passwordField.sendKeys(gData.getPasswordField());
				newCustomerPage.submitButton.click();
				Assert.assertEquals(customerRegisteredPage.getCongratulationMessage(), "Customer Registered Successfully!!!");
				System.out.println(customerRegisteredPage.getCustomerId());
				customerRegisteredPage.clickContinueLink();
			}
		
		}
	}

}
