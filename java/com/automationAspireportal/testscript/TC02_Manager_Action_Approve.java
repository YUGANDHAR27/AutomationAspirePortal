package com.automationAspireportal.testscript;


import static org.testng.Assert.assertEquals;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import com.automationAspireportal.helper.ManagerLogin;
import com.automationAspireportal.testsuite.TestsuiteBase;
import com.automationAspireportal.utils.ReadTimesheetModuleLocators;
public class TC02_Manager_Action_Approve extends TestsuiteBase
{
	ReadTimesheetModuleLocators read=new ReadTimesheetModuleLocators();
	@Test
	public void manageractionapprove() throws InterruptedException
	{
		ManagerLogin login = new ManagerLogin(driver);
		login.managerlogin();
		
		Thread.sleep(20000);
		driver.findElement(By.xpath(read.clickonApproveaction())).click();
		Thread.sleep(2000);
		String Actualres=driver.findElement(By.xpath("//*[@id=\"alert-message\"]")).getText();
		String Expectedres="Approved successfully";
		assertEquals(Actualres, Expectedres);
		Thread.sleep(2000);
		driver.findElement(By.xpath(read.profile())).click();
		driver.findElement(By.xpath(read.clickonlogout())).click();
		Thread.sleep(2000);

	}
}
//*[@id="alert-message"]