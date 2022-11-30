package com.training.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.training.base.BasePage;
import com.training.base.BaseTest;

public class UserMenuPage extends BasePage {
	
		static WebDriver driver;
		public UserMenuPage()
		{
		super(driver=BaseTest.getDriver());
		addObject("menuOptions", By.id("userNav-menuItems"));
		addObject("myprofile", By.xpath("//a[@title='My Profile']"));
		addObject("editProfile", By.xpath("//a[(@class='contactInfoLaunch editLink')]//img"));
		
		addObject("mysetting", By.xpath("//a[@title='My Settings"));
		addObject("devloperconsole",By.xpath("//a[@title='Developer Console (New Window)']"));
		addObject("logout",By.xpath("//a[@title='Logout']"));
		addObject("editProfileFrame",By.xpath("//iframe[@id='contactInfoContentId']"));
		addObject("about",By.xpath("//a[contains(text(),'About')]"));
		addObject("lastname",By.id("lastName"));
		addObject("saveall",By.xpath("//input[@value='Save All']\""));
		addObject("postframe",By.xpath("//iframe[@class='cke_wysiwyg_frame cke_reset']"));
		addObject("post",By.className("publisherattachtext"));
		addObject("postText",By.xpath("//body[@class='chatterPublisherRTE cke_editable cke_editable_themed cke_contents_ltr cke_show_borders placeholder']"));
		addObject("share",By.id("publishersharebutton"));
		addObject("file",By.xpath("//span[text()='File']"));
		addObject("uploadFile",By.xpath("chatterUploadFileAction"));
		addObject("choosefile",By.id("chatterFile"));
		addObject("personal",By.id("PersonalInfo_font"));
		addObject("loginHostory",By.id("LoginHistory_font"));
		addObject("first",By.id("firstName"));
		/*addObject("",By.(""))
		addObject("",By.(""))*/
	}
	}

