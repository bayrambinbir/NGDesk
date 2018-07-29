package com.NGDesk.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.NGDesk.utilities.Driver;

public class LoginPage {

	public LoginPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	
	public WebElement username;
	
	public WebElement password;
	
	@FindBy(id="login-button")
	public WebElement loginButton;
	
	

}
