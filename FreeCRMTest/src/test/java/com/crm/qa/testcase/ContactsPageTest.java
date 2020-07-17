package com.crm.qa.testcase;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class ContactsPageTest extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	ContactsPage contactPage;
	
	public ContactsPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage=new LoginPage();
		contactPage=new ContactsPage();
		homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		contactPage=homePage.clickOnContactsLink();
	}
	
	@Test(priority = 1)
	public void verifyContactsPageLabel() {
		Assert.assertTrue(contactPage.verifyContactsLabel(),"Contacts Label is Missing on this Page");
	}
	
	@Test(priority = 2)
	public void selectContactsLabel() {
		
		contactPage.clickOnContactsCheckBox(1);
		contactPage.clickOnContactsCheckBox(2);
		contactPage.clickOnContactsCheckBox(3);
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
}
