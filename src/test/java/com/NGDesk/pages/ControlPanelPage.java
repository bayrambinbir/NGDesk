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
	

}
