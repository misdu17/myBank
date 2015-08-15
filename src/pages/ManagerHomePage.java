package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.PageBase;

public class ManagerHomePage extends PageBase{
	
	@FindBy(xpath="html/body/table/tbody/tr/td/table/tbody/tr[2]/td/marquee")
	public WebElement welcomeMessage;
	
	@FindBy(xpath="html/body/table/tbody/tr/td/table/tbody/tr[3]/td")
	public WebElement managerIdMessage;
	
	@FindBy(linkText="Manager")
	public WebElement managerLink;
	
	@FindBy(linkText="New Customer")
	public WebElement newCustomerLink;
	
	@FindBy(linkText="Edit Customer")
	public WebElement editCustomerLink;
	
	@FindBy(linkText="Delete Customer")
	public WebElement deleteCustomerLink;
	
	@FindBy(linkText="New Account")
	public WebElement newAccountLink;

	@FindBy(linkText="Edit Account")
	public WebElement editAccountLink;

	@FindBy(linkText="Delete Account")
	public WebElement deleteAccountLink;

	@FindBy(linkText="Deposit")
	public WebElement depositLink;

	@FindBy(linkText="Withdrawal")
	public WebElement withdrawalLink;

	@FindBy(linkText="Fund Transfer")
	public WebElement fundTransferLink;

	@FindBy(linkText="Change Password")
	public WebElement changePasswordLink;

	@FindBy(linkText="Balance Enquiry")
	public WebElement balanceEnquiryLink;
	
	@FindBy(linkText="Mini Statement")
	public WebElement miniStatementLink;

	@FindBy(linkText="Customised Statement")
	public WebElement customisedStatementLink;

	@FindBy(linkText="Log out")
	public WebElement logOutLink;
	
	@FindBy(linkText="Home")
	public WebElement homeLink;
	/**
	 * page services
	 */
	public void clickLogout(){
		logOutLink.click();
	}
	
}
