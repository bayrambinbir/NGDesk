package com.NGDesk.tests.loginAhmet;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.NGDesk.pagesAhmet.HomePage;
import com.NGDesk.pagesAhmet.LoginPage;
import com.NGDesk.tests.TestBase;
import com.NGDesk.tests.TestBaseAhmet;
import com.NGDesk.utilities.ConfigurationReader;

public class TestCase20 extends TestBaseAhmet{
	
	String userId = ConfigurationReader.getProperty("Ausername");
	String password = ConfigurationReader.getProperty("Apassword");
	
	@Test
	public void testCase20() throws InterruptedException {
		//Navigate to NGdesk website and login
		LoginPage loginPage=new LoginPage();
		loginPage.login(userId,password);
		Thread.sleep(3000);
		
		//Click on Views button Custom Views should appear on the left
		HomePage homePage=new HomePage();
		homePage.views.click();
		Thread.sleep(3000);
		System.out.println(homePage.titleViews.getText());
		Assert.assertEquals(homePage.titleViews.getText(), "three");
		Thread.sleep(3000);
		
		//Click on Show entries and choose 100
		Select global=new Select(homePage.selectEntries);
		global.selectByIndex(3);
		Thread.sleep(2000);
		
		//Verify in the table "No data available in table"
		Assert.assertEquals(homePage.emptyTable.getText(), "No data available in table");
		
		
		
	}
	

}
