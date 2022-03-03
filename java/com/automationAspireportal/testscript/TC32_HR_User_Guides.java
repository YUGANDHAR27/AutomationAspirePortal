package com.automationAspireportal.testscript;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.automationAspireportal.helper.EmployeeloginHelper;
import com.automationAspireportal.helper.Validationhelper;
import com.automationAspireportal.testsuite.TestsuiteBase;
import com.automationAspireportal.utils.ReadTimesheetModuleLocators;

public class TC32_HR_User_Guides  extends TestsuiteBase
{
	ReadTimesheetModuleLocators read=new ReadTimesheetModuleLocators();
	@Test
	public void humanresourcesuserguides() throws InterruptedException
	{
		EmployeeloginHelper helper=new EmployeeloginHelper(driver);
		helper.employeelogin();
		Validationhelper validationhelper=new Validationhelper(driver);
		driver.findElement(By.xpath("//span[contains(text(),'Human Resource')]")).click();
		Thread.sleep(2000);
		validationhelper.validation("loc.hruserguide.txt", "validate.hruserguides.txt");
		System.out.println("successfully validated the human resources dashboard HR user guide header");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'User Manual Exit Process')]")).click();
		Thread.sleep(2000);
		String winHandleBefore = driver.getWindowHandle();
		// Switch to new window opened
		for(String winHandle : driver.getWindowHandles()){
		    driver.switchTo().window(winHandle);
		    
		}
		Thread.sleep(2000);
		System.out.println("successfully landed on Exit Process user manual");
		// Perform the actions on new window

		driver.close();

		// Switch back to original browser (first window)
		driver.switchTo().window(winHandleBefore);
		Thread.sleep(2000);
		driver.findElement(By.xpath(read.profile())).click();
		driver.findElement(By.xpath(read.clickonlogout())).click();
		Thread.sleep(2000);


		
		
	}
	}
