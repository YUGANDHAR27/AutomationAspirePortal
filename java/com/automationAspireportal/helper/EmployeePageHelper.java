package com.automationAspireportal.helper;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.automationAspireportal.utils.ReadExcel;
import com.automationAspireportal.utils.ReadTimesheetModuleLocators;

public class EmployeePageHelper 
{
	WebDriver driver;
	ReadTimesheetModuleLocators read=new ReadTimesheetModuleLocators();
	ReadExcel excel= new ReadExcel(0);
	public EmployeePageHelper(WebDriver driver)
	{
		this.driver = driver;
	}

	public void employeeHelper() throws InterruptedException 
	{

		EmployeeloginHelper helper=new EmployeeloginHelper(driver);
		helper.employeelogin();
		Validationhelper validationhelper=new Validationhelper(driver);
		WebElement clickonts = driver.findElement(By.xpath(read.clickonTimesheet()));
		clickonts.click();
		Select employeeactivity=new Select(driver.findElement(By.xpath(read.slectActivity())));
		employeeactivity.selectByVisibleText("Training");;
		//	driver.findElement(By.xpath(read.activity())).click();
		driver.findElement(By.xpath(read.clickonMonday())).sendKeys(excel.Workinghour());
		driver.findElement(By.xpath(read.clickonTuesday())).sendKeys(excel.Workinghour());
		driver.findElement(By.xpath(read.clickonwednesday())).sendKeys(excel.Workinghour());
		driver.findElement(By.xpath(read.clickonThursday())).sendKeys(excel.Workinghour());
		driver.findElement(By.xpath(read.clickonFriday())).sendKeys(excel.Workinghour());
		//		driver.findElement(By.xpath(read.clickonNotes())).click();
		//		WebElement enternote=driver.findElement(By.xpath(read.giveNotes()));
		//		enternote.click();
		//		enternote.clear();
		//		enternote.sendKeys("Thank you Sir");
		//		Thread.sleep(2000);
		//		driver.findElement(By.xpath(read.clickcheck())).click();
		//		Thread.sleep(2000);
		driver.findElement(By.xpath(read.clickonAddactivity())).click();
		driver.findElement(By.xpath(read.deleteactivity())).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath(read.saveTimesheet())).click();	
//		Thread.sleep(2000);
//		validationhelper.validation("loc.timesheetalertmsg.txt", "validate.timesheetsave.txt");
		//		String Actualres=driver.findElement(By.xpath(read.timesheetsavealert())).getText();
		//		String Expectedres="Timesheet saved successfully";
		//		assertEquals(Actualres, Expectedres);

		Thread.sleep(3000);
		driver.findElement(By.xpath(read.submit())).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'×')]")).click();
		Thread.sleep(2000);
		validationhelper.validation("loc.timesheetalertmsg.txt", "validate.timesheetsubmit.txt");
		Thread.sleep(5000);
		driver.findElement(By.xpath(read.profile())).click();
		driver.findElement(By.xpath(read.clickonlogout())).click();
		Thread.sleep(2000);

	}

}
