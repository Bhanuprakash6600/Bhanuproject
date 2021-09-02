package com.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	public WebDriver driver;
	
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\\\dell\\Documents\\chromedriver.exe");
		// TODO Auto-generated method stub
	  driver=new ChromeDriver();
		driver.get("http://adactinhotelapp.com");
		driver.manage().window().maximize();
		
		
	}

	
	@AfterMethod
	public void AfterMethod() {
		System.out.println("After Method");
		driver.close();
		
	}
	
	@BeforeClass
	public void BeforeClass() {
		System.out.println("Beforeclass");
		
	}
	
	@AfterClass
	public void Afterclass() {
		System.out.println("Afterclass");
	}
}


