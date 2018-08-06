package com.NGDesk.tests.login;

import org.testng.annotations.Test;

import com.NGDesk.pages.HomePage;
import com.NGDesk.pages.LoginPage;
import com.NGDesk.pages.TicketPage;
import com.NGDesk.pages.ViewTicketPage;
import com.NGDesk.tests.TestBase;
import com.NGDesk.utilities.BrowserUtils;
import com.NGDesk.utilities.ConfigurationReader;

public class TestCase12Byrm  extends TestBase {
	
	String userId = ConfigurationReader.getProperty("usernameBayram");
	String password = ConfigurationReader.getProperty("passwordBayram");
	String loginPageUrlBayram = ConfigurationReader.getProperty("loginPageUrlBayram");
	@Test
	public void testCase12() throws InterruptedException {
	//Open url  and login Step 1-2-3-4
	LoginPage loginPage=new LoginPage();
	driver.get(loginPageUrlBayram);
	loginPage.username.sendKeys(userId);
	loginPage.password.sendKeys(password);
	loginPage.loginButton.click();
	Thread.sleep(3000);
	
	// Step 5
	ViewTicketPage viewTicketPage = new ViewTicketPage();
	BrowserUtils.hover(viewTicketPage.hoverTicketButton);
	viewTicketPage.viewTickets.click();
	Thread.sleep(3000);
	
	//Get the ticket Id and subject for first row
	String ticketID = viewTicketPage.ticketIdAtFirstRow.getText();
	System.out.println("TicketID at first row is: "+ticketID);
	
	String subject = viewTicketPage.ticketSubjectAtFirstRow.getText();
	System.out.println("Ticket subject at first row is: "+subject);
}
}
