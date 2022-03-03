package com.automationAspireportal.testscript;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.automationAspireportal.helper.DateHelper;
import com.automationAspireportal.helper.EmployeeloginHelper;
import com.automationAspireportal.helper.Validationhelper;
import com.automationAspireportal.testsuite.TestsuiteBase;
import com.automationAspireportal.utils.ReadTimesheetModuleLocators;

public class TC43_Myprofile_Certifications extends TestsuiteBase
{
	ReadTimesheetModuleLocators read=new ReadTimesheetModuleLocators();
	@Test
	public void certifications() throws InterruptedException
	{
		EmployeeloginHelper helper=new EmployeeloginHelper(driver);
		helper.employeelogin();
		DateHelper helper1=new DateHelper(driver);
		Validationhelper validationhelper=new Validationhelper(driver);
		driver.findElement(By.xpath("//span[contains(text(),'My Profile')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Certifications')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Add Certificate')]")).click();
		driver.findElement(By.xpath("//*[@id=\"add_certificate_form\"]/form/div/div[1]/div/input")).sendKeys("Sdet");
		driver.findElement(By.xpath("//*[@id=\"add_certificate_form\"]/form/div/div[2]/div/input")).sendKeys("ATMECS");
		helper1.myProfileCertification();
		driver.findElement(By.xpath("//*[@id=\"add_certificate_form\"]/form/div/div[4]/div/input")).sendKeys("80");
		driver.findElement(By.xpath("//*[@id=\"add_certificate_form\"]/form/div/div[5]/input[3]")).click();
	}
}
