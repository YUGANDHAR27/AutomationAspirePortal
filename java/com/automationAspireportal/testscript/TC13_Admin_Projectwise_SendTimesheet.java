package com.automationAspireportal.testscript;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.automationAspireportal.helper.AdminLogin;
import com.automationAspireportal.testsuite.TestsuiteBase;
import com.automationAspireportal.utils.ReadTimesheetModuleLocators;

public class TC13_Admin_Projectwise_SendTimesheet extends TestsuiteBase {

	ReadTimesheetModuleLocators read=new ReadTimesheetModuleLocators();
	@Test
	public void mail() throws InterruptedException 
	{
		
		AdminLogin adminlogin = new AdminLogin(driver);
		adminlogin.adminlogin();
		driver.findElement(By.xpath(read.clickonreports())).click();
		Select selectclient = new Select(driver.findElement(By.xpath(read.clickonselectclient())));
		selectclient.selectByVisibleText("Hyper Loop");
		Select selectproject = new Select(driver.findElement(By.xpath(read.clickonselectproject())));
		selectproject.selectByValue("56");
		selectproject.deselectByValue("0");
		WebElement startdate = driver.findElement(By.xpath(read.clickonstartdate()));
		startdate.sendKeys("26/07/2021");
		startdate.sendKeys(Keys.ENTER);
		WebElement endate = driver.findElement(By.xpath(read.clickonenddate()));
		endate.sendKeys("30/07/2021");
		endate.sendKeys(Keys.ENTER);
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
		Thread.sleep(3000);
		driver.findElement(By.xpath(read.clickonsendtimesheet())).click();

		Thread.sleep(5000);

		driver.findElement(By.xpath(read.clickonreportinggmail())).sendKeys("suraj.konangi@atmecs.com");
		driver.findElement(By.xpath(read.clickonsendgmailbtn())).click();
		String Actualres=driver.findElement(By.xpath(read.catchpopuptext())).getText();
		String Expectedres="Something went wrong";
		assertEquals(Actualres, Expectedres);
		driver.findElement(By.xpath(read.clickonclosepopup())).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(read.profile())).click();
		driver.findElement(By.xpath(read.clickonlogout())).click();
		Thread.sleep(2000);

	}
}
