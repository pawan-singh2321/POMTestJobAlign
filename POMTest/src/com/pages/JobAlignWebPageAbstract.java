package com.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public abstract class JobAlignWebPageAbstract {

	//Driver
	protected WebDriver driver;
	
	//Common in all Pages
	protected By baseLink = By.xpath("//div[@class='topLine']//img/ancestor::a");
	protected By copyright = By.xpath("//span[@class='copyright'][contains(text(),'Jobalign')]");
	
	//Login Page Elements
	protected By userNameEntryField = By.xpath("//div[@id='emailLogin']//div[@id='ExistingUserHeader']//input[@id='txtEmail']");
	protected By passwordEntryField = By.xpath("//div[@id='emailLogin']//div[@id='ExistingUserHeader']//input[@id='txtPwd']");
	protected By submitButton = By.xpath("//div[@id='emailLogin']//div[@id='ExistingUserHeader']//input[@type='submit']");
	
	//Home Page Elements
	//Accessing Brand Using Row Number
	protected String brandRowNumXpath = "//table//tr";
	protected int searchedRow;
	protected List<WebElement> brandRow;
	protected String remainingConfigButtonXpath = "//a[contains(text(),'configuration')]";
	protected WebElement configurationButton;
	
	//Accessing Brand Using Row URL
	protected String brandRowByUrlXpath = "//table//tr//td/a[contains(text(),'";
	protected String url;
	protected String remainingConfigurationXpath = "')]/ancestor::td/following-sibling::td//a[contains(text(),'configuration')]";
	
	protected By logout = By.xpath("//a[@id='logoutlink']");
	
	//Configuration Page
	protected By userTab = By.xpath("//li[@id='tabUsers']/a");
	protected By organizationTab = By.xpath("//li[@id='tabOrganization']/a");
	protected By questionsTab = By.xpath("//li[@id='tabQuestions']/a");
	protected By configurationTab = By.xpath("//li[@id='tabConfiguration']/a");
	
	//Users Page
	protected By addUserButton = By.cssSelector(".js-adduser");
	protected By userActionModal = By.xpath("//div[@id='user-action-modal']");
	protected By selectRole = By.xpath("//div[@class='userview-action-control-row']//select");
	protected By inputFields = By.xpath("//div[@class='userview-action-control-row']//input");
//	protected By 
	
	
	//Common Methods
	public String getParentWebsiteLink() {
		return this.driver.findElement(baseLink).getAttribute("href");
	}
	
	public String getCopyRight() {
		return this.driver.findElement(copyright).getText();
	}
}
