package com.qa.selenium.modulename;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LinkTextEX {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "D:\\LIb\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		//driver.findElement(By.linkText("Create a Page")).click();
		//driver.findElement(By.partialLinkText("Create")).click();
		new Select(driver.findElement(By.id("day"))).selectByIndex(12);
		Thread.sleep(5000);
		//new Select(driver.findElement(By.id("month"))).selectByIndex(5);
		new Select(driver.findElement(By.id("month"))).selectByValue("3");
		new Select(driver.findElement(By.id("year"))).selectByVisibleText("2000");
		
		
	}

}
