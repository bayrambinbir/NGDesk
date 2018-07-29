package com.NGDesk.tests.login;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.NGDesk.pages.HomePage;
import com.NGDesk.pages.SignUpPage;
import com.NGDesk.tests.TestBase;

public class SignUpPageTest extends TestBase {
	
	SignUpPage signUpPage= new SignUpPage();
	HomePage homePage=new HomePage();
	
	@Test
	public void signUpNegativeTest() {
		
		homePage.signUpButton.click();
		signUpPage.email.sendKeys("555@555.com");
		signUpPage.phone.sendKeys("5555555555");
		signUpPage.password.sendKeys("555555555");
		signUpPage.subdomain.sendKeys("boom123");
		signUpPage.checkbox.click();
		signUpPage.getStartedNowButton.click();
		
		String expectedErrorText = "password must contain a letter";
		String actualErrorText = signUpPage.errorMessage.getText();
		
		assertEquals(actualErrorText,expectedErrorText);
		
	}

}
