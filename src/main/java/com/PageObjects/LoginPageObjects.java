package com.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageObjects {
	
	private WebDriver driver;
	
	//By locators
	private By userID = By.name("uid");
	private By password = By.name("password");
	private By login = By.name("btnLogin");
	
	//Constructor for context injection
	public LoginPageObjects(WebDriver driver)
	{
		this.driver = driver;
	}
	
	//Page Action methods
	public String pageTitle()
	{
		return driver.getTitle();
	}
	public void enterUserID(String username)
	{
		driver.findElement(userID).sendKeys(username);
	}
	
	public void enterPassword(String passcode)
	{
		driver.findElement(password).sendKeys(passcode);
	}
	
	public void clickLogin(String button)
	{
		driver.findElement(login).click();
	}
	
	

}
