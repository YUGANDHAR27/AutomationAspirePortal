package com.automationAspireportal.testscript;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.automationAspireportal.helper.EmployeeloginHelper;
import com.automationAspireportal.helper.Validationhelper;
import com.automationAspireportal.testsuite.TestsuiteBase;
import com.automationAspireportal.utils.ReadTimesheetModuleLocators;

public class TC36_Myprofile_Personal_Tab extends TestsuiteBase
{
	ReadTimesheetModuleLocators read=new ReadTimesheetModuleLocators();
	@Test
	public void personalTab() throws InterruptedException
	{
		EmployeeloginHelper helper=new EmployeeloginHelper(driver);
		helper.employeelogin();
		Validationhelper validationhelper=new Validationhelper(driver);
		driver.findElement(By.xpath("//span[contains(text(),'My Profile')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Personal')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name=\"twoWheeler\"]")).sendKeys("AP0327");
		driver.findElement(By.xpath("//input[@name=\"fourWheeler\"]")).sendKeys("AP0302");
		driver.findElement(By.xpath("//input[@class=\"btn btn-lg btn-rounded btn-info\"]")).click();
		Thread.sleep(2000);
		validationhelper.validation("loc.myprofilealertmsg.txt","validate.personaldataalert.txt");
		
	}
		

}
