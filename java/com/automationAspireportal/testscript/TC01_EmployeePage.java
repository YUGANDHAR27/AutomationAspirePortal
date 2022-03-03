package com.automationAspireportal.testscript;

import org.testng.annotations.Test;

import com.automationAspireportal.helper.EmployeePageHelper;
import com.automationAspireportal.testsuite.TestsuiteBase;

public class TC01_EmployeePage extends TestsuiteBase {

	@Test
	public void employeeModule() throws InterruptedException {

		EmployeePageHelper page = new EmployeePageHelper(driver);
		page.employeeHelper();
		Thread.sleep(2000);
		
	}

}
