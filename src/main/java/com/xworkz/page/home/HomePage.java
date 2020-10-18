package com.xworkz.page.home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	private WebDriver driver;

	public HomePage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	private By registerLink = By.linkText("Register");
	private By loginLink = By.xpath("//a[text()='Login']");
	
	public void clickOnRegisterLink()
	{
		driver.findElement(registerLink).click();
	}
	
	public void clickOnLoginLink()
	{
		driver.findElement(loginLink).click();
	}
	
	public void isRegisterLinkDisplayed()
	{
		boolean flag= driver.findElement(registerLink).isDisplayed();
		if(flag)
		{
			System.out.println("Registration link displayed");
			clickOnRegisterLink();
		}
		else
		{
			System.out.println("Registration link is not displayed");
		}
	}
	
	public void isLoginLinkDisplayed()
	{
		boolean flag= driver.findElement(loginLink).isDisplayed();
		if(flag)
		{
			System.out.println("Login link displayed");
			clickOnLoginLink();
		}
		else
		{
			System.out.println("Login link is not displayed");
		}
	}
}
