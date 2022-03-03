package com.automationAspireportal.testscript;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.automationAspireportal.helper.EmployeeloginHelper;
import com.automationAspireportal.helper.Validationhelper;
import com.automationAspireportal.testsuite.TestsuiteBase;
import com.automationAspireportal.utils.ReadTimesheetModuleLocators;

public class TC38_Myprofile_Passport_Visa extends TestsuiteBase
{
	ReadTimesheetModuleLocators read=new ReadTimesheetModuleLocators();
	@Test
	public void passportaAndVisa() throws InterruptedException
	{
		EmployeeloginHelper helper=new EmployeeloginHelper(driver);
		helper.employeelogin();
		Validationhelper validationhelper=new Validationhelper(driver);
		driver.findElement(By.xpath("//span[contains(text(),'My Profile')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Passport & Visa')]")).click();
//		Select passportVerify=new Select(driver.findElement(By.xpath("//select[@id='hasPassport']")));
//		passportVerify.deselectByVisibleText("Yes");
//		passportVerify.deselectByValue("No");
		driver.findElement(By.xpath("//select[@id='hasPassport']")).sendKeys("No");
		driver.findElement(By.xpath("//input[@class=\"btn btn-rounded btn-info\"]")).click();
		Thread.sleep(2000);
		validationhelper.validation("loc.passportandvisaalert.txt","validate.passportandvisa.txt");
		System.out.println("Passport Data Saved successfully");
		

	}

}
