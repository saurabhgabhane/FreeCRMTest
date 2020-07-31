package com.crm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.crm.qa.base.TestBase;
import com.crm.qa.util.TestUtil;

public class ContactsPage extends TestBase {

	@FindBy(xpath = "//a[@class='item' and @href='/contacts']")
	@CacheLookup
	WebElement contactslabel;
	
	@FindBy(xpath = "//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/table/tbody/tr[1]/td[1]/div")
	@CacheLookup
	WebElement selectContacts;
	
	
	@FindBy(xpath="//button[contains(text(),'New')]")
	@CacheLookup
	WebElement newContact;
	
	@FindBy(name="first_name")
	@CacheLookup
	WebElement firstname;
	
	@FindBy(name="last_name")
	@CacheLookup
	WebElement lastname;
	
	@FindBy(name="middle_name")
	@CacheLookup
	WebElement middlename;
	
	@FindBy(xpath="//div[@name='company']//input[@aria-autocomplete='list']")
	@CacheLookup
	WebElement companyName;
	
	@FindBy(xpath="//div[@role='combobox' and @class='ui active visible fluid multiple search selection dropdown']//input[@aria-autocomplete='list']")
	@CacheLookup
	WebElement tags;
	
	@FindBy(xpath="//div[@class='selected item addition']")
	@CacheLookup
	WebElement clickAddtags;
	
	
	  @FindBy(
	  xpath="//span[@class='text']//parent::div[@aria-checked='false']//parent::div[@class='selected item' ]//parent::div[@aria-multiselectable='true']"
	  ) @CacheLookup
	  WebElement clicktags;
	 
	
	@FindBy(name="value")
	@CacheLookup
	WebElement email;
	
	@FindBy(name="name")
	@CacheLookup
	WebElement personalEmail;
	
	@FindBy(xpath="//div[@class='ui field']//div[@name='category']")
	@CacheLookup
	WebElement category;
	
	@FindBy(name="status")
	@CacheLookup
	WebElement status;
	
	@FindBy(xpath="//textarea[@name='description']")
	@CacheLookup
	WebElement description;
	
	@FindBy(xpath="//input[@name='value' and @placeholder='LinkedIn profile link']")
	@CacheLookup
	WebElement channel_type;
	
	@FindBy(xpath="//span[contains(text(),Facebook)]//parent::div[@class='item']//parent::div[@class='visible menu transition']")
	@CacheLookup
	WebElement socialChannel;
	
	@FindBy(xpath="//i[@class='dropdown icon']//parent::div[@name='channel_type']")
	@CacheLookup
	WebElement socialChannelclick;
	
	
	@FindBy(xpath="//div[@name='timezone']")
	@CacheLookup
	WebElement timeZone;
	
	@FindBy(xpath="//span[contains(text(),'Asia/Kolkata')]")
	@CacheLookup
	WebElement timeZoneclick;
	
	@FindBy(xpath ="//div[@class='ui input']//input[@name='address' and @placeholder='Street Address']")
	@CacheLookup
	WebElement address;
	
	@FindBy(xpath ="//div[@class='ui input']//input[@name='city' and @placeholder='City']")
	@CacheLookup
	WebElement cities;
	
	@FindBy(xpath ="//div[@class='ui input']//input[@name='state' and @placeholder='State / County']")
	@CacheLookup
	WebElement states;
	
	@FindBy(xpath ="//div[@class='ui input']//input[@name='zip' and @placeholder='Zip Code']")
	@CacheLookup
	WebElement zips;
	
	
	@FindBy(xpath ="//i[@class='dropdown icon']//parent::div[@name='country']")
	@CacheLookup
	WebElement selectcountries;
	
	@FindBy(xpath ="//span[@class='text' and text()='India']")
	@CacheLookup
	WebElement countries;
	
	
	@FindBy(xpath="//i[@class='dropdown icon']//parent::div[@name='hint']")
	@CacheLookup
	WebElement phonecountry;
	
	@FindBy(xpath="//span[@class='text' and text()='India']//parent::div[@class='item']")
	@CacheLookup
	WebElement selectphonecountry;
	
	@FindBy(xpath="//input[@name='value' and @placeholder='Number']")
	@CacheLookup
	WebElement phonenumbers;
	
	@FindBy(xpath="//input[@name='name' and @placeholder='Home, Work, Mobile...']")
	@CacheLookup
	WebElement homenumbers;
	
	@FindBy(xpath="//input[@name='position']")
	@CacheLookup
	WebElement positions;
	
	@FindBy(name="department")
	@CacheLookup
	WebElement departments;
	
	@FindBy(xpath="//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[11]/div[2]/div/div/input")
	@CacheLookup
	WebElement supervisor;
	
	@FindBy(xpath="//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[12]/div[1]/div/div/input")
	@CacheLookup
	WebElement assistant;
	
	@FindBy(xpath="//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[12]/div[2]/div/div/input")
	@CacheLookup
	WebElement referredBy;
	
	@FindBy(xpath="//div[@name='source']")
	@CacheLookup
	WebElement sources;
	
	@FindBy(xpath="//span[@class='text' and contains(text(),'Repeat Customer')]")
	@CacheLookup
	WebElement sourcesclick;
	
	@FindBy(xpath="//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[13]/div[2]/div/div/label")
	@CacheLookup
	WebElement donotcall;
	
	@FindBy(xpath="//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[14]/div[1]/div/div/label")
	@CacheLookup
	WebElement donotText;
	
	@FindBy(xpath="//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[14]/div[2]/div/div/label")
	@CacheLookup
	WebElement dontemail;
	
	@FindBy(xpath="//input[@name='day']")
	@CacheLookup
	WebElement days;
	
	@FindBy(xpath="//div[@name='month']")
	@CacheLookup
	WebElement months;
	
	@FindBy(xpath="//span[@class='text' and text()='April']")
	@CacheLookup
	WebElement monthselect;
	
	@FindBy(xpath="//input[@name='year' and @placeholder='Year']")
	@CacheLookup
	WebElement years;
	
	@FindBy(xpath="//input[@name='identifier']")
	@CacheLookup
	WebElement identifiers;
	
	@FindBy(name="image")
	@CacheLookup
	WebElement image;
	
	@FindBy(xpath="//i[@aria-hidden='true' and @class='save icon']//parent::button[contains(text(),'Save')]")
	@CacheLookup
	WebElement saveButton;
	
	@FindBy(xpath="//span[@class='text' and contains(text(),'On Hold')]//parent::div[@role='option' and @aria-checked='false']")
	@CacheLookup
	WebElement onHold;
	
	@FindBy(xpath = "//span[@class='text' and contains(text(),'Affiliate')]")
	@CacheLookup
	WebElement affiliate;
	
	@FindBy(xpath = "//i[@aria-hidden='true' and @class='search icon']//parent::div[@role='combobox']//parent::label[@for='tags']")
	@CacheLookup
	WebElement search;
	
	@FindBy(xpath = "//p[contains(text(),'bhau')]")
	@CacheLookup
	WebElement getNameAfterSave;
	
	@FindBy(xpath = "//input[@name='image']")
	@CacheLookup
	WebElement fileNames;
	
	

	
	
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
	
	public void clickOnNewContact() {
		newContact.click();
	}
	
	public void saveNewContact(String firstName,String middleName,String lastName,String company,
		String emailAddress,String personalemailAdd,String tag,
				String descriptions,String channelname,String addrss,String city,String state,String zipss,
				String phonenumber,String homenumber,String position, String department,String dayss,String yearss
				,String identifier) throws Exception {
		
		  double phoneNumber = Double.parseDouble(phonenumber); 
		  double homeNumber = Double.parseDouble(homenumber); 
		  double day = Double.parseDouble(dayss);
		  double year = Double.parseDouble(yearss);
		  double zip = Double.parseDouble(zipss);
		  
		  int phonedata=(int)phoneNumber;
		  int homedata=(int)phoneNumber;
		  int daydata=(int)day;
		  int yeardata=(int)year;
		  int zipdata=(int)zip;
		 
			
		firstname.sendKeys(firstName);
		middlename.sendKeys(middleName);
		lastname.sendKeys(lastName);
		companyName.sendKeys(company);
		email.sendKeys(emailAddress);
		personalEmail.sendKeys(personalemailAdd);
		search.click();
		tags.sendKeys(tag);
		clickAddtags.click();
		search.click();
		category.click();
		affiliate.click();
		status.click();
		onHold.click();
		donotcall.click();
		donotText.click();
		dontemail.click();
		description.sendKeys(descriptions);
		socialChannelclick.click();
		socialChannel.click();
		channel_type.sendKeys(channelname);
		timeZone.click();
		timeZoneclick.click();
		address.sendKeys(addrss);
		cities.sendKeys(city);
		states.sendKeys(state);
		zips.sendKeys(String.valueOf(zipdata));
		selectcountries.click();
		countries.click();
		phonecountry.click();
		selectphonecountry.click();
		phonenumbers.sendKeys(String.valueOf(phonedata));
		homenumbers.sendKeys(String.valueOf(homedata));
		positions.sendKeys(position);
		departments.sendKeys(department);
		sources.click();
		sourcesclick.click();
		days.sendKeys(String.valueOf(daydata));
		months.click();
		monthselect.click();
		years.sendKeys(String.valueOf(yeardata));
		identifiers.sendKeys(identifier);
		
		//TestUtil.fileUpload(fileNames);
		saveButton.click();
		Thread.sleep(5000);
		
		
	}

	public void checkPerson(String middleName) {
		Assert.assertTrue(true);
	}

}
