package com.qa.selenium.modulename;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\LIb\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.id("email")).sendKeys("write the email id");
		driver.findElement(By.name("pass")).sendKeys("write the password");
		driver.findElement(By.id("u_0_b")).click();
		
		
		
		
		
		
		
		
	}

}
