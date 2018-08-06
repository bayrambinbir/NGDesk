package com.NGDesk.tests.login;

import org.testng.annotations.Test;
import com.NGDesk.pages.LoginPage;
import com.NGDesk.tests.TestBase;
import com.NGDesk.utilities.ConfigurationReader;
//TC8-GS
public class LoginNegativeTest extends TestBase {

	LoginPage loginPage= new LoginPage();
	
   //TC8-GS
	@Test
	public void loginNegativeTest() {
		driver.get(ConfigurationReader.getProperty("loginPageUrl"));
		loginPage.username.sendKeys(ConfigurationReader.getProperty("username"));
		loginPage.password.sendKeys(ConfigurationReader.getProperty("negativePassword"));
		loginPage.loginButton.click();
		

	}
}
