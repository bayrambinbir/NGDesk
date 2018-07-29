package com.NGDesk.tests.login;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.NGDesk.pages.ControlPanelPage;
import com.NGDesk.pages.HomePage;
import com.NGDesk.pages.LoginPage;
import com.NGDesk.pages.TicketPage;
import com.NGDesk.tests.TestBase;
import com.NGDesk.utilities.BrowserUtils;
import com.NGDesk.utilities.ConfigurationReader;
import com.NGDesk.utilities.Driver;

public class ControlPanelPageTests extends TestBase {

	TicketPage ticketPage = new TicketPage();
	HomePage homePage = new HomePage();
	LoginPage loginPage = new LoginPage();
	ControlPanelPage controlPanelPage = new ControlPanelPage();

	
	@Test(groups= {"smoke"})
	public void verifyControlPanel() {
		homePage.loginButton.click();
		homePage.subdomainBox.sendKeys(ConfigurationReader.getProperty("subdomain"));
		homePage.goLoginButton.click();
		loginPage.username.sendKeys(ConfigurationReader.getProperty("username"));
		loginPage.password.sendKeys(ConfigurationReader.getProperty("password"));
		loginPage.loginButton.click();
		ticketPage.randomTicket.click();
		//String actualPanelText = controlPanelPage.controlPanelText.getText();
		//String expectedPanelText = "Control Panel";
		//System.out.println("actualPanelText = " + actualPanelText);
		BrowserUtils.waitFor(3);
		assertTrue(Driver.getDriver().getPageSource().contains("Control Panel"));
		//assertEquals(actualPanelText, expectedPanelText);
	}

}
