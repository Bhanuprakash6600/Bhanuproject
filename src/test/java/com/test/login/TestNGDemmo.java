package com.test.login;

import org.openqa.selenium.chrome.ChromeDriver;

import com.objectRepository.BaseClass;

public class TestNGDemmo extends BaseClass{
	public void beforeMethod() {
		//System.out.println("Before Method");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\\\dell\\Documents\\chromedriver.exe");
		// TODO Auto-generated method stub
	  driver=new ChromeDriver();
		driver.get("http://adactinhotelapp.com");
		driver.manage().window().maximize();
		
		
	}


}
