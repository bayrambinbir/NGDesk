package com.NGDesk.tests.login;

import org.testng.annotations.Test;


//TC7-GS 
import com.NGDesk.pages.LoginPage;
import com.NGDesk.tests.TestBase;

import com.NGDesk.utilities.ConfigurationReader;
//TC7-GS
public class LoginPositiveTest extends TestBase {

	LoginPage loginPage= new LoginPage();
	
	
	//TC7-GS
	@Test
	public void loginWithPositiveCredentials() {
		
		driver.get(ConfigurationReader.getProperty("loginPageUrl"));
		loginPage.username.sendKeys(ConfigurationReader.getProperty("username"));
		loginPage.password.sendKeys(ConfigurationReader.getProperty("password"));
		loginPage.loginButton.click();
	}
	

}
