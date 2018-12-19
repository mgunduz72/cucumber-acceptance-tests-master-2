package com.prestashop.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.prestashop.utilities.Driver;

public class ItemPage {
	
	public ItemPage() {
		PageFactory.initElements(Driver.getDriver(), this);
		
	}
	@FindBy (tagName = "h1")
	public WebElement itemName;
	
	@FindBy(id = "quantity_wanted")
	public WebElement quantity;
	
	@FindBy(id = "group_1")
	public WebElement size;
	
	public Select sizes() {
		
		Select select = new Select();
		return new Select(Driver.getDriver().findElement(By.id("group_1")));
	}
	 
	  }


