package com.automationAspireportal.testscript;



import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.automationAspireportal.helper.EmployeeloginHelper;
import com.automationAspireportal.helper.Validationhelper;
import com.automationAspireportal.testsuite.TestsuiteBase;
import com.automationAspireportal.utils.ReadTimesheetModuleLocators;

public class TC25_Dashboard extends TestsuiteBase
{
	ReadTimesheetModuleLocators read=new ReadTimesheetModuleLocators();
	@Test
	public void dashboard() throws InterruptedException
	{
		EmployeeloginHelper helper=new EmployeeloginHelper(driver);
		helper.employeelogin();
		Validationhelper validationhelper=new Validationhelper(driver);
		driver.findElement(By.xpath("//span[contains(text(),'Dashboard')]")).click();
		Thread.sleep(5000);
		//		validationhelper.validation("loc.dbawareness.txt", "validate.dbawareness.txt");
		//        System.out.println("awareness");
		//		Thread.sleep(2000);
		validationhelper.validation("loc.dbjobopenings.txt", "validate.dbjobopenigs.txt");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Senior Software Engineer')]")).click();
		Thread.sleep(2000);
		validationhelper.validation("loc.seniorsoftwareengeneer.txt", "validate.senior.soft.txt");
		System.out.println("successfully validated the jobopenings content");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body/div[@id='main-wrapper']/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/div[1]/div[2]/ul[1]/div[1]/div[1]/div[1]/div[1]/button[1]/span[1]")).click();
		Thread.sleep(2000);
		validationhelper.validation("loc.dbeventgallery.txt", "validate.dbeventgallery.txt");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Innovate Hackathon 2019-Hyderabad')]")).click();
		Thread.sleep(4000);
		validationhelper.validation("loc.showevent.txt", "validate.showevent.txt");
		System.out.println("successfully validated the gallery event content");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Dashboard')]")).click();
		Thread.sleep(2000);
		validationhelper.validation("loc.forumtopics.txt", "validate.dbforumtopics.txt");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'What-is-all-pairs-testing-all-pairs-also-known-as-')]")).click();
		Thread.sleep(3000);
		validationhelper.validation("loc.forumlatestposts.txt", "validate.forumlatestposts.txt");
		System.out.println("successfully validated the forumtopics content");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class=\"logo-text\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(read.profile())).click();
		driver.findElement(By.xpath(read.clickonlogout())).click();
		Thread.sleep(2000);



	}
}
