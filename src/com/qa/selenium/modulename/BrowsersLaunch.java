package com.qa.selenium.modulename;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowsersLaunch {

	public static void main(String[] args) {
		
//		System.setProperty("webdriver.chrome.driver", "D:\\LIb\\chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.facebook.com");
//		
//		System.setProperty("webdriver.chrome.driver", "D:\\LIb\\chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.facebook.com");
		
		System.setProperty("webdriver.chrome.driver", "D:\\LIb\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
//		System.setProperty("webdriver.chrome.driver", "D:\\LIb\\chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.facebook.com");
		

	}

}
