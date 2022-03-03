package com.automationAspireportal.testscript;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.automationAspireportal.helper.AdminLogin;
import com.automationAspireportal.testsuite.TestsuiteBase;
import com.automationAspireportal.utils.ReadTimesheetModuleLocators;

public class TC15_Admin_ActivityReport extends TestsuiteBase
{
	ReadTimesheetModuleLocators read = new ReadTimesheetModuleLocators();
	@Test
	public void adminactivityreport() throws InterruptedException {
		AdminLogin login = new AdminLogin(driver);
		login.adminlogin();
		Thread.sleep(2000);
		driver.findElement(By.xpath(read.clickonreports())).click();
		driver.findElement(By.xpath(read.activityreport())).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(read.profile())).click();
		driver.findElement(By.xpath(read.clickonlogout())).click();
		Thread.sleep(2000);




	}
}
