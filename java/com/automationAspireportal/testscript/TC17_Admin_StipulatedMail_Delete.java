package com.automationAspireportal.testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.automationAspireportal.helper.AdminLogin;
import com.automationAspireportal.helper.DateHelper;
import com.automationAspireportal.testsuite.TestsuiteBase;
import com.automationAspireportal.utils.ReadTimesheetModuleLocators;

public class TC17_Admin_StipulatedMail_Delete extends TestsuiteBase {
	ReadTimesheetModuleLocators read = new ReadTimesheetModuleLocators();
	@Test
	public void stipulatedmailateddelete() throws InterruptedException
	{
		DateHelper helper=new DateHelper(driver);
		AdminLogin adminlogin = new AdminLogin(driver);
		adminlogin.adminlogin();
		driver.findElement(By.xpath(read.clickonreports())).click();
		driver.findElement(By.xpath(read.clickontimesheetsenttab())).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Select selectclient = new Select(driver.findElement(By.xpath(read.clickontimesheesenttclient())));
		//selectclient.deselectByValue("0");
		selectclient.selectByValue("10");


		Select selectproject = new Select(driver.findElement(By.xpath(read.clickontimeshetsentproject())));
		//new WebDriverWait(Driver, TimeSpan.FromSeconds(10)).Until(ExpectedConditions.ElementIsVisible("your selector"); 
		Thread.sleep(2000);
		selectproject.deselectByValue("0");
		selectproject.selectByValue("56");
		Thread.sleep(2000);
         helper.timesheetsenttab();
//		WebElement startdate = driver.findElement(By.xpath(read.tsstartingdate()));
//		startdate.clear();
//		startdate.sendKeys("19/07/2021");
//		startdate.sendKeys(Keys.ENTER);
//		WebElement endate = driver.findElement(By.xpath(read.tsenddate()));
//		endate.clear();
//		endate.sendKeys("23/07/2021");
//		endate.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath(read.timesheetsentsearch())).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(read.timesheetsentactiondelete())).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(read.timesheetsentconfirmationpopup())).click();
		/*String nodata = "No data available in table";
		if (nodata != driver.findElement(By.xpath("//*[@id=\"exportTable\"]/tbody/tr/td")).getText()) {
			driver.findElement(By.xpath("//*[@id=\"Selectall\"]")).click();
			driver.findElement(By.xpath("//*[@id=\"Cancel_delete\"]")).click();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			driver.findElement(By.xpath(read.clickontimesheetsentdelete())).click();*/
		Thread.sleep(3000);
		driver.findElement(By.xpath(read.profile())).click();
		driver.findElement(By.xpath(read.clickonlogout())).click();
		Thread.sleep(2000);

		}

	}

