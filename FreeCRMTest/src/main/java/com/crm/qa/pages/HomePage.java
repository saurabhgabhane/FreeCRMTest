package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase{

	@FindBy(xpath = "//span[contains(text(),'Saurabh Gabhane')]")
	WebElement usernameLabel;
	
	@FindBy(xpath = "//span[contains(text(),'Contacts')]")
	WebElement contactslink;
	
	@FindBy(xpath = "//span[conatins(text(),'Deals')]")
	WebElement dealslink;
	
	@FindBy(xpath = "//span[conatins(text(),'Tasks')]")
	WebElement taskslink;
	
	
	//Initialze PaageObjects
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyHomePageTitle() {
		return driver.getTitle();
	}
	
	public ContactsPage clickOnContactsLink() {
		contactslink.click();
		return new ContactsPage();
	}
	
	public DealsPage clickOnDealsLink() {
		dealslink.click();
		return new DealsPage();
	}
	
	public TasksPage clickOnTasksLink() {
		taskslink.click();
		return new TasksPage();
	}
	

	
	public boolean verifyCorrectuserName() {
		return usernameLabel.isDisplayed();
	}
	
}
