package com.test.Searchpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Searchhostel {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\\\dell\\Documents\\chromedriver.exe");
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("http://adactinhotelapp.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("omprakashreddy");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("prakash123");
		driver.findElement(By.xpath("//input[@id='login']")).click();
		try {
			Thread.sleep(5000);
		}catch(InterruptedException e) {
			e.printStackTrace();
			
		}
		WebElement Location=driver.findElement(By.xpath("//select[@name='location']"));
		Select loc=new Select (Location);
		loc.selectByVisibleText("Paris");		
		WebElement Hotel=driver.findElement(By.xpath("//select[@name='hotels']"));
		Select hos=new Select (Hotel);
		hos.selectByIndex(2);
		WebElement Rooms=driver.findElement(By.xpath("//select[@name='room_type']"));
		Select roo=new Select (Rooms);
		roo.selectByIndex(2);
		WebElement Roomsno=driver.findElement(By.xpath("//select[@name='room_nos']"));
		Select roono=new Select (Roomsno);
		roono.selectByIndex(2);
		WebElement Checkin=driver.findElement(By.xpath("//input[@name='datepick_in']"));
		Checkin.clear();
		Select cin=new Select (Checkin);
		cin.selectByVisibleText("29/08/2021");
		
		WebElement Adults=driver.findElement(By.xpath("//select[@name='adult_room']"));
		Select adul=new Select (Adults);
		adul.selectByIndex(2);
		WebElement children=driver.findElement(By.xpath("//select[@name='child_room']"));
		Select child=new Select (children);
		child.selectByIndex(2);
		WebElement search=driver.findElement(By.xpath("//input[@name='Submit']"));
		search.click();
		
	}	


}
