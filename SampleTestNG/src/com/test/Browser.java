package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Browser {

	static String driverPath = "C:/Users/sreer/venkat-java/workspace/SampleTestNG/lib/";
	
	public static WebDriver driver;
	
	public static WebDriver getBrowser(String browserType) {
		switch (browserType) {
		case "firefox":
			return	driver = new FirefoxDriver();
		case "chrome":
			System.setProperty("webdriver.chrome.driver", driverPath+"chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("test-type");
		      options.addArguments("start-maximized");
		      options.addArguments("--js-flags=--expose-gc");  
		      options.addArguments("--enable-precise-memory-info"); 
		      options.addArguments("--disable-popup-blocking");
		      options.addArguments("--disable-default-apps");
		      options.addArguments("test-type=browser");
		      options.addArguments("disable-infobars");
			options.setBinary("C:/Users/sreer/AppData/Local/Google/Chrome/Application/chrome.exe");
		      System.out.println("Chrome driver path" +driverPath);
			return	driver = new ChromeDriver(options);
		case "IE":
			System.setProperty("webdriver.ie.driver", driverPath+"IEDriverServer.exe");
			return	driver = new InternetExplorerDriver();
		default:
			System.out.println("browser : " + browserType + " is invalid, Launching Firefox as browser of choice..");
			return driver = new FirefoxDriver();
		}
	}
}
