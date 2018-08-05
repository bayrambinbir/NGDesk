package com.NGDesk.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.NGDesk.utilities.Driver;

public class ControlPanelPage {

	public ControlPanelPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy(xpath="(//div[@class='col-12 col-sm-12'])[1]")
	public WebElement controlPanelText;
	
	@FindBy(partialLinkText="Public")
	public WebElement publicButton;
	
	@FindBy(id="messageAreaExternal")
	public WebElement publicTextBox;
	
	@FindBy(xpath="//div[@class='row align-content-center']//div[@class='float-right']")
	public WebElement submit;
	
	@FindBy(css=".modal-title.text-center.ng-binding")
	public WebElement submitReplyText;
	
	@FindBy(xpath="(//div[@class='selectize-input'])[3]")
	public WebElement submitReplyDropdownMenu;
	
	@FindBy(xpath="//div[.='Waiting on Customer Response']")
	public WebElement waitingOnCustomerResponse;
	
	@FindBy(xpath="(//div[@class='modal-footer'])[2]//button[.='Submit']")
	public WebElement submitButtonOnSubmitReplyPage;
	
	
	
	
	

}
