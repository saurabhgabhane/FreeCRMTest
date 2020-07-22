package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {

	//PageFactory-OR(Object Repo)
	@FindBy(name = "email")
	@CacheLookup
	WebElement email;
	
	@FindBy(name="password")
	@CacheLookup
	WebElement password;
	
	@FindBy(xpath = "//div[contains(text(),'Login')]")
	@CacheLookup
	WebElement loginBtn;
	
	@FindBy(linkText = "Classic CRM")
	@CacheLookup
	WebElement classicCRMlogin;
	
	@FindBy(linkText = "Sign Up")
	@CacheLookup
	WebElement signuplink;

	public LoginPage() {
		//Initializing the PageObjects
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	
	public HomePage login(String un,String ps) {
		email.sendKeys(un);
		password.sendKeys(ps);
		loginBtn.click();
		return new HomePage();
	}
	
	
	
	
	
	
}
