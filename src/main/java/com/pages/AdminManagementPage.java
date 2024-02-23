package com.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AdminManagementPage 
{
	private WebDriver driver;
	private By Admin_tab=By.xpath("//span[text()='Admin']");
	private By user_mgmt=By.xpath("//nav[@role='navigation']/child::ul/child::li/child::span[text()='User Management ']");
	private By User_link =By.xpath("//a[text()='Users']");
	private By Add_user_button = By.xpath("//button[text()=' Add ']");
	private By User_type=By.xpath("(//div[@class='oxd-select-text-input'])[1]");
	private By User_status= By.xpath("(//div[@class='oxd-select-text-input'])[2]");
	private By Name=By.cssSelector("input[placeholder='Type for hints...']");
	private By Username= By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");
	private By Password= By.xpath("(//input[@class='oxd-input oxd-input--active'])[3]");
	private By Confirm_Password= By.xpath("(//input[@class='oxd-input oxd-input--active'])[4]");
			
	public AdminManagementPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void ClickOnAdminTab()
	{
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.findElement(Admin_tab).click();
	}
	
	public void ClickOnUserManagement()
	{
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		assert driver.findElement(user_mgmt).getText().equals(" Add ");
		driver.findElement(user_mgmt).click();	
	}
	
	public void ClickOnUser()
	{
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		assert driver.findElement(User_link).getText().equals("Users");
		driver.findElement(User_link).click();	
	}
	
	public void ClickOnAddButton() 
	{
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		assert driver.findElement(Add_user_button).getText().equals("Users");
		driver.findElement(Add_user_button).click();
	}
	
	public void selectUserType()
	{
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		WebElement user_drpdown=driver.findElement(User_type);
		Select drpdown= new Select(user_drpdown);
		drpdown.selectByVisibleText("User");
	}
	
	public void UserStatus(String status)
	{
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		WebElement user_status=driver.findElement(User_status);
		Select drpdown= new Select(user_status);
		drpdown.selectByVisibleText(status);
	}
	
	public void EnterName(String name)
	{
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.findElement(Name).sendKeys(name);
		System.out.println(name+" is entered");
	}
	
	public void EnterUsername(String username)
	{
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.findElement(Username).sendKeys(username);
		System.out.println(username+" is entered");
	}
	
	public void EnterPassword(String password)
	{
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.findElement(Password).sendKeys(password);
		System.out.println(password+" is entered");
	}
	
	
	public void ConfirmPassword(String password)
	{
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.findElement(Confirm_Password).sendKeys(password);
		System.out.println(password+" is entered");
	}
	
	
	public void getPageTitle()
	{
		String title=driver.getTitle();
		System.out.println(title);
	}
}
