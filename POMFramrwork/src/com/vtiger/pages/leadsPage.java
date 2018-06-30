package com.vtiger.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class leadsPage extends headerPage {
	
	WebDriver driver;
	
	By elmLeadsHome=By.xpath("//td[contains(text(),'Leads: Home')]");
	By chkuseronly = By.name("current_user_only");
	
	public leadsPage(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
	}
	
	
		public void verifyLeadsPage()
		{
			if(driver.findElements(elmLeadsHome).size()==1)
			{
				System.out.println("PASSED");
			}
			else
			{
				System.out.println("FAILED");
			}
		}
		
		public void clickOnCheckbox()
		{
			if(driver.findElements(chkuseronly).size()==1)
			{
				driver.findElement(chkuseronly).click();
				System.out.println("PASSED");
			}
			else
			{
				System.out.println("FAILED");
			}
		}
}
