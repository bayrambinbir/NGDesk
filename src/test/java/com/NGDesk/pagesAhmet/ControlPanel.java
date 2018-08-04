package com.NGDesk.pagesAhmet;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.NGDesk.utilities.Driver;

public class ControlPanel {

	public ControlPanel() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy(id="title")
	public WebElement nameTitle;
	
	@FindBy(xpath="//*[@id=\"team\"]/div[1]")
	public WebElement selectTeam;
	
	@FindBy(id="response_type")
	public WebElement responseType;
	
	@FindBy(id="responseBody")
	public WebElement responseBody;
	
	@FindBy(xpath="//span[@class='ng-binding']")
	public WebElement saveResponse; 
	
	@FindBy(id="snackbar")
	public WebElement message;
	
	@FindBy(xpath="//td[contains(text(),'Greeting, Response')]")
	public WebElement underTitle;
	
	@FindBy(xpath="//span[contains(@class,'ng-binding btn btn-warning btn-sm pointer')]")
	public WebElement severity;
	
	
}
