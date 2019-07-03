package com.demo.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestProgram 
{

	
	
	@Test
	public void launchBrowser()
	{
	
		System.setProperty("webdriver.chrome.driver", "C:\\EclipseWorkspace\\dependencyFile\\chromedriver.exe");
		 
		// Initialize browser
		WebDriver driver=new ChromeDriver();
		 
		// Open facebook
		driver.get("https://www.google.co.in");
		System.out.println("Browser Open");
		 
		// Maximize browser
		 
		driver.manage().window().maximize();
		System.out.println("Browser Close");
		driver.quit();
		
	}
}
