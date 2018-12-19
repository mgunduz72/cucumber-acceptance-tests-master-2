package com.prestashop.step_definitions;

import static org.junit.Assert.assertEquals;

import java.util.Map;

import com.prestashop.pages.HomePage;
import com.prestashop.pages.SigninPage;
import com.prestashop.utilities.BrowserUtils;
import com.prestashop.utilities.ConfigurationReader;
import com.prestashop.utilities.Driver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.junit.Assert.assertTrue;

public class HomePageStepDefs {
	HomePage home = new HomePage();
	SigninPage signIn = new SigninPage();
	
	@Given("the user is on the home page")
	public void the_user_is_on_the_home_page() {
		System.out.println("user is on the home page");
		Driver.getDriver().get(ConfigurationReader.getProperty("url"));
	    
	}

	@When("the user enters a search term")
	public void the_user_enters_a_search_term() {
		System.out.println("user searchs for an item");
		home.searchBox.sendKeys("t shirt");
	    
	}

	@Then("the seach box should contain the search term")
	public void the_seach_box_should_contain_the_search_term() {
	   System.out.println("verifying the search term");
	   String actual = home.searchBox.getAttribute("value");
	   System.out.println(actual);
	   assertEquals("t shirt", actual);
		
	}
	
	String pageTitle;
	@When("the user gets the title of the page")
	public void the_user_gets_the_title_of_the_page() {
		System.out.println("user gets the title");
		pageTitle = Driver.getDriver().getTitle();
	    
	}

	@Then("title should be {string}")
	public void title_should_be(String title) {
		System.out.println("user verifies the title");
		System.out.println(pageTitle);
		assertEquals(pageTitle, title);
	    
	}
	
	@When("the user clicks on the sign in link")
	public void the_user_clicks_on_the_sign_in_link() {
		home.signIn.click();
	    
	}

	@Then("username and password fields should be displayed")
	public void username_and_password_should_be_displayed() {
		assertTrue(signIn.email.isDisplayed());
		assertTrue(signIn.passwd.isDisplayed());
		
	  
	}






	
}

