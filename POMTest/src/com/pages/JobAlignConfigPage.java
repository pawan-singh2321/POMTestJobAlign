package com.pages;

import org.openqa.selenium.WebDriver;

public class JobAlignConfigPage extends JobAlignWebPageAbstract{

	public JobAlignConfigPage(WebDriver driver) {
		this.driver = driver;
	}

	//Movement
	public void goToUsersTab() {
		if (this.driver.findElement(this.userTab).isDisplayed())
			this.driver.findElement(this.userTab).click();
		else
			System.err.println("Cannot Find Users Tab. Consider moving to Configuration Page.");
	}
	
	public void goToOrganizationTab() {
		if (this.driver.findElement(this.organizationTab).isDisplayed())
			this.driver.findElement(this.organizationTab).click();
		else
			System.err.println("Cannot Find Organization Tab. Consider moving to Configuration Page.");
	}

	public void goToInterviewQuestionsTab() {
		if (this.driver.findElement(this.questionsTab).isDisplayed())
			this.driver.findElement(this.questionsTab).click();
		else
			System.err.println("Cannot Find Interview Question Tab. Consider moving to Configuration Page.");
	}
	
	public void goToConfigurationTab() {
		if (this.driver.findElement(this.userTab).isDisplayed())
			this.driver.findElement(this.userTab).click();
		else
			System.err.println("Cannot Find Users Tab. Consider moving to Configuration Page.");
	}
	
	public void logout() {
		if (this.driver.findElement(logout).isDisplayed())
			this.driver.findElement(logout).click();
		else 
			System.err.println("Logout not visible from current page. Consider moving back to Home page.");
	}
}
