package com.karsun.duke.steps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.karsun.duke.pages.ComparePricePage;
import com.karsun.kic.tan.duke.Steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

@Component
public class CompareProductsSteps extends Steps {
	
	@Autowired
	ComparePricePage comparePricePage;
	
	private void initcomparePricePage() {
		if (comparePricePage == null) {
			comparePricePage = new ComparePricePage();
		}
		comparePricePage.get();
	}

	@Given("^I am on the Compare Products page$")
	public void i_am_on_the_Compare_Products_page() throws Throwable {
		initcomparePricePage();
	}

	@When("^I select Orange and Cherry products to compare$")
	public void i_select_Orange_and_Cherry_products_to_compare() throws Throwable {
	    comparePricePage.select2ProductsToCompare();
	}

	@Then("^the price comparison is displayed$")
	public void the_price_comparison_is_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions

	}

	@Then("^Chrry and Orange condition is dsplayed$")
	public void chrry_and_Orange_condition_is_dsplayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions

	}
	
}
