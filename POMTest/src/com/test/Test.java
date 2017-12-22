package com.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pages.JobAlignHomePage;
import com.pages.JobAlignLoginPage;

public class Test {

	public static void main(String[] args) throws IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\TestCases\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.jobalineci.com/employer/login");
		
		JobAlignLoginPage login = new JobAlignLoginPage(driver);
		if (login.getCopyRight().toLowerCase().contains("jobalign") && login.getParentWebsiteLink().contains("http://www.jobaline.com/en/"));
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter UserName: ");
		String userName = reader.readLine();
		System.out.println("Enter Password: ");
		String password = reader.readLine();
		login.login(userName, password);

		JobAlignHomePage home = new JobAlignHomePage(driver);
		//home.openConfiguration(2);
		home.openConfiguration("gj6aoaghnjolpihnjppjg.jobalineci.com");
		home.logout();
		
		Thread.sleep(2000);
		driver.close();
	}

}
