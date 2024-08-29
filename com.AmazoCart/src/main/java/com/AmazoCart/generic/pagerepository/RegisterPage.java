package com.AmazoCart.generic.pagerepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage 
{
	
	public RegisterPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id = "name" ,name ="name")
	private WebElement name;
	
	@FindBy(id = "male")
	private WebElement maleCheckBox;
	
	public WebElement getid() {
		return maleCheckBox;
	}
	
	public WebElement getName() {
		return name;
	}
}
