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
	public WebElement viewTickets;
	
	@FindBy(xpath="//li[.='New Ticket']")
	public WebElement newticket;
	
	@FindBy(xpath= "(//table[@id='allTicketsTable']//tbody/tr/td[2]/div[@class='text-wrap '])[1]")
    public WebElement ticketIdAtFirstRow;	
	
	@FindBy(xpath ="(//table[@id='allTicketsTable']//tbody/tr/td[3])[1]")
	public WebElement ticketSubjectAtFirstRow;
	
	@FindBy(xpath= "//div[@id='tickets-master-buttons']//button[@class='btn btn-primary ng-binding ng-isolate-scope']")
	public WebElement viewsButtonByTheDownloadButton;
	
	@FindBy(xpath= "//p[contains(text(),'Custom Views')]")
	public WebElement costumViews;
	
	@FindBy(xpath= "//i[@class='fa fa-download']")
	public WebElement downloadButton;
	
	@FindBy (xpath = "(//tr[@role='row' and @class='row-style'])[1]")
	public WebElement firstTicket;
	
	@FindBy (xpath="//h4[@class='float-left']")
	public WebElement controlPanel;
}
