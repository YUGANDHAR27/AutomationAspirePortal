package com.automationAspireportal.testscript;


import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.automationAspireportal.helper.EmployeePageHelper;
import com.automationAspireportal.helper.ManagerLogin;
import com.automationAspireportal.testsuite.TestsuiteBase;
import com.automationAspireportal.utils.ReadTimesheetModuleLocators;

public class TC04_Manager_Action_Reject extends TestsuiteBase
{
	ReadTimesheetModuleLocators read=new ReadTimesheetModuleLocators();
	@Test
	public void manageractionreject() throws InterruptedException {

		EmployeePageHelper helper=new EmployeePageHelper(driver);
		helper.employeeHelper();
		ManagerLogin login = new ManagerLogin(driver);
		login.managerlogin();
		Thread.sleep(2000);
		driver.findElement(By.xpath(read.rejectaction())).click();
		Thread.sleep(5000);	
		WebElement textareacomment=driver.findElement(By.xpath(read.clickontextarea()));
		textareacomment.click();
		textareacomment.sendKeys("Do well");
		driver.findElement(By.xpath(read.popupreject())).click();
		Thread.sleep(2000);
		String Actualres1=driver.findElement(By.xpath("//div[@id='errormsg']")).getText();
		String Expectedres1="Timesheet rejected successfully";
		assertEquals(Actualres1, Expectedres1);
		Thread.sleep(2000);
		driver.findElement(By.xpath(read.profile())).click();
		driver.findElement(By.xpath(read.clickonlogout())).click();
		Thread.sleep(2000);


	}




}
