package com.automationAspireportal.testscript;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.automationAspireportal.helper.DateHelper;
import com.automationAspireportal.helper.EmployeeloginHelper;
import com.automationAspireportal.helper.Validationhelper;
import com.automationAspireportal.testsuite.TestsuiteBase;
import com.automationAspireportal.utils.ReadTimesheetModuleLocators;

public class TC40_Myprofile_Previous_Employment extends TestsuiteBase
{
	ReadTimesheetModuleLocators read=new ReadTimesheetModuleLocators();
	@Test
	public void previousEmployment() throws InterruptedException
	{
		String month="August 2020";
		String day="1";
		EmployeeloginHelper helper=new EmployeeloginHelper(driver);
		helper.employeelogin();
		Validationhelper validationhelper=new Validationhelper(driver);
		DateHelper helper1=new DateHelper(driver);
		driver.findElement(By.xpath("//span[contains(text(),'My Profile')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Previous Employment')]")).click();
		driver.findElement(By.xpath("//button[@class=\"btn btn-info pull-right\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"add_employment_form\"]/form/div[1]/div[1]/div/input")).sendKeys("ATMECS");
		driver.findElement(By.xpath("//*[@id=\"add_employment_form\"]/form/div[1]/div[2]/div/input")).sendKeys("Trainee - Software Engineer");
		driver.findElement(By.xpath("//*[@id=\"add_employment_form\"]/form/div[1]/div[3]/div/select")).sendKeys("Permanent");
		driver.findElement(By.xpath("//*[@id=\"add_employment_form\"]/form/div[1]/div[4]/div/input")).sendKeys("Software");
		driver.findElement(By.xpath("//*[@id=\"add_employment_form\"]/form/div[2]/div[1]/div/input")).click();
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
		helper1.myProfile();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"add_employment_form\"]/form/div[2]/div[3]/div/input")).sendKeys("other empoyeement opportunities");
		driver.findElement(By.xpath("//*[@id=\"add_employment_form\"]/form/div[3]/div[1]/div/input")).sendKeys("prem kumar");
		driver.findElement(By.xpath("//*[@id=\"add_employment_form\"]/form/div[3]/div[2]/div/input")).sendKeys("Associative software");
		driver.findElement(By.xpath("//*[@id=\"add_employment_form\"]/form/div[3]/div[3]/div/input")).sendKeys("9398597182");
		driver.findElement(By.xpath("//*[@id=\"add_employment_form\"]/form/div[4]/div/input[2]")).click();
		validationhelper.validation("loc.employeedataalertmsg.txt","validate.employementdata.txt");
		System.out.println("Employment Data Saved successfully");
		driver.findElement(By.xpath("	//*[@id=\"employment\"]/div[4]/div/div/div[1]/div/form/button[1]/i")).click();
		Alert alert = driver.switchTo().alert();		

		// Capturing alert message.    
		String alertMessage= driver.switchTo().alert().getText();		

		// Displaying alert message		
		System.out.println(alertMessage);	
		Thread.sleep(5000);

		// Accepting alert		
		alert.accept();	
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='referenceName1']")).sendKeys("Palyam Yugandhar");


	}
	//*[@id="employment"]/div[5]/div/div/div[1]/div/form/button[1]/i
	//*[@id="employment"]/div[6]/div/div/div[1]/div/form/button[1]/i
}
