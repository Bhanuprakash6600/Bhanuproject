package com.test.login;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.objectRepository.Loginpageobject;

@Test
public class Loginuser {
	public void Login() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\\\dell\\Documents\\chromedriver.exe");
	// TODO Auto-generated method stub
	WebDriver driver=new ChromeDriver();
	driver.get("http://adactinhotelapp.com");
	driver.manage().window().maximize();
	WebDriverWait wait=new WebDriverWait(driver, 10);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Loginpageobject.username_txtbox)));
	
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Loginpageobject.username_txtbox))).sendKeys("omprakashreddy");
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Loginpageobject.password_textbox))).sendKeys("prakash123");
	driver.findElement(By.xpath(Loginpageobject.login_button)).click();
	
	
}	
}