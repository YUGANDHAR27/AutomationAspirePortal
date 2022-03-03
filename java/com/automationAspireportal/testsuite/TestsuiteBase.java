package com.automationAspireportal.testsuite;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.automationAspireportal.constants.FilePathConstants;
import com.automationAspireportal.utils.ReadLocators;

public class TestsuiteBase

{
	public WebDriver driver;
	ReadLocators read = new ReadLocators();

	@BeforeClass
	public void launchAspire() {
		System.setProperty("webdriver.chrome.driver", FilePathConstants.CHROME_FILE);
		driver = new ChromeDriver();
		String path = read.Url();
		driver.get(path);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@AfterClass
	public void teardown() {
		driver.close();
	}


}
