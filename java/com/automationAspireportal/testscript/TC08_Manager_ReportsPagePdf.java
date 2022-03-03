package com.automationAspireportal.testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.automationAspireportal.helper.DateHelper;
import com.automationAspireportal.helper.ManagerLogin;
import com.automationAspireportal.testsuite.TestsuiteBase;
import com.automationAspireportal.utils.ReadTimesheetModuleLocators;

public class TC08_Manager_ReportsPagePdf extends TestsuiteBase
{
	ReadTimesheetModuleLocators read = new ReadTimesheetModuleLocators();

	@Test
	public void managerReportspdf() throws InterruptedException
	{
		ManagerLogin login = new ManagerLogin(driver);
		login.managerlogin();
		DateHelper helper=new DateHelper(driver);
		driver.findElement(By.xpath(read.clickonreports())).click();
		Select selectclient = new Select(driver.findElement(By.xpath(read.clickonselectclient())));
		selectclient.selectByVisibleText("Hyper Loop");
		Select selectproject = new Select(driver.findElement(By.xpath(read.clickonselectproject())));
		selectproject.selectByValue("56");
		selectproject.deselectByValue("0");
		helper.selectdate();
		Select selectemployee = new Select(driver.findElement(By.xpath(read.clickonSelectemployeedrpdwn())));
		selectemployee.selectByValue("1089");
		selectemployee.deselectByValue("0");
		Select ActivityReports = new Select(driver.findElement(By.xpath(read.clickonselctactivity())));
		ActivityReports.selectByVisibleText("Without activity");
		Select SelectStatus = new Select(driver.findElement(By.xpath(read.clickonselectstatus())));
		SelectStatus.selectByValue("0");
		Select BillingType = new Select(driver.findElement(By.xpath(read.clickonbiling())));
		BillingType.selectByVisibleText("Yes");
		Select ExportAs = new Select(driver.findElement(By.xpath(read.clickonexportAs())));
		ExportAs.selectByVisibleText("Offshore");
		Select Reporttype = new Select(driver.findElement(By.xpath(read.clickonreportAs())));
		Reporttype.selectByVisibleText("Day wise");
		driver.findElement(By.xpath(read.clickonexport())).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(read.clickonpdf())).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(read.profile())).click();
		driver.findElement(By.xpath(read.clickonlogout())).click();
		Thread.sleep(2000);


	}
}
