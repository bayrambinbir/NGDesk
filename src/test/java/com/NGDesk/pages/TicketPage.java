package com.NGDesk.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.NGDesk.utilities.Driver;

public class TicketPage {

	public TicketPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy(css=".nav-link.ng-binding")
	public WebElement usernameOnTicketPage;
	
	@FindBy(css=".text-wrap ")
	public WebElement randomTicket;
	
	@FindBy(css=".fa.fa-ticket.icon-color")
	public WebElement hoverTicketButton;
	
	@FindBy(xpath="//li[.='New Ticket']")
	public WebElement newticket;
	
	

	
	
	
}
