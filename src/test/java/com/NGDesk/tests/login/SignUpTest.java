package com.NGDesk.tests.login;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.NGDesk.pages.HomePage;
import com.NGDesk.pages.SignUpPage;
import com.NGDesk.tests.TestBase;
import com.NGDesk.utilities.ConfigurationReader;
//TC6-GS
public class SignUpTest extends TestBase {
	
	SignUpPage signUpPage= new SignUpPage();
	HomePage homePage=new HomePage();
	
	//TC6-GS
	@Test
	public void signUpNegativeTest() {
		homePage.signUpButton.click();
		signUpPage.email.sendKeys(ConfigurationReader.getProperty("wrongEmail"));
		signUpPage.phone.sendKeys(ConfigurationReader.getProperty("wrongPhone"));
		signUpPage.password.sendKeys(ConfigurationReader.getProperty("wrongPassword"));
		signUpPage.subdomain.sendKeys(ConfigurationReader.getProperty("subdomain"));
		signUpPage.checkbox.click();
		signUpPage.getStartedNowButton.click();
		String expectedErrorText = "password must contain a letter";
		String actualErrorText = signUpPage.errorMessage.getText();
		assertEquals(actualErrorText,expectedErrorText);
		
	}

}
