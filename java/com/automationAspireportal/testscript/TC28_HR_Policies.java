package com.automationAspireportal.testscript;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.automationAspireportal.helper.EmployeeloginHelper;
import com.automationAspireportal.helper.Validationhelper;
import com.automationAspireportal.testsuite.TestsuiteBase;
import com.automationAspireportal.utils.ReadTimesheetModuleLocators;

public class TC28_HR_Policies extends TestsuiteBase
{
	ReadTimesheetModuleLocators read=new ReadTimesheetModuleLocators();
	@Test
	public void hrpolicies() throws InterruptedException
	{
		EmployeeloginHelper helper=new EmployeeloginHelper(driver);
		helper.employeelogin();
		Validationhelper validationhelper=new Validationhelper(driver);
		driver.findElement(By.xpath("//span[contains(text(),'Human Resource')]")).click();
		validationhelper.validation("loc.humanresorcesHRpolicies.txt", "validate.hrHRpolicies.txt");
		System.out.println("successfully validated the human resources dashboard HR policies header");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Team Outing – Policy')]")).click();
		Thread.sleep(3000);
		String winHandleBefore = driver.getWindowHandle();
		// Switch to new window opened
		for(String winHandle : driver.getWindowHandles()){
		    driver.switchTo().window(winHandle);
		}
		Thread.sleep(2000);

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
