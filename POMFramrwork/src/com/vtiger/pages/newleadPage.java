package com.vtiger.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class newleadPage extends headerPage{
	
	WebDriver driver;
	
	By lastname=By.name("lastname");
	By company = By.name("company");
	By savebtn=By.name("button");
	
	public newleadPage(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
	}
	
	
	public void createLead(String lname,String comp)
	{
		driver.findElement(lastname).sendKeys(lname);
		driver.findElement(company).sendKeys(comp);
		driver.findElement(savebtn).click();
	}

}
