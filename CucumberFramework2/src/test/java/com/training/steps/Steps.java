package com.training.steps;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.training.base.BasePage;
import com.training.base.BaseTest;
import com.training.pageFactory.PageFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;

public class Steps extends BaseTest {
	PageFactory pagefactory=new PageFactory();
	BasePage page;
	@Before
	public void setup() throws Exception
	{
		launchapplication();
	}
	@Given("User is on {string}")
	public void user_is_on(String pageName) {
	
	    page=pagefactory.initialize(pageName);
	}

	@When("User enter into text box {string} {string}")
	public void user_enter_into_text_box(String logicalName, String InputData) {
	    page.enterIntoTextBox(logicalName, InputData);
	}

	@Then("User Click on CheckBox {string}")
	public void user_click_on_check_box(String logicalName) {
	   page.clickCheckBox(logicalName);
	}

	@When("User Clear the text box {string}")
	public void user_clear_the_text_box(String logicalName) {
	   page.clearTextBox(logicalName);
	}

	@Then("User Click on Button {string}")
	public void user_click_on_button(String logicalName) {
	   page.clickonButton(logicalName);
	}
	@Then("User Click on link {string}")
	public void user_click_on_link(String logicalName) {
		page.clickonLink(logicalName);
	    
	}
	@Then("Validate the Usermenu {string}")
	public void validate_the_usermenu(String logicalName) {
	    page.validateTheUserMenu(logicalName);
	}

	@Then("Click on option {string}")
	public void click_on_option(String logicalName) {
	    page.clickonOption(logicalName);
	}

	@Then("Click on image {string}")
	public void click_on_image(String logicalName) {
	    page.clickonImage(logicalName);
	}

	@Then("Switch to frame {string}")
	public void switch_to_frame(String logicalName) {
	    page.switchtoFrame(logicalName);
	}

	@Then("Click on Tab {string}")
	public void click_on_tab(String logicalName) {
	    page.clickonTab(logicalName);
	}
	@Then("Switch to default")
	public void switch_to_default() {
	   page.switchtodefault();
	}
	@Then("Validate the error msg {string} {string}")
	public void validate_the_error_msg(String logicalName, String InputData) {
	    page.validateErrorMsg(logicalName,InputData);
	}
	@Then("Switch to window popup")
	public void switch_to_window_popup() throws InterruptedException {
	    page.switchWindowPopUp();
	}
	@Then("validate the page title {string}")
	public void validate_the_page_title(String InputData) {
	    page.getpagetitle(InputData);
	}


	@After
	public void teardown(Scenario scenario) {
		 byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
		   // embed it in the report.
		      scenario.attach(screenshot, "image/png",scenario.getName()); 
			driver.close();
		driver = null;
	}
	
}
