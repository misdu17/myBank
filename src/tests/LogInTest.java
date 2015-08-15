package tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base.TestBase;
//@Listeners(listener.JyperionListener.class)
public class LogInTest extends TestBase {
	
	@BeforeClass
	public void testClassSetup(){
		managerHomePage.clickLogout();
		managerHomePage.handleAlert().accept();
	}
	
	@Test
	public void testClickGenerateAccess() {
		loginPage.generateAccessLink.click();
		Assert.assertEquals(
				driver.findElement(
						By.xpath("html/body/form/table/tbody/tr[1]/td/h2"))
						.getText(), "Enter your email address to get" + "\n"
						+ "access details to demo site");
		driver.navigate().back();
	}

	@Test
	public void testLoginEmptyUsernamePassword() {
		loginPage.resetButton.click();
		loginPage.loginButton.click();
		Alert myalert = loginPage.handleAlert();
		Assert.assertEquals(myalert.getText(), "User or Password is not valid");
		myalert.accept();
	}

	@Test
	public void testLoginInvalidUsernamePassword() {
		loginPage.resetButton.click();
		loginPage.signIN("mngr15", "Asyb");
		Alert myalert = loginPage.handleAlert();
		Assert.assertEquals(myalert.getText(), "User or Password is not valid");
		myalert.accept();
	}

	@Test
	public void testLoginBlankUsernamePassword() {
		loginPage.userIdField.click();
		loginPage.userPasswordField.click();
		Assert.assertEquals(loginPage.blankMessageUserID.getText(),
				"User-ID must not be blank");
		loginPage.resetButton.click();
		Assert.assertEquals(loginPage.blankMessagePassword.getText(),
				"Password must not be blank");
		loginPage.loginButton.click();
		Alert myalert = loginPage.handleAlert();
		Assert.assertEquals(myalert.getText(), "User or Password is not valid");
		myalert.accept();
	}

	@Test
	public void testValidLogIn() {
		loginPage.signIN("mngr16532", "udunYqu");
		Assert.assertEquals(managerHomePage.welcomeMessage.getText(),
				"Welcome To Manager's Page of Guru99 Bank");
		Assert.assertEquals(managerHomePage.managerIdMessage.getText(),
				"Manger Id : mngr16532");
		managerHomePage.logOutLink.click();
		managerHomePage.handleAlert().accept();
	}

}
