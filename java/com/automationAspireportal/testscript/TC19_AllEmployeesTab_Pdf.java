package com.automationAspireportal.testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.automationAspireportal.helper.AdminLogin;
import com.automationAspireportal.helper.DateHelper;
import com.automationAspireportal.testsuite.TestsuiteBase;
import com.automationAspireportal.utils.ReadTimesheetModuleLocators;

public class TC19_AllEmployeesTab_Pdf  extends TestsuiteBase
{
	ReadTimesheetModuleLocators read = new ReadTimesheetModuleLocators();
	@Test
	public void allemployeesPdf() throws InterruptedException 
	{
		DateHelper helper=new DateHelper(driver);
		AdminLogin login = new AdminLogin(driver);
		login.adminlogin();
		Select admindrp = new Select(driver.findElement(By.xpath(read.changeloginasadmin())));
		admindrp.selectByVisibleText("Admin");
		driver.findElement(By.xpath(read.clickonreports())).click();
		driver.findElement(By.xpath(read.clickonallemployeestab())).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Select selectemployee = new Select(driver.findElement(By.xpath(read.allemployeesselectemployee())));
		selectemployee.deselectByVisibleText("All");
		selectemployee.selectByVisibleText("Employee Login");
		helper.selectdateforallemployeesstab();
		
		
		driver.findElement(By.xpath(read.allemployeesexport())).click();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.findElement(By.xpath(read.clickonpdf())).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(read.profile())).click();
		driver.findElement(By.xpath(read.clickonlogout())).click();
		Thread.sleep(2000);

	}



}
