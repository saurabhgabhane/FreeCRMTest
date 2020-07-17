package com.crm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class ContactsPage extends TestBase {

	@FindBy(xpath = "//*[@id=\"dashboard-toolbar\"]/div[1]")
	WebElement contactslabel;
	
	@FindBy(xpath = "//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/table/tbody/tr[1]/td[1]/div")
	WebElement selectContacts;
	
	public ContactsPage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean verifyContactsLabel() {
		return contactslabel.isDisplayed();
	}
	
	public void clickOnContactsCheckBox(int tr) {
		driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]"
				+ "/table/tbody/tr["+tr+"]/td[1]/div")).click();
	}
	
	public void multipleclickOnContactCheckBox() {
		
	}
}
