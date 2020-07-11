package com.crm.qa.TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.crm.qa.BaseClass.TestBase;
import com.crm.qa.Pages.ContactsPage;
import com.crm.qa.Pages.HomePage;
import com.crm.qa.Pages.LoginPage;
import com.crm.qa.Util.Testutil;

public class ContactsPageTest extends TestBase {
	LoginPage loginPage;
	HomePage homePage;
	Testutil Testutil;
	ContactsPage contactsPage;
	
	String sheetName = "contacts";
	
	   
	public ContactsPageTest(){
			super();
			
	}
	
	
	@BeforeMethod
	public void setUp() throws InterruptedException {
		
		initialization();
		Testutil = new Testutil();
		contactsPage = new ContactsPage();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		//Testutil.runTimeInfo("error", "login successful");
		Testutil.switchToFrame();
		//contactsPage = homePage.clickOnContactsLink();
	}
	
	

	
	@DataProvider
	public Object[][] getCRMContactsTestData(){
		Object data[][] =Testutil.getTestData(sheetName);
		return data;
	
	}
	
	
	
	
	

	@Test(priority =1,dataProvider = "getCRMContactsTestData" )
	public void validateCreatenewContact(String title, String firstname, String lastname, String company) {
		homePage.clickOnNewContactLink();
		//contactsPage.createNewContact("Mr.","David", "Peter", "Amazon");
		contactsPage.createNewContact(title, firstname, lastname, company);		
		
		
		
		
	}
	
	

	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
	
	
	
	
	
	
}
