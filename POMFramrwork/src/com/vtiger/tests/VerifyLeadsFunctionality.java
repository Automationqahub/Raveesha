package com.vtiger.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.vtiger.common.commonFunctions;
import com.vtiger.pages.homePage;
import com.vtiger.pages.loginPage;
import com.vtiger.pages.newleadPage;

public class VerifyLeadsFunctionality extends BaseTest {
		
	@BeforeClass
	public void lauchApp()
	{
		luanchApp();		
	}
	
	
	
	
	@Test(priority=4)
	public void createLead()
	{
		logger=report.startTest("createLead");
		logger.log(LogStatus.INFO, "Application luanched successfully");
		loginPage lp=new loginPage(driver);		
		homePage hm=lp.validLogin("admin", "admin");
		int elmsize2=hm.verifyLogout();
		if(elmsize2==1)
		{
			logger.log(LogStatus.PASS, "Logout is displaying successfully");	
		}
		else
		{
			logger.log(LogStatus.FAIL, "Logout is not displaying");	
		}
		
		newleadPage nlp=new newleadPage(driver);
		nlp.ClickonNewLead();
		logger.log(LogStatus.PASS, "Clicked on new lead");	
		nlp.createLead("Modi","BJP");
		logger.log(LogStatus.PASS, "New Lead created successfully");	
		report.endTest(logger);
		report.flush();
		
	}
	
	
	
	
	
	@AfterClass
	public void closeApp()
	{
		report.flush();
		driver.navigate().to(commonFunctions.reportpath);
		//driver.quit();
	}

}
