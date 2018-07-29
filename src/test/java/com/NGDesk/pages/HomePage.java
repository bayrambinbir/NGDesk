package com.NGDesk.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.NGDesk.utilities.Driver;

public class HomePage {

	public HomePage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy(xpath="//li[@id='menu-item-5609']//span[@class='menu-text'][contains(text(),'Log In')]")
	public WebElement loginButton;
	
	@FindBy(xpath="//input[@placeholder='Subdomain']")
	public WebElement subdomainBox;
	
	@FindBy(css=".btn.btn-block.col-12.mx-auto.ng-binding")
	public WebElement goLoginButton;
	
	@FindBy(css=".menu-text.fusion-button.button-default.button-small")
	public WebElement signUpButton;
}
