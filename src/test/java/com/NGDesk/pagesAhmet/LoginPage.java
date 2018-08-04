package com.NGDesk.pagesAhmet;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.NGDesk.utilities.Driver;

public class LoginPage {

	public LoginPage() {
		
		PageFactory.initElements(Driver.getDriver(), this);
		
	}
	
	@FindBy(id="username")
	public WebElement userName;
	
	@FindBy(id="password")
	public WebElement password;
	
	@FindBy(id="login-button")
	public WebElement loginButton;
	
	public void login(String username,String pwd) {
		userName.sendKeys(username);
		password.sendKeys(pwd);
		loginButton.click();
		
	}
	
	
	
	
	
}
