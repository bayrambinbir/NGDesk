package com.NGDesk.tests.login;

import org.testng.annotations.Test;
import com.NGDesk.pages.LoginPage;
import com.NGDesk.tests.TestBase;
import com.NGDesk.utilities.ConfigurationReader;

public class LoginNegativeTest extends TestBase {

	LoginPage loginPage= new LoginPage();
	
	@Test
	public void loginNegativeTest() {
		
		driver.get(ConfigurationReader.getProperty("loginUrl"));
		loginPage.username.sendKeys("zhumabaf@gmail.com");
		loginPage.password.sendKeys("Cybertek1!5");
		loginPage.loginButton.click();
		

	}
}
