package com.NGDesk.tests.login;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.NGDesk.pages.ControlPanelPage;
import com.NGDesk.pages.HomePage;
import com.NGDesk.pages.LoginPage;
import com.NGDesk.pages.NewTicketPage;
import com.NGDesk.pages.TicketPage;
import com.NGDesk.tests.TestBase;
import com.NGDesk.utilities.BrowserUtils;
import com.NGDesk.utilities.ConfigurationReader;

public class TicketsPageTests extends TestBase {

	TicketPage ticketPage = new TicketPage();
	NewTicketPage singleTicketPage = new NewTicketPage();
	HomePage homePage = new HomePage();
	LoginPage loginPage = new LoginPage();
	ControlPanelPage controlPanelPage = new ControlPanelPage();

	@Test(groups= {"smoke"})
	public void ticketTest() {
		homePage.loginButton.click();
		homePage.subdomainBox.sendKeys(ConfigurationReader.getProperty("subdomain"));
		homePage.goLoginButton.click();
		loginPage.username.sendKeys(ConfigurationReader.getProperty("username"));
		loginPage.password.sendKeys(ConfigurationReader.getProperty("password"));
		loginPage.loginButton.click();
		String actualUserName = ticketPage.usernameOnTicketPage.getText();
		String expectedUserName = "zhumabaf";
		assertEquals(actualUserName, expectedUserName);
		ticketPage.randomTicket.click();
		
	}	
	@Test(groups= {"deneme"})
	public void respondingToATicketPublicly() {
		driver.get(ConfigurationReader.getProperty("loginDirectPageUrl"));
		loginPage.username.sendKeys(ConfigurationReader.getProperty("usernamea"));
		loginPage.password.sendKeys(ConfigurationReader.getProperty("passworda"));
		loginPage.loginButton.click();
		
		actions.moveToElement(ticketPage.hoverTicketButton).perform();
		BrowserUtils.waitForVisibility(ticketPage.viewTickets, 5);
		actions.click(ticketPage.viewTickets).perform();
		BrowserUtils.waitFor(2);

		ticketPage.anyTicket.click();
		controlPanelPage.publicButton.click();
		
		controlPanelPage.publicTextBox.sendKeys("How may I help you?");
		
		actions.moveToElement(controlPanelPage.submit).click().build().perform();
		
		BrowserUtils.waitFor(5);
		String actual = controlPanelPage.submitReplyText.getText();
		String expected = "Submit Reply";
		assertEquals(actual, expected);
		
		controlPanelPage.submitReplyDropdownMenu.click();
		controlPanelPage.waitingOnCustomerResponse.click();
		controlPanelPage.submitButtonOnSubmitReplyPage.click();
		
		//assertTrue(driver.getPageSource().contains("How may I help you?"));
	}
		

		
		
		
		
		
		
}
