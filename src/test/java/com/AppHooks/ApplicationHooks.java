package com.AppHooks;

import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.Factory.DriverFactory;
import com.Utilities.ConfigReader;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class ApplicationHooks {
	
	private WebDriver driver;
	private DriverFactory driverFactory;
	private ConfigReader configReader;
	private Properties prop;
	
	@Before(order = 0)
	public void getBrowser()
	{
		configReader = new ConfigReader();
		prop = configReader.readProp();
		
	}
	
	@Before(order = 1)
	public void LaunchBrowser()
	{
		String browserName = prop.getProperty("browser");
		driverFactory = new DriverFactory();
		driver = driverFactory.init_driver(browserName);
	}
	
	@After(order = 1)
	public void afterTest(Scenario scenario)
	{
		
		if(scenario.isFailed())
		{
			String scenarioName = scenario.getName().replaceAll(" ", "_");
			byte[] outputScreenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(outputScreenshot, "image/png", scenarioName);
		}	
		
	}
	
	@After(order = 0)
	public void quitBrowser()
	{
		driver.quit();
	}
	

}
