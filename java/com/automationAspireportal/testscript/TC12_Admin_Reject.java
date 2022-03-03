package com.automationAspireportal.testscript;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.automationAspireportal.helper.AdminLogin;
import com.automationAspireportal.testsuite.TestsuiteBase;
import com.automationAspireportal.utils.ReadTimesheetModuleLocators;

public class TC12_Admin_Reject extends TestsuiteBase {
	ReadTimesheetModuleLocators read = new ReadTimesheetModuleLocators();
	@Test
	public void adminreject() throws InterruptedException {
		AdminLogin login = new AdminLogin(driver);
		login.adminlogin();
		Thread.sleep(2000);
		Select select = new Select(driver.findElement(
				By.xpath(read.admintimesheetSelectproject())));
		select.selectByValue("56");
		driver.findElement(By.xpath(read.clickoncheckbox())).click();
		driver.findElement(By.xpath(read.clickonreject())).click();
		Thread.sleep(2000);
		WebElement textareacomment=driver.findElement(By.xpath(read.clickontextarea()));
		textareacomment.click();
		textareacomment.sendKeys("Do well");
		driver.findElement(By.xpath(read.popupreject())).click();
		Thread.sleep(2000);
		String Actualres1=driver.findElement(By.xpath("//div[@id='errormsg']")).getText();
		String Expectedres1="Timesheet rejected successfully";
		assertEquals(Actualres1, Expectedres1);
		Thread.sleep(5000);
		driver.findElement(By.xpath(read.profile())).click();
		driver.findElement(By.xpath(read.clickonlogout())).click();
		Thread.sleep(2000);



	}

}
