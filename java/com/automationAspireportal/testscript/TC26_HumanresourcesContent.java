package com.automationAspireportal.testscript;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.automationAspireportal.helper.EmployeeloginHelper;
import com.automationAspireportal.helper.Validationhelper;
import com.automationAspireportal.testsuite.TestsuiteBase;
import com.automationAspireportal.utils.ReadTimesheetModuleLocators;

public class TC26_HumanresourcesContent extends TestsuiteBase
 {
	ReadTimesheetModuleLocators read=new ReadTimesheetModuleLocators();
	@Test
	public void humanresourcescontent() throws InterruptedException
	{
		EmployeeloginHelper helper=new EmployeeloginHelper(driver);
		helper.employeelogin();
		Validationhelper validationhelper=new Validationhelper(driver);
		driver.findElement(By.xpath("//span[contains(text(),'Human Resource')]")).click();
		Thread.sleep(2000);
		validationhelper.validation("loc.humanresourcesdashboard.txt", "validate.humanresourcesdashboard.txt");
		System.out.println("successfully validated the human resources dashboard header");
		Thread.sleep(2000);
		validationhelper.validation("loc.hrportallinks.txt", "validate.hsportallinks.txt");
		System.out.println("successfully validated the human resources dashboard portal links header");
		Thread.sleep(2000);
		validationhelper.validation("loc.humanresorcesHRpolicies.txt", "validate.hrHRpolicies.txt");
		System.out.println("successfully validated the human resources dashboard HR policies header");
		Thread.sleep(2000);
		validationhelper.validation("loc.humanresourcesHRconnect.txt", "validate.hrHRconnect.txt");
		System.out.println("successfully validated the human resources dashboard HR connect header");
		Thread.sleep(2000);
		validationhelper.validation("loc.hrsecuritypolicy.txt", "validate.hrsecuritypolicy.txt");
		System.out.println("successfully validated the human resources dashboard HR security policy header");
		Thread.sleep(2000);
		validationhelper.validation("loc.hrholidaycalendar.txt", "validate.hrholidaycalendar.txt");
		System.out.println("successfully validated the human resources dashboard HR holiday calendar header");
		Thread.sleep(2000);
		validationhelper.validation("loc.hruserguide.txt", "validate.hruserguides.txt");
		System.out.println("successfully validated the human resources dashboard HR user guide header");
		Thread.sleep(2000);
		validationhelper.validation("loc.hrreachyourHR.txt", "validate.hrreachyourHR.txt");
		System.out.println("successfully validated the human resources dashboard reach you HR header");
		Thread.sleep(2000);
		validationhelper.validation("loc.hrconnectHR.txt", "validate.hrconnectHR.txt");
		System.out.println("successfully validated the human resources dashboard Whom to connect in Core Team header");
		Thread.sleep(2000);
		driver.findElement(By.xpath(read.profile())).click();
		driver.findElement(By.xpath(read.clickonlogout())).click();
		Thread.sleep(2000);
		




		


	}

}
