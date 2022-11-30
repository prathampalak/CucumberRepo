package com.training.page;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.training.base.BasePage;
import com.training.base.BaseTest;

public class AccountPage extends BasePage{
static WebDriver driver;
	
	public AccountPage()
	{
		super(driver=BaseTest.getDriver());
		addObject("newaccount", By.xpath("//input[@name='new']"));
		addObject("accountName",By.xpath("//input[@id ='acc2']"));
		addObject("accountType",By.id("acc6"));
		addObject("priority",By.id("00N4x00000WL0VR"));
		addObject("save",By.name("save"));
		addObject("createNewView",By.xpath("//a[contains(text(),'Create New View')]"));
		addObject("newView",By.id("fname"));
		addObject("uniName",By.id("devname"));
		addObject("viewbox",By.id("fcf"));
		addObject("edit",By.xpath("//a[contains(text(),'Edit')]"));
		addObject("viewName",By.id("fname"));
		addObject("field",By.id("fcol1"));
		addObject("operator",By.id("fop1"));
		
		addObject("value",By.id("fval1"));
		addObject("mergeAccount",By.xpath("//a[contains(text(),'Merge Accounts')]"));
		addObject("searchAccount",By.id("srch"));
		addObject("srchBtn",By.name("srchbutton"));
		addObject("checkbox1",By.id("cid0"));
		addObject("checkbox2",By.id("cid1"));
		addObject("next",By.name("goNext"));
		addObject("merge",By.xpath("//div[@class='pbTopButtons']//input[@title='Merge']"));
		addObject("lastact",By.xpath("//a[contains(text(),'Accounts with last activity > 30 days')]"));
		addObject("dateField",By.cssSelector("#ext-gen20"));
		addObject("createDate",By.xpath("//div[contains(text(),'Created Date')]"));
		addObject("fromCalender",By.id("ext-gen152"));

		addObject("fromDate",By.xpath("//button[contains(text(),'Today')]"));
			
		addObject("toCalender",By.id("ext-gen154"));
		addObject("toDate",By.id("ext-gen3"));
		addObject("savebtn",By.id("ext-gen49"));
		addObject("reportName",By.id("saveReportDlg_reportNameField"));

		addObject("reportUniqueName",By.id("saveReportDlg_DeveloperName"));
		addObject("saverun",By.id("ext-gen314"));
		


		


		
}
}
