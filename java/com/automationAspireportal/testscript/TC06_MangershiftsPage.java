package com.automationAspireportal.testscript;



import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.automationAspireportal.helper.ManagerLogin;
import com.automationAspireportal.testsuite.TestsuiteBase;
import com.automationAspireportal.utils.ReadExcel;
import com.automationAspireportal.utils.ReadTimesheetModuleLocators;

public class TC06_MangershiftsPage extends TestsuiteBase {
	ReadTimesheetModuleLocators read=new ReadTimesheetModuleLocators();
	ReadExcel excel= new ReadExcel(3);

	@Test
	public void updatingshifts() throws InterruptedException 
	{
//		DateHelper helper=new DateHelper(driver);
		ManagerLogin login = new ManagerLogin(driver);
		login.managerlogin();
		driver.findElement(By.xpath(read.clickonshifts())).click();
		Select selectproject=new Select(driver.findElement(By.xpath(read.clickonselectprojecttb())));
		selectproject.selectByValue("56");;
		/*driver.findElement(By.xpath(read.updateshifts())).click();
		Thread.sleep(2000);
		Select selectemployee=new Select(driver.findElement(By.xpath(read.cickonselectemployee())));
		selectemployee.deselectByValue("0");
		selectemployee.selectByValue("1089");
		helper.selectdateforshifts();
		driver.findElement(By.xpath(read.selectshift())).click();
		Select selectshift=new Select(driver.findElement(By.xpath(read.clickonshift())));
		selectshift.selectByVisibleText("NS");*/
		Thread.sleep(2000);
		driver.findElement(By.xpath(read.profile())).click();
		driver.findElement(By.xpath(read.clickonlogout())).click();
		Thread.sleep(2000);


	}//input[@placeholder=" Start Date"]

}
