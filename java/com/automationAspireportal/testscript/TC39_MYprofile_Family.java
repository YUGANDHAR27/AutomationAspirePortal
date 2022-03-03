package com.automationAspireportal.testscript;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.automationAspireportal.helper.EmployeeloginHelper;
import com.automationAspireportal.helper.Validationhelper;
import com.automationAspireportal.testsuite.TestsuiteBase;
import com.automationAspireportal.utils.ReadTimesheetModuleLocators;

public class TC39_MYprofile_Family  extends TestsuiteBase
{
	ReadTimesheetModuleLocators read=new ReadTimesheetModuleLocators();
	@Test
	public void profileFamily() throws InterruptedException
	{
		EmployeeloginHelper helper=new EmployeeloginHelper(driver);
		helper.employeelogin();
		Validationhelper validationhelper=new Validationhelper(driver);
		driver.findElement(By.xpath("//span[contains(text(),'My Profile')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Family')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body/div[@id='main-wrapper']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/form[1]/div[3]/div[2]/input[3]")).click();
		Thread.sleep(2000);
		validationhelper.validation("loc.familyalertmsg.txt","validate.family.txt");
		System.out.println("Family Data Updated successfully");

	}
}
