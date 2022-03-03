package com.automationAspireportal.testscript;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.automationAspireportal.helper.EmployeeloginHelper;
import com.automationAspireportal.helper.Validationhelper;
import com.automationAspireportal.testsuite.TestsuiteBase;
import com.automationAspireportal.utils.ReadTimesheetModuleLocators;

public class TC31_HR_Holidaycalendar extends TestsuiteBase
{
	ReadTimesheetModuleLocators read=new ReadTimesheetModuleLocators();
	@Test
	public void hrsecuritypolicy() throws InterruptedException
	{
		EmployeeloginHelper helper=new EmployeeloginHelper(driver);
		helper.employeelogin();
		Validationhelper validationhelper=new Validationhelper(driver);
		driver.findElement(By.xpath("//span[contains(text(),'Human Resource')]")).click();
		Thread.sleep(2000);
		validationhelper.validation("loc.hrholidaycalendar.txt", "validate.hrholidaycalendar.txt");
		System.out.println("successfully validated the human resources dashboard HR holiday calendar header");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Bangalore Holiday Calendar 2020')]")).click();
		Thread.sleep(3000);
		String winHandleBefore = driver.getWindowHandle();
		// Switch to new window opened
		for(String winHandle : driver.getWindowHandles()){
		    driver.switchTo().window(winHandle);
		}
		Thread.sleep(4000);
		System.out.println("successfully landed on Bangalore Holiday Calendar 2020 page");
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
