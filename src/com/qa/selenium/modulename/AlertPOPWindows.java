package com.qa.selenium.modulename;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPOPWindows {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\LIb\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com");
		
		Set<String> w= driver.getWindowHandles();
		
		int num=w.size();
		System.out.println("total number of window" + num);
		
		
		
		
		
		
		
		

	}

}
