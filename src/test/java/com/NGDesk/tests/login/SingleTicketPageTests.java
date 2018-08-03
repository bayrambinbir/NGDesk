package com.NGDesk.tests.login;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.NGDesk.pages.HomePage;
import com.NGDesk.pages.LoginPage;
import com.NGDesk.pages.SingleTicketPage;
import com.NGDesk.pages.TicketPage;
import com.NGDesk.tests.TestBase;
import com.NGDesk.utilities.BrowserUtils;
import com.NGDesk.utilities.ConfigurationReader;

public class SingleTicketPageTests extends TestBase {

	TicketPage ticketPage = new TicketPage();
	SingleTicketPage singleTicketPage = new SingleTicketPage();
	HomePage homePage = new HomePage();
	LoginPage loginPage = new LoginPage();




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
		BrowserUtils.waitForVisibility(singleTicketPage.requesterTab, 5);
		String actualRequesterTab = singleTicketPage.requesterTab.getText();
		
		System.out.println("actualRequesterTab : "  + actualRequesterTab);
		assertEquals(actualRequesterTab, expectedRequesterTab);
		
		singleTicketPage.severityTabClick.click();
		singleTicketPage.severityTabLow.click();
		
		BrowserUtils.waitFor(5);

		singleTicketPage.teamTabClick.click();
		singleTicketPage.teamTabDefault.click();
		
		singleTicketPage.subject.sendKeys("Testing new ticket 123");
		
		actions = new Actions(driver);
		actions.moveToElement(singleTicketPage.body);
		actions.click();
		actions.sendKeys("Being automation tester is cool");
		actions.build().perform();
		
		actions = new Actions(driver);
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
		
		actions = new Actions(driver);
		BrowserUtils.waitForVisibility(singleTicketPage.saveAndSubmit, 5);
		actions.moveToElement(singleTicketPage.saveAndSubmit);
		actions.click();
		actions.build().perform();
	}
		
		
		
		
		
		
		
}
