package com.training.base;

import java.util.HashMap;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class BasePage {
	WebDriver driver;

	public HashMap<String, By> objRep = new HashMap<String, By>();

	public BasePage(WebDriver driver) {
		this.driver = driver;
	}

	public void addObject(String logicalName, By by) {
		objRep.put(logicalName, by);
	}

	public void enterIntoTextBox(String logicalName, String InputData) {
		WebElement element = getWebElement(logicalName);
		enterIntoTextBox(element, InputData);
	}

	public void clearTextBox(String logicalName) {
		WebElement element = getWebElement(logicalName);
		clearTextBox(element);
	}

	public void clickCheckBox(String logicalName) {
		WebElement element = getWebElement(logicalName);
		clickCheckBox(element);
	}

	public void clickonButton(String logicalName) {
		WebElement element = getWebElement(logicalName);
		clickonButton(element);
	}

	public void clickonLink(String logicalName) {
		WebElement element = getWebElement(logicalName);
		clickonLink(element);
	}

	public void validateTheUserMenu(String logicalName) {
	WebElement element = getWebElement(logicalName);
	userMenuvalidation(element);
	}
	public void clickonOption(String logicalName)
	{
		WebElement element = getWebElement(logicalName);
		clickonoption(element);
		
	}
	public void clickonImage(String logicalName)
	{
		WebElement element = getWebElement(logicalName);
		clickonimage(element);
	}
	public void switchtoFrame(String logicalName)
	{
		WebElement element = getWebElement(logicalName);
		switchtoframe(element);
	}
	public void clickonTab(String logicalName)
	{
		WebElement element = getWebElement(logicalName);
		clickontab(element);
	}
	public void switchtodefault()
	{
		driver.switchTo().defaultContent();
		
	}
	public void validateErrorMsg(String logicalName,String InputData)
	{
		WebElement element = getWebElement(logicalName);
		validateErrorMsg(element, InputData);
	}
	public void getpagetitle(String InputData)
	{
		String expected=InputData;
		System.out.println("\nexpected Title="+expected);
	
		String actual=driver.getTitle();
		System.out.println("actual="+actual);
		assertmethod(actual,expected);
	System.out.println("Pass");
		
	}
	/*-----------------------------------------------------*/
	private WebElement getWebElement(String logicalName) {
		By by = objRep.get(logicalName);
		WebElement element = driver.findElement(by);
		return element;
	}

	private void enterIntoTextBox(WebElement element, String inputData) {
		waitforElement(element);
		element.sendKeys(inputData);
	}

	private void clearTextBox(WebElement element) {
		waitforElement(element);
		element.clear();
		}

	private void clickonLink(WebElement element) {
		waitforElement(element);
		element.click();
		}

	private void waitforElement(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(element));
		}

	private void clickonButton(WebElement element) {
		waitforElement(element);
		element.click();
		}

	private void clickCheckBox(WebElement element) {
		waitforElement(element);
		element.click();
		}
	private void clickonoption(WebElement element)
	{
		waitforElement(element);
		element.click();
	}
	private void clickonimage(WebElement element)
	{
		waitforElement(element);
		element.click();
	}
	private void switchtoframe(WebElement element)
	{
		waitforElement(element);
		driver.switchTo().frame(element);

	}
	private void clickontab(WebElement element)
	{
		waitforElement(element);
		element.click();
	}
	
	private void userMenuvalidation(WebElement element)
	{
	waitforElement(element);
	System.out.println(element.getText());
	String actual=element.getText();
	System.out.println("\nactual="+actual);
	String expected="My Profile\n"
					+"My Settings\n"
					+"Developer Console\n"
					+"Switch to Lightning Experience\n"
					+"Logout";
	
	assertmethod(actual,expected);
	System.out.println("Pass");
}
	public void switchWindowPopUp() throws InterruptedException
	{
		String oldwindow = driver.getWindowHandle();
		Set<String> allwindows = driver.getWindowHandles();
		for (String handle : allwindows) {
			if (!oldwindow.equals(handle)) {
				driver.switchTo().window(handle);
				System.out.println("current window Title is=" + driver.getTitle());
				driver.close();
				break;
			}
			Thread.sleep(3000);
		}
		
		driver.switchTo().window(oldwindow);
		System.out.println("current window Title is=" + driver.getTitle());
		}
public void assertmethod(String actualString,String expectedString)
{
	Assert.assertEquals(actualString, expectedString);
	System.out.println("content are same");
}
private void validateErrorMsg(WebElement element, String InputData)
{
	String actual=element.getText();
	String expected=InputData;
	assertmethod(actual,expected);
	System.out.println("pass");
}
	}


