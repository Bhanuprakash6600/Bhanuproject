package com.test.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.objectRepository.Loginpageobject;

public class TestNdAnnotion {
	WebDriver driver;
	
@Test
	public void logout(){
		System.out.println("Logout");
		
	}

@Test(dependsOnMethods= {"openbrowser"})
public void login(){
	//System.out.println("Login");
	//WebDriverWait wait=new WebDriverWait(driver, 10);
	WebElement username_textbox=driver.findElement(By.xpath(Loginpageobject.username_txtbox));
	
	
	username_textbox.sendKeys("omprakashreddy");
	driver.findElement(By.xpath(Loginpageobject.password_textbox)).sendKeys("prakash123");
	driver.findElement(By.xpath(Loginpageobject.login_button)).click();
	
	
}
@Test
public void openbrowser(){
	//System.out.println("open browers");
	System.setProperty("webdriver.chrome.driver","C:\\Users\\\\dell\\Documents\\chromedriver.exe");
	// TODO Auto-generated method stub
	WebDriver driver=new ChromeDriver();
	driver.get("http://adactinhotelapp.com");
	driver.manage().window().maximize();
	
}

}
