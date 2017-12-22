package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class JobAlignHomePage extends JobAlignWebPageAbstract{

	//Initializing Driver
	public JobAlignHomePage(WebDriver driver) {
		this.driver = driver;
	}

	//Setters
	public void setRowNumber(int rowNum) {
		try {
			this.brandRowNumXpath += "["+ ++rowNum +"]//td";
			this.remainingConfigButtonXpath = this.brandRowNumXpath + this.remainingConfigButtonXpath;
			this.brandRow = this.driver.findElements(By.xpath(this.brandRowNumXpath));
		}
		catch(NoSuchElementException error) {
			return;
		}
	}

	public void setRowByUrl(String url) {
		try {
			this.url = url;
			this.remainingConfigurationXpath = this.brandRowByUrlXpath + this.url + this.remainingConfigurationXpath;
		}
		catch(NoSuchElementException error) {
			return;
		}
	}

	public void setConfigurationButton() {
		if (this.brandRow != null)
			this.configurationButton = this.brandRow.get(6);
		//this.configurationButton = this.driver.findElement(By.xpath("//a[contains(text(),'configuration')]")); //Alternative for above statement
		else if (this.url != null)
			this.configurationButton = this.driver.findElement(By.xpath(this.remainingConfigurationXpath));
		else 
			System.err.println("Set row number of brand you want to configure. Call Function setRowNumber or setRowByUrl.");
	}
	
	//Events
	public void clickConfiguration() {
		if (this.configurationButton != null)
			this.configurationButton.click();
		else
			System.err.println("Configure Button Link not set. Consider using setConfigurationButton() first.");
	}
	
	public void logout() {
		if (this.driver.findElement(logout).isDisplayed())
			this.driver.findElement(logout).click();
		else 
			System.err.println("Logout not visible from current page. Consider moving back to Home page.");
	}
	
	//Complete Traversal Process
	public void openConfiguration(int rowNum) {
		this.setRowNumber(rowNum);
		this.setConfigurationButton();
		this.clickConfiguration();
	}
	
	public void openConfiguration(String url) {
		this.setRowByUrl(url);
		this.setConfigurationButton();
		this.clickConfiguration();
	}
}
