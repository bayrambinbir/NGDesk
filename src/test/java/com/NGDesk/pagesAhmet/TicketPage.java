package com.NGDesk.pagesAhmet;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.NGDesk.utilities.Driver;

public class TicketPage {

	public TicketPage() {
		
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy(xpath="//button[@class='btn btn-primary ng-binding']")
	public WebElement newResponse;
	
	@FindBy(xpath="//table[@id='accountsTable']")
	public WebElement aTicket;
	
	@FindBy(xpath="//table[@id='allAccountTicketsTable']//tbody//tr[1]//td[1]")
	public WebElement firstTicket;
	
	
}
