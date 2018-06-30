package com.vtiger.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.vtiger.common.commonFunctions;
import com.vtiger.pages.homePage;
import com.vtiger.pages.loginPage;
import com.vtiger.pages.newleadPage;

public class TestLogin extends BaseTest {
	
	
	
	
	@BeforeClass
	public void lauchApp()
	{
		luanchApp();
		createReport();
	}
	
	
	@Test(priority=2)
	public void invalidLogin()
	{
		logger=report.startTest("invalidLogin");
		logger.log(LogStatus.INFO, "Application luanched successfully");
		loginPage lp=new loginPage(driver);		
		int elmsize1=lp.invalidLogin();
		if(elmsize1==1)
		{
			logger.log(LogStatus.PASS, "Error message is displaying successfully");	
		}
		else
		{
			logger.log(LogStatus.FAIL, "Error message is not displaying");	
		}		
		report.endTest(logger);
		report.flush();
		
	}
	
	@Test(priority=3)
	public void validLogin()
	{
		logger=report.startTest("validLogin");
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
		report.endTest(logger);
		report.flush();
		
	}
	
	@Test(priority=1)
	public void LoginPageUIValidation()
	{
		logger=report.startTest("LoginPageUIValidation");
		logger.log(LogStatus.INFO, "Application luanched successfully");
		loginPage lp=new loginPage(driver);
		String act=lp.verifytitle();
		if(act.equals("123vtiger CRM - Commercial Open Source CRM"))
		{
			logger.log(LogStatus.PASS, "Actual title "+act+ " matched successfully with expected title vtiger CRM - Commercial Open Source CRM");	
		}
		else
		{
			logger.log(LogStatus.FAIL, "Actual title "+act+ " did not match with expected title vtiger CRM - Commercial Open Source CRM");	
		}
		
		
		int elmsize=lp.verifylogo();
		if(elmsize==1)
		{
			logger.log(LogStatus.PASS, "Logo is displaying successfully");	
		}
		else
		{
			logger.log(LogStatus.FAIL, "Logo not found");	
		}
		
		report.endTest(logger);
		report.flush();
		
	}
	
	
	
	
	@AfterClass
	public void closeApp()
	{
		report.flush();
		//driver.navigate().to(commonFunctions.reportpath);
		//driver.quit();
	}

}
