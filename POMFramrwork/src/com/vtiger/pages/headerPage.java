package com.vtiger.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class headerPage {
	WebDriver driver;
	
	
	By lnkLogout=By.linkText("Logout");
	By lnkNewLead=By.linkText("New Lead");
	By lnkLeads=By.linkText("Leads");
	By lnkNewAccount=By.linkText("New Account");
	
	public headerPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	public void ClickonlnkLeads()
	{
		if(driver.findElements(lnkLeads).size()==1)
		{
			driver.findElement(lnkLeads).click();
			System.out.println("PASSED");
		}
		else
		{
			System.out.println("FAILED");
		}
	}
	
	public void ClickonLogout()
	{
		if(driver.findElements(lnkLogout).size()==1)
		{
			driver.findElement(lnkLogout).click();
			System.out.println("PASSED");
		}
		else
		{
			System.out.println("FAILED");
		}
	}
	
	public void ClickonNewLead()
	{
		if(driver.findElements(lnkNewLead).size()==1)
		{
			driver.findElement(lnkNewLead).click();
			System.out.println("PASSED");
		}
		else
		{
			System.out.println("FAILED");
		}
	}
	public int verifyLogout()
	{
		
		int elmsize= driver.findElements(lnkLogout).size();
		return elmsize;
	}

}
