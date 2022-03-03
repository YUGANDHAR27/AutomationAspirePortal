package com.automationAspireportal.testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.automationAspireportal.helper.EmployeeloginHelper;
import com.automationAspireportal.helper.Validationhelper;
import com.automationAspireportal.testsuite.TestsuiteBase;
import com.automationAspireportal.utils.ReadTimesheetModuleLocators;

public class TC33_Reachyour_HR  extends TestsuiteBase
{
	ReadTimesheetModuleLocators read=new ReadTimesheetModuleLocators();
	@Test
	public void reachyourHR() throws InterruptedException
	{
		EmployeeloginHelper helper=new EmployeeloginHelper(driver);
		helper.employeelogin();
		Validationhelper validationhelper=new Validationhelper(driver);
		driver.findElement(By.xpath("//span[contains(text(),'Human Resource')]")).click();
		Thread.sleep(2000);
		validationhelper.validation("loc.hrreachyourHR.txt", "validate.hrreachyourHR.txt");
		System.out.println("successfully validated the human resources dashboard reach you HR header");
		WebElement hrSubject=driver.findElement(By.xpath("//input[@name=\"your_subject\"]"));
		hrSubject.click();
		hrSubject.sendKeys("Human Resources");
		WebElement hrMessage=driver.findElement(By.xpath("//textarea[@id='']"));
		hrMessage.click();
		hrMessage.sendKeys("I need aspireportal login credentials");
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		
	}

}
