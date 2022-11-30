package com.training.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.training.base.BasePage;
import com.training.base.BaseTest;

public class LoginPage extends BasePage{
	static WebDriver driver;
	public LoginPage()
	{
		super(driver=BaseTest.getDriver());

	
	addObject("Username", By.id("username"));
	addObject("Password", By.id("password"));
	addObject("RememberMe", By.id("rememberUn"));
	addObject("Login", By.name("Login"));
	addObject("Forgot",By.id("forgot_password_link"));
	addObject("Continue",By.id("continue"));
	addObject("Fusername",By.id("un"));
	addObject("errorMsg",By.id("error"));
	
	
}
}