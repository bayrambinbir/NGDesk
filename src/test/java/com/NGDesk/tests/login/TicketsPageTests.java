package com.NGDesk.tests.login;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.NGDesk.pages.HomePage;
import com.NGDesk.pages.LoginPage;
import com.NGDesk.pages.TicketPage;
import com.NGDesk.tests.TestBase;
import com.NGDesk.utilities.ConfigurationReader;
import com.NGDesk.utilities.BrowserUtils;

public class TicketsPageTests extends TestBase {

	TicketPage ticketPage = new TicketPage();
	HomePage homePage = new HomePage();
	LoginPage loginPage = new LoginPage();


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
	public void viewCreatedTicket() throws InterruptedException {
		driver.get(ConfigurationReader.getProperty("loginDirectPageUrl"));
		loginPage.username.sendKeys(ConfigurationReader.getProperty("usernamea"));
		loginPage.password.sendKeys(ConfigurationReader.getProperty("passworda"));
		loginPage.loginButton.click();
		
		driver.manage().timeouts().pageLoadTimeout(150, TimeUnit.SECONDS);
		Actions actions = new Actions(driver);
		actions.moveToElement(ticketPage.hoverTicketButton).perform();
		BrowserUtils.waitForVisibility(ticketPage.newticket, 5);
		ticketPage.newticket.click();
		
		String expectedRequesterTab = "asli turk";
		BrowserUtils.waitForVisibility(ticketPage.requesterTab, 5);
		String actualRequesterTab = ticketPage.requesterTab.getText();
		
		System.out.println("actualRequesterTab : "  + actualRequesterTab);
		assertEquals(actualRequesterTab, expectedRequesterTab);
		
		ticketPage.severityTabClick.click();
		ticketPage.severityTabLow.click();
		
		BrowserUtils.waitFor(5);

		ticketPage.teamTabClick.click();
		ticketPage.teamTabDefault.click();
		
		ticketPage.subject.sendKeys("Testing new ticket 123");
		
		actions = new Actions(driver);
		actions.moveToElement(ticketPage.body);
		actions.click();
		actions.sendKeys("Being automation tester is cool");
		actions.build().perform();
		
		actions = new Actions(driver);
		BrowserUtils.waitForVisibility(ticketPage.ccUsers, 5);
		actions.moveToElement(ticketPage.ccUsers);
		actions.click();
		actions.sendKeys("asat1121");
		actions.build().perform();
		actions.moveToElement(ticketPage.asat1121).click().build().perform();
		
		ticketPage.submit.click();
		
		String expectedConfirmationText = "Confirm New Ticket";
		String actualConfirmationText = ticketPage.confirmationNewTicket.getAttribute("innerHTML");
		assertEquals(actualConfirmationText, expectedConfirmationText);
		
		actions = new Actions(driver);
		BrowserUtils.waitForVisibility(ticketPage.saveAndSubmit, 5);
		actions.moveToElement(ticketPage.saveAndSubmit);
		actions.click();
		actions.build().perform();
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
