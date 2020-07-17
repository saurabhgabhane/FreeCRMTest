package com.crm.qa.testcase;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class HomePageTest extends TestBase {
	LoginPage loginPage;
	HomePage homePage;
	public HomePageTest() {
		super();
	}
	
	//TestCases Should be Separated-independent with each other
	//before each testcase launch browser and login
	//@test case run
	//after each test case --close the browser
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage=new LoginPage();
		homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test(priority = 1)
	public void verifyHomeTitleTest() {
		String homepagetitle = homePage.verifyHomePageTitle();
		Assert.assertEquals(homepagetitle, "Cogmento CRM","Home Page Title Not Match");
	}
	
	@Test(priority = 2)
	public void verifyUserNameTest() {
		boolean correctuserName = homePage.verifyCorrectuserName();
		Assert.assertTrue(correctuserName);
	}
	
	@Test(priority = 3)
	public void verifyContactLLinkTest() {
		homePage.clickOnContactsLink();
	}
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	
}
