package com.prestashop.step_definitions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Map;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import com.prestashop.pages.HomePage;
import com.prestashop.pages.ItemPage;
import com.prestashop.utilities.BrowserUtils;
import com.prestashop.utilities.Driver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ProductInformaitonStepDef{

	HomePage homePage = new HomePage();
	ItemPage itemPage = new ItemPage();
	
	@When("the user selected Printed Summer Dress")
	public void the_user_selected_Printed_Summer_Dress() {
	    homePage.item("Printed Summer Dress").click();
		
	}

	@Then("product information page should be displayed")
	public void product_information_page_should_be_displayed() {
	  
		String actual = Driver.getDriver().getTitle();
        assertEquals("Printed Summer Dress - My Store", actual);
		
	}

	@Then("product name should be Printed Summer Dress")
	public void product_name_should_be_Printed_Summer_Dress() {
	    
		String actual = itemPage.itemName.getText();
		String expected = "Printed Summer Dress";
		assertEquals(expected, actual);
		
	}
	
	@Then("correct default count size should be displayed")
	public void correct_default_count_size_should_be_displayed() {
	    
	}
   

}


