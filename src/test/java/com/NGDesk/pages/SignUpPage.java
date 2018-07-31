package com.NGDesk.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.NGDesk.utilities.Driver;

public class SignUpPage {
	
	public SignUpPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

    public WebElement email;
    public WebElement phone;
    public WebElement password;
    public WebElement subdomain;
    
    @FindBy(id="agreement")
    public WebElement checkbox;
    
    @FindBy(id="create-company")
    public WebElement getStartedNowButton;
    
    @FindBy(id="errorMessage")
    public WebElement errorMessage;
    
}
