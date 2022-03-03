package com.automationAspireportal.testscript;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import com.automationAspireportal.helper.EmployeePageHelper;
import com.automationAspireportal.helper.ManagerLogin;
import com.automationAspireportal.testsuite.TestsuiteBase;
import com.automationAspireportal.utils.ReadTimesheetModuleLocators;
public class TC05_Manager_Reject extends TestsuiteBase 
{
	ReadTimesheetModuleLocators read=new ReadTimesheetModuleLocators();
 @Test
	public void managerreject() throws InterruptedException 
 {
		EmployeePageHelper helper=new EmployeePageHelper(driver);
		helper.employeeHelper();

		ManagerLogin login = new ManagerLogin(driver);
		login.managerlogin();
		driver.findElement(By.xpath(read.clickoncheckbox())).click();
		driver.findElement(By.xpath(read.clickonreject())).click();
		driver.findElement(By.xpath(read.popupreject())).click();
		Thread.sleep(2000);
		WebElement clickontextareacomment=driver.findElement(By.xpath(read.clickontextarea()));
		clickontextareacomment.click();
		clickontextareacomment.sendKeys("do well");
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
