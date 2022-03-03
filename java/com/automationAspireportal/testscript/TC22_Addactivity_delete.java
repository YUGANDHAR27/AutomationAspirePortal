package com.automationAspireportal.testscript;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import com.automationAspireportal.helper.AdminLogin;
import com.automationAspireportal.testsuite.TestsuiteBase;
import com.automationAspireportal.utils.ReadTimesheetModuleLocators;
public class TC22_Addactivity_delete extends TestsuiteBase
{
	ReadTimesheetModuleLocators read= new ReadTimesheetModuleLocators();
	@Test
	public void deleteactivity() throws InterruptedException 
	{
		AdminLogin login=new AdminLogin(driver);
		login.adminlogin();
		driver.findElement(By.xpath(read.adminaddactivity())).click();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath(read.admindeleteactivity())).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath(read.adminremoveactivity())).click();

		Thread.sleep(5000);
		driver.findElement(By.xpath(read.profile())).click();
		driver.findElement(By.xpath(read.clickonlogout())).click();
		Thread.sleep(2000);
		//		
		//	    driver.findElement(By.xpath("//*[@id=\"delete_61\"]/i")).click();
		//	   
	}

}
