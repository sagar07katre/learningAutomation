package com.AmazoCart.generic.webdriverutility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebdriverUtility {

	
	public void waitForPageToLoad(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	public void waitForElementPresent(WebDriver driver , WebElement element ) 
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public void provideWaitStatement()
	{
		
	}
	public void clickonElement()
	{
		
	}
	public void passDataOnElement()
	{
		
	}
	public void clearDataOnElement()
	{
		
	}
	public void validateOnElementDisplayed()
	{
		
	}
	public void validateOnElementEnabled()
	{
		
	}
	public void validateOnElementSelected()
	{
		
	}
	public void selectOptionOnDropdown(int index)
	{
		
	}
	public void selectOptionOnDropdown(String visibletext)
	{
		
	}
	public void selectOptionOn_Dropdown(String value)
	{
		
	}
	public void switchControlToAlert()
	{
		
	}
	public void switchControlToFrame()
	{
		
	}
	
}
