package com.NGDesk.tests.loginAhmet;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.NGDesk.pagesAhmet.ControlPanel;
import com.NGDesk.pagesAhmet.HomePage;
import com.NGDesk.pagesAhmet.LoginPage;
import com.NGDesk.pagesAhmet.TicketPage;
import com.NGDesk.tests.TestBase;
import com.NGDesk.tests.TestBaseAhmet;
import com.NGDesk.utilities.*;

public class TestCase16 extends TestBaseAhmet {

	String userId = ConfigurationReader.getProperty("Ausername");
	String password = ConfigurationReader.getProperty("Apassword");
	
	@Test
	public void testCase16() throws InterruptedException {
	//Navigate to NGdesk website and login
	LoginPage loginPage=new LoginPage();
	loginPage.login(userId,password);
	Thread.sleep(3000);
	
	//*Hover over 5th tab on left side of page and Click on "Premade Responses"     
	HomePage homePage=new HomePage();
	BrowserUtils.hover(homePage.hoverOver);
	homePage.premadeResponses.click();
	Thread.sleep(3000);
	
	//*Click on "+ New Response" button on top right 
	TicketPage ticketPage=new TicketPage();
	ticketPage.newResponse.click();
	Thread.sleep(2000);
	
	//*Enter a Response Name title in "Greeting, Response" input box   
	ControlPanel controlPanel=new ControlPanel();
	controlPanel.nameTitle.sendKeys("Greeting, Response");
	Thread.sleep(2000);

	
	//Verify that in dropdown menu(next to name blank)  Select Team already selected 
	controlPanel.selectTeam.click();
	assertFalse(controlPanel.selectTeam.isSelected());
	
	//Response Type Dropdown = select "Global" 
	Select global=new Select(controlPanel.responseType);
	global.selectByIndex(0);
	Thread.sleep(2000); 

	//*Write "Hello, we will be happy to assist you..."  in Response Box    
	controlPanel.responseBody.sendKeys("Hello, we will be happy to assist you...");
	Thread.sleep(2000);
	
	//Click Save Response Button
	controlPanel.saveResponse.click();
	Thread.sleep(3000);
	
	//Verify message "Saved Successfully" is displayed
	assertTrue(controlPanel.message.isDisplayed());
	Thread.sleep(3000);

	//verify that your name is visible under title head 

	System.out.println("text "+controlPanel.underTitle.getText());
	Assert.assertEquals(controlPanel.underTitle.getText(),"Greeting, Response");
 
	}
	
	
	
}
