package com.NGDesk.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.NGDesk.utilities.Driver;

public class SignUpPage {
	//TC6-GS
	public SignUpPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
    //TC6-GS
    public WebElement email;
    public WebElement phone;
    public WebElement password;
    public WebElement subdomain;
     //TC6-GS
    @FindBy(id="agreement")
    public WebElement checkbox;
    //TC6-GS
    @FindBy(id="create-company")
    public WebElement getStartedNowButton;
    //TC6-GS
    @FindBy(id="errorMessage")
    public WebElement errorMessage;
    
}
