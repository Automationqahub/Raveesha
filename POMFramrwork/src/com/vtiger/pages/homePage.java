package com.vtiger.pages;

import org.openqa.selenium.WebDriver;

public class homePage extends headerPage {
	WebDriver driver;
	

	public homePage(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
	}
	
	public void verifyHomePage()
	{
		System.out.println("Verified Home page successfully");
	}
	
	

}
