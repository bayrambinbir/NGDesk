package com.NGDesk.tests.loginAhmet;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.NGDesk.pagesAhmet.ControlPanel;
import com.NGDesk.pagesAhmet.HomePage;
import com.NGDesk.pagesAhmet.LoginPage;
import com.NGDesk.pagesAhmet.TicketPage;
import com.NGDesk.tests.TestBase;
import com.NGDesk.tests.TestBaseAhmet;
import com.NGDesk.utilities.BrowserUtils;
import com.NGDesk.utilities.ConfigurationReader;

public class TestCase19 extends TestBaseAhmet {
	
	String userId = ConfigurationReader.getProperty("Ausername");
	String password = ConfigurationReader.getProperty("Apassword");

	@Test
	public void testCase19() throws InterruptedException{
		
		//Navigate to NGdesk website and login
		LoginPage loginPage=new LoginPage();
		loginPage.login(userId,password);
		Thread.sleep(3000);
		
		//Click on Manage Account
		HomePage homePage=new HomePage();
		BrowserUtils.hover(homePage.hoverOver);
		homePage.manageAccounts.click();
		Thread.sleep(3000);
		Assert.assertEquals(homePage.titleManage.getText(), "Manage Accounts");

		//Click on a Ticket then click  on first ticket and Dropdown menu should appear
		TicketPage ticketPage=new TicketPage();
		ticketPage.aTicket.click();
		Thread.sleep(3000);
		ticketPage.firstTicket.click();
		Thread.sleep(3000);
		
		//Click on severity type,check severity is displayed
	
		ControlPanel controlPanel=new ControlPanel();
		controlPanel.severity.click();
		Thread.sleep(3000);
		assertTrue(controlPanel.severity.isDisplayed());
	}
	
	
	

}
