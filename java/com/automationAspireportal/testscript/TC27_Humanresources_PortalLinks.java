package com.automationAspireportal.testscript;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.automationAspireportal.helper.EmployeeloginHelper;
import com.automationAspireportal.helper.Validationhelper;
import com.automationAspireportal.testsuite.TestsuiteBase;
import com.automationAspireportal.utils.ReadTimesheetModuleLocators;

public class TC27_Humanresources_PortalLinks extends TestsuiteBase
{
	ReadTimesheetModuleLocators read=new ReadTimesheetModuleLocators();
	@Test
	public void humanresourcesportallinks() throws InterruptedException
	{
		EmployeeloginHelper helper=new EmployeeloginHelper(driver);
		helper.employeelogin();
		Validationhelper validationhelper=new Validationhelper(driver);
		driver.findElement(By.xpath("//span[contains(text(),'Human Resource')]")).click();
		validationhelper.validation("loc.hrportallinks.txt", "validate.hsportallinks.txt");
		System.out.println("successfully validated the human resources dashboard portal links header");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'HR Berry')]")).click();
		Thread.sleep(4000);
		String winHandleBefore = driver.getWindowHandle();
		// Perform the click operation that opens new window
//		validationhelper.validation("loc.hrportallinksHRBerry.txt", "validate.portallinkswelcometoHRBerry.txt");

		// Switch to new window opened
		for(String winHandle : driver.getWindowHandles()){
		    driver.switchTo().window(winHandle);
		}
		Thread.sleep(2000);
		validationhelper.validation("loc.hrportallinksHRBerry.txt", "validate.portallinkswelcometoHRBerry.txt");
		System.out.println("successfully validated the human resources HR Berry home page");


		// Perform the actions on new window

		// Close the new window, if that window no more required
		driver.close();

		// Switch back to original browser (first window)
		driver.switchTo().window(winHandleBefore);
		Thread.sleep(2000);
		driver.findElement(By.xpath(read.profile())).click();
		driver.findElement(By.xpath(read.clickonlogout())).click();
		Thread.sleep(2000);

		
		

		


	}
}
