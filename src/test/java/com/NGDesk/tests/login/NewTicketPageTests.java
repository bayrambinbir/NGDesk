package com.NGDesk.tests.login;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.NGDesk.pages.HomePage;
import com.NGDesk.pages.LoginPage;
import com.NGDesk.pages.NewTicketPage;
import com.NGDesk.pages.TicketPage;
import com.NGDesk.tests.TestBase;
import com.NGDesk.utilities.BrowserUtils;
import com.NGDesk.utilities.ConfigurationReader;
import com.NGDesk.utilities.Driver;

public class NewTicketPageTests extends TestBase {

	TicketPage ticketPage = new TicketPage();
	NewTicketPage singleTicketPage = new NewTicketPage();
	HomePage homePage = new HomePage();
	LoginPage loginPage = new LoginPage();
	Actions actions = new Actions(Driver.getDriver());

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
	

	public void viewCreatedTicket() throws InterruptedException {
		extentLogger = report.createTest("view created test");
		homePage.loginButton.click();
		homePage.subdomainBox.sendKeys(ConfigurationReader.getProperty("subdomaina"));
		homePage.goLoginButton.click();
		loginPage.username.sendKeys(ConfigurationReader.getProperty("usernamea"));
		loginPage.password.sendKeys(ConfigurationReader.getProperty("passworda"));
		loginPage.loginButton.click();
		
		//driver.manage().timeouts().pageLoadTimeout(150, TimeUnit.SECONDS);
		//Actions actions = new Actions(driver);
		actions.moveToElement(ticketPage.hoverTicketButton).perform();
		BrowserUtils.waitForVisibility(ticketPage.newticket, 5);
		String login = driver.getWindowHandle();
		System.out.println("login : " + login);
		actions.click(ticketPage.newticket).perform();
		
		
		BrowserUtils.switchToWindow("'ngDesk - Portal'");
		String expectedRequesterTab = "ngdesk43";
		//BrowserUtils.waitForVisibility(singleTicketPage.requesterTab, 5);
		BrowserUtils.waitFor(5);
		String actualRequesterTab = singleTicketPage.requesterTab.getText();
		
		String ticket = driver.getWindowHandle();
		System.out.println("ticket : " + ticket);
		System.out.println("actualRequesterTab : "  + actualRequesterTab);
		assertEquals(actualRequesterTab, expectedRequesterTab);
		
		singleTicketPage.severityTabClick.click();
		singleTicketPage.severityTabLow.click();
		
		BrowserUtils.waitFor(5);

		singleTicketPage.teamTabClick.click();
		singleTicketPage.teamTabDefault.click();
		
		singleTicketPage.subject.sendKeys("Testing new ticket 123");
		
		//actions = new Actions(driver);
		actions.moveToElement(singleTicketPage.body);
		actions.click();
		actions.sendKeys("Being automation tester is cool");
		actions.build().perform();
		
		//actions = new Actions(driver);
		BrowserUtils.waitForVisibility(singleTicketPage.ccUsers, 5);
		actions.moveToElement(singleTicketPage.ccUsers);
		actions.click();
		actions.sendKeys("asat1121");
		actions.build().perform();
		actions.moveToElement(singleTicketPage.asat1121).click().build().perform();
		
		singleTicketPage.submit.click();
		
		String expectedConfirmationText = "Confirm New Ticket";
		String actualConfirmationText = singleTicketPage.confirmationNewTicket.getAttribute("innerHTML");
		assertEquals(actualConfirmationText, expectedConfirmationText);
		
		//actions = new Actions(driver);
		BrowserUtils.waitForVisibility(singleTicketPage.saveAndSubmit, 5);
		actions.moveToElement(singleTicketPage.saveAndSubmit);
		actions.click();
		actions.build().perform();
	}
		
		
		
		
		
		
		
}
