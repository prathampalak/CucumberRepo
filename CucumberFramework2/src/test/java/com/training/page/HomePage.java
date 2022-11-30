package com.training.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.training.base.BasePage;
import com.training.base.BaseTest;

public class HomePage extends BasePage{
static WebDriver driver;
	
	public HomePage() {
		
		super(driver=BaseTest.getDriver());
	addObject("UserMenuDropDown", By.id("userNavButton"));
	addObject("AccountTab", By.id("password"));
	
}
}
