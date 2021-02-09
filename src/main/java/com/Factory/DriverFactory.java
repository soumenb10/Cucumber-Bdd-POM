package com.Factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	
	public WebDriver driver;
	
	public static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();
	
	/**
	 * This method is used to initialize the threadLocal driver with the given browser	
	 * @param browser
	 * @return
	 */
	
	public WebDriver init_driver(String browser)
	{
		if(browser.equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			tlDriver.set(new ChromeDriver());
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			tlDriver.set(new FirefoxDriver());
		}
		
		getDriver().manage().deleteAllCookies();
		getDriver().manage().window().maximize();	
		return getDriver();
	}
	
	/**
	 * This method is used to get the driver with Thread local
	 * @return
	 */
	
	public static synchronized WebDriver getDriver()
	{
		return tlDriver.get();
	}
	

}
