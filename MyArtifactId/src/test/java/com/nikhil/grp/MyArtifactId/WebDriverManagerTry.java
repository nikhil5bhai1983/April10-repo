package com.nikhil.grp.MyArtifactId;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManagerTry {
	
	public WebDriver driver;
	
	@Test (priority =1)
	public void setupTest() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();		
	}
	
	@Test (priority =2)
	public void openGoogleTest() {
		driver.get("http://www.google.com/");
		String expectedPageTitle = "Google";
		Assert.assertTrue(driver.getTitle().contains(expectedPageTitle), "Title isnt matching");
	}
	
	@ Test (priority = 3)
	public void test3() {
		
	}

}
