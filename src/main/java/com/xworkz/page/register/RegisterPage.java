package com.xworkz.page.register;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage {
	private WebDriver driver;
	
	public RegisterPage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	private By emailID = By.id("email");
	private By password = By.id("psw");
	private By repeatPassword = By.id("psw-repeat"); 
	private By course = By.id("courses");
	private By gender = By.id("female");
	public void enterEmailID(String email)
	{
		driver.findElement(emailID).sendKeys(email);
	}
	
	public void enterPassword(String pwd)
	{
		driver.findElement(password).sendKeys(pwd);
	}
	public void reenterPassword(String pwd)
	{
		driver.findElement(repeatPassword).sendKeys(pwd);
	}
	public void selectCourse(int courseindex)
	{
		WebElement coursesdropdown = driver.findElement(course);
		Select select=new Select(coursesdropdown);
		select.selectByIndex(courseindex);
	}
	public void selectGender()
	{
		driver.findElement(gender).click();
	}
}
