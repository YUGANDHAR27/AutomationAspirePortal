package com.automationAspireportal.testscript;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.automationAspireportal.helper.EmployeeloginHelper;
import com.automationAspireportal.helper.Validationhelper;
import com.automationAspireportal.testsuite.TestsuiteBase;
import com.automationAspireportal.utils.ReadTimesheetModuleLocators;

public class TC35_My_Profile extends TestsuiteBase 
{
	ReadTimesheetModuleLocators read=new ReadTimesheetModuleLocators();
	@Test
	public void profile() throws InterruptedException
	{
		EmployeeloginHelper helper=new EmployeeloginHelper(driver);
		helper.employeelogin();
		Validationhelper validationhelper=new Validationhelper(driver);
		driver.findElement(By.xpath("//span[contains(text(),'My Profile')]")).click();
		validationhelper.validation("loc.myprofiledesignation.txt","validate.myprofiledesignation.txt");
		WebElement add=driver.findElement(By.xpath("//i[@class=\"fas fa-edit\"]"));
		add.click();
		Thread.sleep(3000);
		WebElement about=driver.findElement(By.xpath("//div[@class=\"note-editable panel-body\"]"));
		about.clear();
		about.sendKeys("This is Palyam Yugandhar ");
		driver.findElement(By.xpath("//input[@class=\"btn btn-info m-t-20\"]")).click();
		Thread.sleep(5000);
		validationhelper.validation("loc.aboutmealertmsg.txt","validate.aboutme.txt");

		


	}
}
