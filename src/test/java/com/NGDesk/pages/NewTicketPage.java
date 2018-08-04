package com.NGDesk.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewTicketPage {
	
	@FindBy(partialLinkText="ngdesk43")
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
