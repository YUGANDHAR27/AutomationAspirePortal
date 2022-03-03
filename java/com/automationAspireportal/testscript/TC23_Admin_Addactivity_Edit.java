package com.automationAspireportal.testscript;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import com.automationAspireportal.helper.AdminLogin;
import com.automationAspireportal.testsuite.TestsuiteBase;
import com.automationAspireportal.utils.ReadTimesheetModuleLocators;
public class TC23_Admin_Addactivity_Edit extends TestsuiteBase
{
	ReadTimesheetModuleLocators read= new ReadTimesheetModuleLocators();
	@Test
	public void editactivity() throws InterruptedException 
	{
		AdminLogin login=new AdminLogin(driver);
		login.adminlogin();
		driver.findElement(By.xpath(read.adminaddactivity())).click();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath(read.admineditactivity())).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		WebElement editactivity=driver.findElement(By.xpath(read.adminactvity()));
		editactivity.clear();
			editactivity.sendKeys("Alerts Monitoring");
//		Select Activiftyfor = new Select(driver.findElement(By.xpath("//*[@id=\"projectType\"]")));
//	    Activiftyfor.selectByVisibleText("Single project");
//	    Select Selectclinet = new Select(driver.findElement(By.xpath("//*[@id=\"selectClient\"]")));
//		Selectclinet.selectByVisibleText("Hyper Loop");
//        Select Selectproject = new Select(driver.findElement(By.xpath("//*[@id=\"selectProject\"]")));
//		Selectproject.selectByVisibleText("Hyper Loop");
		driver.findElement(By.xpath(read.adminactivitysave())).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(read.profile())).click();
		driver.findElement(By.xpath(read.clickonlogout())).click();
		Thread.sleep(2000);
	}
}
