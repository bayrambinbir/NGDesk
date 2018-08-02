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
	
	@FindBy(xpath="//label[.='asli turk']")
	public WebElement requesterTab;
	
	@FindBy(xpath="//input[@class='ui-select-search ui-select-toggle ng-pristine ng-untouched ng-valid ng-empty']")
	public WebElement severityTabClick;
	
	@FindBy(xpath="//div[@class='ui-select-choices-row ng-scope active']")
	public WebElement severityTabLow;
	
	@FindBy(id="team")
	public WebElement teamTabClick;
	
	@FindBy(xpath="//div[contains(text(),'Default')]")
	public WebElement teamTabDefault;
	
	/*
	@FindBy(xpath="(//div[@class='selectize-input'])[2]")
	public WebElement severityTab;
	
	@FindBy(xpath="//input[@class='ui-select-search ui-select-toggle ng-pristine ng-valid ng-empty ng-touched']")
	public WebElement teamTab;
	 */
	
	@FindBy(id="subjectField")
	public WebElement subject;
	
	@FindBy(xpath="(//div[@class='input-icon right'])[2]")
	public WebElement body;
	
	@FindBy(xpath="(//div[@class='selectize-input'])[4]")
	public WebElement ccUsers;
	
	@FindBy(xpath="//div[contains(text(),'asat1121')]")
	public WebElement asat1121;
	
	public WebElement submit;
	
	@FindBy(css=".modal-title.ng-binding")
	public WebElement confirmationNewTicket;
	
	@FindBy(xpath="(//button[@class='btn btn-primary ng-binding'])[3]")
	public WebElement saveAndSubmit;
	
	
	
	
}
