package com.NGDesk.pagesAhmet;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.NGDesk.utilities.Driver;

public class HomePage {

	
	public HomePage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy(xpath="//i[@class='fa fa-universal-access  icon-color']")
	public WebElement hoverOver;
	
	@FindBy(linkText="Premade Responses")
	public WebElement premadeResponses;
	
	@FindBy(linkText="Manage Accounts")
	public WebElement manageAccounts;
	
	@FindBy(xpath="//h3[@class='master-title-container title-style ng-binding']")
	public WebElement titleManage;
	
	@FindBy(xpath="//*[@id=\"tickets-master-buttons\"]/button[1]/i")
	public WebElement views;
	
	@FindBy(xpath="//*[@id=\"table-area\"]/div/div/div[1]/div[2]/p")
	public WebElement titleViews;
	
	@FindBy(name="allTicketsTable_length")
	public WebElement selectEntries;
	
	@FindBy(xpath="//*[@id=\"allTicketsTable\"]/tbody/tr/td")
	public WebElement emptyTable;
	
	
}
