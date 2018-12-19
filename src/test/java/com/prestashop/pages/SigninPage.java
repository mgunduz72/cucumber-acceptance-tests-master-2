package com.prestashop.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.prestashop.utilities.Driver;

public class SigninPage {
	
	public SigninPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy(id = "email_create")
	public WebElement signupEmail;
	
	
	public WebElement email;
	
	
	public WebElement passwd;
	
	
}
