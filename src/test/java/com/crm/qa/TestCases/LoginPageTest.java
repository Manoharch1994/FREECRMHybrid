package com.crm.qa.TestCases;

import org.apache.commons.math3.analysis.function.Log;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.BaseClass.TestBase;
import com.crm.qa.Pages.HomePage;
import com.crm.qa.Pages.LoginPage;
import com.mongodb.diagnostics.logging.Logger;

public class LoginPageTest extends TestBase {

		LoginPage loginPage;
		HomePage homePage;
		
		public LoginPageTest(){
			super();
		}
		
		@BeforeMethod
		public void setUp(){
			initialization();
			loginPage = new LoginPage();	
		}
		
		@Test(priority=1)
		public void loginPageTitleTest(){
			String title = loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "CRMPRO - CRM software for customer relationship management, sales, and support.");

		
		
		
		}
		
		@Test(priority=2)
		public void crmLogoImageTest(){
			boolean flag = loginPage.validateCRMImage();
			Assert.assertTrue(flag);
		}
		
		@Test(priority=3)
		public void loginTest(){
			homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		}
		
		
		
		@AfterMethod
		public void tearDown(){
			driver.quit();
		}
		
	
	
	
	
	
}

