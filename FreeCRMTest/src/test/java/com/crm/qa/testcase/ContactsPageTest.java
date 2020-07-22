package com.crm.qa.testcase;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;

public class ContactsPageTest extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	ContactsPage contactPage;
	String sheetName="contacts";
	
	public ContactsPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() throws InterruptedException {
		initialization();
		loginPage=new LoginPage();
		contactPage=new ContactsPage();
		homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		contactPage=homePage.clickOnContactsLink();
		Thread.sleep(2000);
		
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
	
	@Test
	public void clickOnNewContact() {
		contactPage.clickOnNewContact();
		
	}
	
	@DataProvider
	public Object[][] getContactTestData()
	{
		Object[][] data = TestUtil.getTestData(sheetName);
		return data;
	}
	
	@Test(dataProvider = "getContactTestData")
	public void clickOnNewContactSave(String firstName,String middleName,String lastName,String company,
			String emailAddress,String personalemailAdd,String tag,
			String descriptions,String channelname,String addrss,String city,String state,String zip,
			String phoneNumber,String homeNumber,String position, String department,String days,String years
			,String identifier) throws InterruptedException {
		
		contactPage.clickOnNewContact();
		contactPage.saveNewContact(firstName, middleName, lastName, company, emailAddress, personalemailAdd, tag, descriptions, channelname, addrss, city, state, zip, phoneNumber, homeNumber, position, department, days, years, identifier);
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
}
