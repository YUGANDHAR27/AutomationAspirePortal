package com.automationAspireportal.testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.automationAspireportal.helper.DateHelper;
import com.automationAspireportal.helper.ManagerLogin;
import com.automationAspireportal.testsuite.TestsuiteBase;
import com.automationAspireportal.utils.ReadTimesheetModuleLocators;

public class TC24_Manger_TimesheetSent extends TestsuiteBase
{
	ReadTimesheetModuleLocators read=new ReadTimesheetModuleLocators();

	@Test
	public void mangertimesheetsent() throws InterruptedException 
	{
		DateHelper heleper=new  DateHelper(driver);
		ManagerLogin login = new ManagerLogin(driver);
		login.managerlogin();
		driver.findElement(By.xpath(read.clickonreports())).click();
		driver.findElement(By.xpath(read.clickontimesheetsenttab())).click();
		Thread.sleep(3000);
		Select selectclient = new Select(driver.findElement(By.xpath(read.clickontimesheesenttclient())));
		//selectclient.deselectByValue("0");
		selectclient.selectByValue("10");
		Select selectproject = new Select(driver.findElement(By.xpath(read.clickontimeshetsentproject())));
		//new WebDriverWait(Driver, TimeSpan.FromSeconds(10)).Until(ExpectedConditions.ElementIsVisible("your selector"); 
		Thread.sleep(2000);
		selectproject.deselectByValue("0");
		selectproject.selectByValue("56");
		Thread.sleep(2000);
		heleper.timesheetsenttab();
		
//		WebElement startdate = driver.findElement(By.xpath(read.tsstartingdate()));
//		startdate.clear();
//		startdate.sendKeys("19/07/2021");
//		startdate.sendKeys(Keys.ENTER);
//		WebElement endate = driver.findElement(By.xpath(read.tsenddate()));
//		endate.clear();
//		endate.sendKeys("23/07/2021");
//		endate.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath(read.timesheetsentsearch())).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(read.profile())).click();
		driver.findElement(By.xpath(read.clickonlogout())).click();
		Thread.sleep(2000);





	}

}
