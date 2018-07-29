package com.NGDesk.tests.login;

import org.testng.annotations.Test;

import com.NGDesk.pages.HomePage;
import com.NGDesk.tests.TestBase;
import com.NGDesk.utilities.ConfigurationReader;

public class HomePageTests extends TestBase {

	HomePage homePage = new HomePage();
	
	@Test(groups= {"smoke"})
	public void homePageTest() {
		homePage.loginButton.click();
		homePage.subdomainBox.sendKeys(ConfigurationReader.getProperty("subdomain"));
		homePage.goLoginButton.click();
	
	}

}
