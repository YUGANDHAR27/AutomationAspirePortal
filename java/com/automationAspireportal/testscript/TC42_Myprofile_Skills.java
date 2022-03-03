package com.automationAspireportal.testscript;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.automationAspireportal.helper.EmployeeloginHelper;
import com.automationAspireportal.helper.Validationhelper;
import com.automationAspireportal.testsuite.TestsuiteBase;
import com.automationAspireportal.utils.ReadTimesheetModuleLocators;

public class TC42_Myprofile_Skills extends TestsuiteBase
{
	ReadTimesheetModuleLocators read=new ReadTimesheetModuleLocators();
	@Test
	public void skills() throws InterruptedException, AWTException
	{
		EmployeeloginHelper helper=new EmployeeloginHelper(driver);
		helper.employeelogin();
		Validationhelper validationhelper=new Validationhelper(driver);
		driver.findElement(By.xpath("//span[contains(text(),'My Profile')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Skills')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Add Skill')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"add_skill_form\"]/form/div/div[1]/div/input")).sendKeys("Java");
		driver.findElement(By.xpath("//*[@id=\"add_skill_form\"]/form/div/div[2]/div/input")).sendKeys("16");
		driver.findElement(By.xpath("//*[@id=\"add_skill_form\"]/form/div/div[3]/div/select")).sendKeys("1");
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		driver.findElement(By.xpath("//*[@id=\"add_skill_form\"]/form/div/div[4]/div/select")).sendKeys("12");
		Robot robot1=new Robot();
		robot1.keyPress(KeyEvent.VK_ENTER);
		driver.findElement(By.xpath("//*[@id=\"add_skill_form\"]/form/div/div[5]/div/select")).sendKeys("4");
		Robot robot2=new Robot();
		robot2.keyPress(KeyEvent.VK_ENTER);
		driver.findElement(By.xpath("//*[@id=\"add_skill_form\"]/form/div/div[6]/input[3]")).click();
		Thread.sleep(2000);
		validationhelper.validation("loc.skillsdataalertmsg.txt","validate.skillsdatamsg.txt");
		System.out.println("Skills Data Saved successfully");
		driver.findElement(By.xpath("//*[@id=\"skill_data\"]/tbody/tr[1]/td[5]/form/button[1]/i")).click();
		Thread.sleep(2000);
		WebElement editSkills=driver.findElement(By.xpath("//*[@id=\"skillName\"]"));
		editSkills.clear();
		editSkills.sendKeys("Java");
		

		driver.findElement(By.xpath("//*[@id=\"edit_skill_form\"]/form/div/div[6]/input[4]")).click();
		Thread.sleep(2000);
		validationhelper.validation("loc.skillsdataupdatedalertmsg.txt","validate.skillsupdateddatamsg.txt");
		driver.findElement(By.xpath("//*[@id=\"skill_data\"]/tbody/tr[1]/td[5]/form/button[2]/i")).click();
        Alert alert = driver.switchTo().alert();		
		
        // Capturing alert message.    
        String alertMessage= driver.switchTo().alert().getText();		
        		
        // Displaying alert message		
        System.out.println(alertMessage);	
        Thread.sleep(5000);
        		
        // Accepting alert		
        alert.accept();	
        Thread.sleep(2000);

	}
}

