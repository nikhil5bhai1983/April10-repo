package com.nikhil.grp;

import java.sql.DriverManager;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;

public class NoDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromiumdriver().setup();
		WebDriverManager driver = new ChromeDriverManager();
		driver.targetPath("https://www.google.com/");

	}

}
