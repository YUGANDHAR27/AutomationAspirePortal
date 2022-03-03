package com.automationAspireportal.testscript;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.automationAspireportal.helper.EmployeeloginHelper;
import com.automationAspireportal.helper.Validationhelper;
import com.automationAspireportal.testsuite.TestsuiteBase;
import com.automationAspireportal.utils.ReadTimesheetModuleLocators;

public class TC41_Myprofile_Education  extends TestsuiteBase
{
	ReadTimesheetModuleLocators read=new ReadTimesheetModuleLocators();
	@Test
	public void education() throws InterruptedException
	{
		String month="June 2015";
		String day="20";
		String endMonth="June 2019";
		String endDay="20";
		EmployeeloginHelper helper=new EmployeeloginHelper(driver);
		helper.employeelogin();
		Validationhelper validationhelper=new Validationhelper(driver);
		driver.findElement(By.xpath("//span[contains(text(),'My Profile')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Education')]")).click();
		driver.findElement(By.xpath("//*[@id=\"education\"]/div[1]/div[2]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"add_education_form\"]/form/div[1]/div[1]/div/input")).sendKeys("B.Tech");
		driver.findElement(By.xpath("//*[@id=\"add_education_form\"]/form/div[1]/div[2]/div/input")).sendKeys("Mechanical Engineering");
		driver.findElement(By.xpath("//*[@id=\"add_education_form\"]/form/div[1]/div[3]/div/input")).sendKeys("MTIET");
		driver.findElement(By.xpath("//*[@id=\"add_education_form\"]/form/div[1]/div[4]/div/input")).sendKeys("JNTUH");
		driver.findElement(By.xpath("//*[@id=\"add_education_form\"]/form/div[2]/div[1]/div/input")).sendKeys("Full time");
		driver.findElement(By.xpath("//*[@id=\"add_education_form\"]/form/div[2]/div[2]/div/input")).click();
		Thread.sleep(2000);
		while (true)
		{
			String text=driver.findElement(By.xpath("/html/body/div[4]/div[1]/table/thead/tr[2]/th[2]")).getText();
			if (text.equals(month))
			{
				break;
			}
			else 
				
			{
				driver.findElement(By.xpath("/html/body/div[4]/div[1]/table/thead/tr[2]/th[1]")).click();
				
			}
			
		}
		driver.findElement(By.xpath("//body[1]/div[4]/div[1]/table[1]/tbody[1]/tr/td[contains(text(),"+day+")]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"add_education_form\"]/form/div[2]/div[3]/div/input")).click();
		while (true)
		{
			String text=driver.findElement(By.xpath("/html/body/div[4]/div[1]/table/thead/tr[2]/th[2]")).getText();
			if (text.equals(endMonth))
			{
				break;
			}
			else 
				
			{
				driver.findElement(By.xpath("/html/body/div[4]/div[1]/table/thead/tr[2]/th[1]")).click();
				
			}
			
		}
		driver.findElement(By.xpath("//body[1]/div[4]/div[1]/table[1]/tbody[1]/tr/td[contains(text(),"+endDay+")]")).click();
		driver.findElement(By.xpath("//*[@id=\"add_education_form\"]/form/div[2]/div[4]/div/input")).sendKeys("69%");
        driver.findElement(By.xpath("//*[@id=\"add_education_form\"]/form/div[2]/div[5]/div/input")).sendKeys("14177");
        driver.findElement(By.xpath("//*[@id=\"add_education_form\"]/form/div[3]/div/input[3]")).click();
        Thread.sleep(2000);
		validationhelper.validation("loc.educationdataalertmsg.txt","validate.educationdatamsg.txt");
		System.out.println("Education Data Saved successfully");



	}
}
