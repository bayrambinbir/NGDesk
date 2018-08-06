package com.NGDesk.tests.login;

//Smoke Test
import org.testng.annotations.Test;

import com.NGDesk.pages.HomePage;
import com.NGDesk.pages.LoginPage;
import com.NGDesk.tests.TestBase;
import com.NGDesk.utilities.BrowserUtils;
import com.NGDesk.utilities.ConfigurationReader;

public class LoginPageTests extends TestBase {

	HomePage homePage = new HomePage();
	LoginPage loginPage = new LoginPage();


	
	@Test(groups= {"smoke"})
	public void loginTest() {
		BrowserUtils.waitFor(3);
		homePage.loginButton.click();
		homePage.subdomainBox.sendKeys(ConfigurationReader.getProperty("subdomain"));
		homePage.goLoginButton.click();
		BrowserUtils.waitFor(3);
		loginPage.username.sendKeys(ConfigurationReader.getProperty("username"));
		loginPage.password.sendKeys(ConfigurationReader.getProperty("password"));
		loginPage.loginButton.click();
	}

}
