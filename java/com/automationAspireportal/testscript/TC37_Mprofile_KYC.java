package com.automationAspireportal.testscript;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.automationAspireportal.helper.EmployeeloginHelper;
import com.automationAspireportal.helper.Validationhelper;
import com.automationAspireportal.testsuite.TestsuiteBase;
import com.automationAspireportal.utils.ReadTimesheetModuleLocators;

public class TC37_Mprofile_KYC extends TestsuiteBase
{
	ReadTimesheetModuleLocators read=new ReadTimesheetModuleLocators();
	@Test
	public void personalTab() throws InterruptedException
	{
		EmployeeloginHelper helper=new EmployeeloginHelper(driver);
		helper.employeelogin();
		Validationhelper validationhelper=new Validationhelper(driver);
		driver.findElement(By.xpath("//span[contains(text(),'My Profile')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'KYC')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"kyc\"]/form/div[5]/div[2]/input[2]")).click();
		Thread.sleep(2000);
		validationhelper.validation("loc.KYCalertmsg.txt","validate.KYCalertmsg.txt");
		Thread.sleep(2000);


	}
}
