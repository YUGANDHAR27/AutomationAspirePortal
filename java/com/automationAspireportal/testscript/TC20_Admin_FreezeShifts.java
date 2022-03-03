package com.automationAspireportal.testscript;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.automationAspireportal.helper.AdminLogin;
import com.automationAspireportal.testsuite.TestsuiteBase;
import com.automationAspireportal.utils.ReadTimesheetModuleLocators;

public class TC20_Admin_FreezeShifts extends TestsuiteBase
{
	ReadTimesheetModuleLocators read= new ReadTimesheetModuleLocators();
	@Test
	public void freezeshifts() throws InterruptedException 
	{
		AdminLogin login=new AdminLogin(driver);
		login.adminlogin();
		 driver.findElement(By.xpath(read.clickonshifts())).click();	
		 driver.findElement(By.xpath(read.clickonfreezeshifts())).click();
		driver.findElement(By.xpath(read.clickonfreezedate())).click();
		driver.findElement(By.xpath(read.freezemonth())).click();
		driver.findElement(By.xpath(read.clickonfreeze())).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String Actualres=driver.findElement(By.xpath(read.confirmationmsg())).getText();
		String Expectedres="Are you sure want to freeze?";
		assertEquals(Actualres, Expectedres);
		Thread.sleep(2000);
		driver.findElement(By.xpath(read.clickonclosepopup())).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(read.profile())).click();
		driver.findElement(By.xpath(read.clickonlogout())).click();
		Thread.sleep(2000);
		
		 }
}
