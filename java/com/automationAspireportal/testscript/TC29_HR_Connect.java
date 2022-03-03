package com.automationAspireportal.testscript;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.automationAspireportal.helper.EmployeeloginHelper;
import com.automationAspireportal.helper.Validationhelper;
import com.automationAspireportal.testsuite.TestsuiteBase;
import com.automationAspireportal.utils.ReadTimesheetModuleLocators;

public class TC29_HR_Connect extends TestsuiteBase
{
	ReadTimesheetModuleLocators read=new ReadTimesheetModuleLocators();
	@Test
	public void hrconnect() throws InterruptedException
	{
		EmployeeloginHelper helper=new EmployeeloginHelper(driver);
		helper.employeelogin();
		Validationhelper validationhelper=new Validationhelper(driver);
		driver.findElement(By.xpath("//span[contains(text(),'Human Resource')]")).click();
		Thread.sleep(2000);
		validationhelper.validation("loc.hrHRconnectHR1.txt","validate.hrHRconnectHr1.txt");
		System.out.println("successfully validated the HR Sumithra Raghavan name");
		Thread.sleep(2000);
		driver.findElement(By.xpath(read.profile())).click();
		driver.findElement(By.xpath(read.clickonlogout())).click();
		Thread.sleep(2000);



	}

}
