package com.ebanking.scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SampleNG 
{

	WebDriver driver;
	
	@BeforeMethod
	public void xyz() throws InterruptedException 
	{
		//Launch Firefox
		
		driver=new FirefoxDriver();
		//Maximise
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}
	@Test(priority=2)
	public void abc() 
	{
		//URL
		driver.get("http://103.211.39.246/ranford2/");
	}
	@Test(priority=1)
	public void bcd() throws InterruptedException 
	{
		Thread.sleep(3000);
	
		//URL
		driver.get("http://www.google.com");
	}
	@AfterMethod
	public void pqr() throws InterruptedException 
	{
		//Close Application
		Thread.sleep(3000);
		driver.close();
	}
}
