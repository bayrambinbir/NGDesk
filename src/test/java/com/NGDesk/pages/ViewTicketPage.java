package com.NGDesk.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.NGDesk.utilities.Driver;

public class ViewTicketPage {
	
	public ViewTicketPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	// Bayram test case 12 (SPA-756)
	
	@FindBy(css=".fa.fa-ticket.icon-color")
	public WebElement hoverTicketButton;
	
	@FindBy(xpath="//li[contains(text(),'View Tickets')]")
	public WebElement viewTicket;
	
	@FindBy(xpath="//li[.='New Ticket']")
	public WebElement newticket;
	
	@FindBy(xpath= "(//table[@id='allTicketsTable']//tbody/tr/td[2]/div[@class='text-wrap '])[1]")
    public WebElement ticketIdAtFirstRow;	
	
	@FindBy(xpath ="(//table[@id='allTicketsTable']//tbody/tr/td[3])[1]")
	public WebElement ticketSubjectAtFirstRow;
	
}
