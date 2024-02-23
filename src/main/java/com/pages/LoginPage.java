package com.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage
{
	//1. By Locators
	private WebDriver driver;
	private By username= By.name("username");
	private By Password= By.name("password");
	private By Login_button=By.xpath("//button[text()=' Login ']");
	private By Forgot_password_link=By.xpath("//div[@class='orangehrm-login-forgot11223344']");
	private By incorrect_creds_messageBy=By.xpath("//p[text()='Invalid credentials']");

	
	//2. Constructors
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//3. Page Actions
	public String getLoginPageTitle()
	{
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		return driver.getTitle();
	}
	
	public boolean isForgotPasswordLinkDisplayed()
	{
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		return driver.findElement(Forgot_password_link).isDisplayed();
	}
	
	public void enterUsername(String Username)
	{
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		driver.findElement(username).sendKeys(Username);
	}
	public void enterPassword(String password)
	{
		driver.findElement(Password).sendKeys(password);
	}
	public void ClickonLoginButton()
	{
		driver.findElement(Login_button).click();
	}
	public boolean isIncorrectMessageDisplayed()
	{
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		return driver.findElement(incorrect_creds_messageBy).isDisplayed();
	}
	
	
	
}
