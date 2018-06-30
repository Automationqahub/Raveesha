package com.vtiger.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
	WebDriver driver;
	

	 @FindBy(name="user_name")
	 WebElement username;
	 
	 @FindBy(name="user_password")
	 WebElement userpwd;
	 
	 @FindBy(name="login_theme")
	 WebElement theme;
	 
	 @FindBy(name="Login")
	 WebElement btn;
	
	 @FindBy(xpath="//td[contains(text(),'You must specify a valid username and password.')]")
	 List<WebElement> errormsg;
	 
	 @FindBy(xpath="//img[@src='include/images/vtiger-crm.gif']")
	 List<WebElement> imglogo;
		
	
	
	
	public loginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public homePage validLogin(String user,String pwd)
	{
		username.clear();
		username.sendKeys(user);
		userpwd.clear();
		userpwd.sendKeys(pwd);
		btn.click();
		return new homePage(driver);
	}
	
	public int invalidLogin()
	{
		username.sendKeys("asdadsd");
		userpwd.sendKeys("24214124");
		btn.click();
		int elmsize= errormsg.size();
		return elmsize;
	}
	public String verifytitle()
	{
		return driver.getTitle().trim();
	}
	
	public int verifylogo()
	{
		
		int elmsize= imglogo.size();
		return elmsize;
	}
	
	

}
