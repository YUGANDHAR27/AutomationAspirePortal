package com.automationAspireportal.testscript;



import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.automationAspireportal.helper.AdminLogin;
import com.automationAspireportal.testsuite.TestsuiteBase;
import com.automationAspireportal.utils.ReadTimesheetModuleLocators;

public class TC21_Admin_Addactivity extends TestsuiteBase
{
	ReadTimesheetModuleLocators read= new ReadTimesheetModuleLocators();
	@Test
	public void adminaddactivity() throws InterruptedException 
	{
		AdminLogin login=new AdminLogin(driver);
		login.adminlogin();
		driver.findElement(By.xpath(read.adminaddactivity())).click();
		driver.findElement(By.xpath(read.adminaddactivitylabel())).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath(read.adminactvity())).sendKeys("Alerts Monitoring");
		Select Activiftyfor = new Select(driver.findElement(By.xpath(read.adminactivityproject())));
		Activiftyfor.selectByVisibleText("Single project");
		Select Selectclinet = new Select(driver.findElement(By.xpath(read.adminactivityclient())));
		Selectclinet.selectByVisibleText("Hyper Loop");
		Select Selectproject = new Select(driver.findElement(By.xpath(read.adminactivityselectproject())));
		Selectproject.selectByVisibleText("Hyper Loop");
		driver.findElement(By.xpath(read.adminactivitysave())).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(read.profile())).click();
		driver.findElement(By.xpath(read.clickonlogout())).click();
		Thread.sleep(2000);
//		try {
//			Thread.sleep(3000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/section/div/div[2]/a/i")).click();
//		Select Selectproject1 = new Select(driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div[1]/div[2]/div/div/div/div[1]/div/form/div[2]/select")));
//		Selectproject1.selectByValue("56");
//		driver.findElement(By.xpath("//*[@id=\"heading_0\"]/td[1]/span/i")).click();
//		Select 	Shiftdrp=new Select(driver.findElement(By.xpath("//*[@id=\"project_0\"]/td[2]/select")));
//		Shiftdrp.selectByVisibleText(ActivityExpect);
//		
	}
}