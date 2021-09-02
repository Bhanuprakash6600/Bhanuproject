package com.test.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.objectRepository.BaseClass;

public class Demo extends BaseClass {
	WebDriver driver;
	
	@Test
	public void test1() {
		System.out.println("test1method");
		
	}
	
	@Test
	public void test2() {
		System.out.println("test2method");
		
	}
	

}
