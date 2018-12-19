package com.prestashop.pages;



import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.prestashop.utilities.Driver;

public class HomePage {
	
	public HomePage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy(id="search_query_top")
	public WebElement searchBox;
	
	@FindBy(className = "login")
	public WebElement signIn;
	
	public WebElement item(String name) {
		String css = "#center_column a.product-name[title = '"+name+"']";
		return Driver.getDriver().findElement(By.cssSelector(css));
	}
	
	
	
	
	

	
	
}
