package com.pages;

import org.openqa.selenium.WebDriver;

public class JobAlignLoginPage extends JobAlignWebPageAbstract{
	
	//Initializing Driver
	public JobAlignLoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//Events
	public void clickLogin() {
		this.driver.findElement(submitButton).click();
	}
	
	//Setters
	public void setUserName(String userName) {
		this.driver.findElement(userNameEntryField).sendKeys(userName);
	}
	
	public void setPassword(String password) {
		this.driver.findElement(passwordEntryField).sendKeys(password);
	}
	
	//Complete Login Procedure
	public void login(String userName, String password) {
		this.setUserName(userName);
		this.setPassword(password);
		this.clickLogin();
	}
}
