package com.NGDesk.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.NGDesk.utilities.Driver;

public class CreatingNewTicketPage {
	
	public CreatingNewTicketPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	// Bayram test case 4 (SPA-678)
	
	@FindBy(xpath="//h3[text()='New Ticket']")
	public WebElement newTicketTitle;

	@FindBy (xpath= "//div[@class='selectize-input focus']")
	public WebElement requester;
	
	@FindBy (xpath ="//div[@title='Choose Severity']//input[@type='search']")
	public WebElement severity;
	
	@FindBy (xpath = "//div[@title='Choose Severity']//div[@class='selectize-input']")
	public WebElement optionsForSeverity;
	
	@FindBy (xpath = "//input[@id='subjectField']")
	public WebElement subject;
	
	@FindBy (xpath = "//input[@placeholder='Add CC Emails']")
	public WebElement ccEmail;
	
	@FindBy (xpath = "//input[@id='dateReq']")
	public WebElement dateRequiredBy;
	
	@FindBy (xpath = "//td[@class='active day']")
	public WebElement choosingDate;
	
	@FindBy (xpath = "//select[@placeholder='HandOff Time']")
	public WebElement time;
	
	@FindBy (xpath = "//input[@type='file']")
	public WebElement chooseFile;
	
	@FindBy (id = "submit")
	public WebElement submit;
	//
	
	
}
