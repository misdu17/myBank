package base;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
//import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import pages.BalanceEnquiryPage;
import pages.CustomerRegisteredPage;
import pages.CustomisedStatementPage;
import pages.DeleteAccountPage;
import pages.DeleteCustomerPage;
import pages.DepositPage;
import pages.EditAccountPage;
import pages.EditCustomerPage;
import pages.FundTransferPage;
import pages.LoginPage;
import pages.ManagerHomePage;
import pages.MiniStatementPage;
import pages.NewAccountPage;
import pages.NewCustomerPage;
import pages.WithdrawalPage;
import util.ReadData;
import util.NewCustomersData;

public class TestBase extends Driver{
	
	public static LoginPage loginPage;
	public static ManagerHomePage managerHomePage;
	public static NewCustomerPage newCustomerPage;
	public static CustomerRegisteredPage customerRegisteredPage;
	public static EditCustomerPage editCustomerPage;
	public static DeleteCustomerPage deleteCustomerPage;
	public static NewAccountPage newAccountPage;
	public static EditAccountPage editAccountPage;
	public static DeleteAccountPage deleteAccountPage;
	public static DepositPage depositPage;
	public static WithdrawalPage withdrawalPage;
	public static FundTransferPage fundTransferPage;
	public static BalanceEnquiryPage balanceEnquiryPage;
	public static MiniStatementPage miniStatementPage;
	public static CustomisedStatementPage customisedStatementPage;
	
	protected List<NewCustomersData> dataSheetList = null;
	
	protected String browserType = readProperty.getPropertyValue("browserType");
	protected String baseURL = readProperty.getPropertyValue("baseURL");
	
	@BeforeTest
	public void testSetUp() throws Exception{
		//set web driver from driver class
		setWebDriver(browserType, baseURL);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		//read data from excel file
		ReadData readData = new ReadData();
		dataSheetList = readData.readDataFromExcel("/Users/Zakia/Documents/Java/basic_practice/Bank/src/testData/Workbook4.xls", "Sheet1");
		//pages declaration with driver instance
		loginPage = PageFactory.initElements(driver, LoginPage.class);
		managerHomePage = PageFactory.initElements(driver, ManagerHomePage.class);	
		newCustomerPage = PageFactory.initElements(driver, NewCustomerPage.class);
		customerRegisteredPage = PageFactory.initElements(driver, CustomerRegisteredPage.class);
		editCustomerPage = PageFactory.initElements(driver, EditCustomerPage.class);
		deleteCustomerPage = PageFactory.initElements(driver, DeleteCustomerPage.class);
		newAccountPage = PageFactory.initElements(driver, NewAccountPage.class);
		editAccountPage = PageFactory.initElements(driver, EditAccountPage.class);
		deleteAccountPage = PageFactory.initElements(driver, DeleteAccountPage.class);
		depositPage = PageFactory.initElements(driver, DepositPage.class);
		withdrawalPage = PageFactory.initElements(driver, WithdrawalPage.class);
		fundTransferPage = PageFactory.initElements(driver, FundTransferPage.class);
		balanceEnquiryPage = PageFactory.initElements(driver, BalanceEnquiryPage.class);
		miniStatementPage = PageFactory.initElements(driver, MiniStatementPage.class);
		customisedStatementPage = PageFactory.initElements(driver, CustomisedStatementPage.class); 
		loginPage.signIN("mngr16532", "udunYqu");
		
	}
	
	//@AfterTest
	public void testTearDown(){
		driver.quit();
	}


}
