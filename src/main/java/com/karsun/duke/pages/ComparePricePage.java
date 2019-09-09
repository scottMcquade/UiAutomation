package com.karsun.duke.pages;

import org.junit.Assert;
import org.openqa.selenium.By;

import com.karsun.duke.utils.LoadProperties;
import com.karsun.kic.tan.duke.Page;
import com.karsun.kic.tan.duke.util.ActionByLocator;
import org.openqa.selenium.WebDriver;
import org.springframework.stereotype.Component;

@Component
public class ComparePricePage extends Page {
	
	private static final int TIME_OUT_SECONDS = 5;
	private static final By PAGE_TITLE = By.xpath("//h2[contains(.,'Compare Products')]");
	private static final By cherryCompareLink = By.xpath("//img[@alt='Cherry']//following-sibling::div[contains(.,'Compare')]");
	private static final By orangeCompareLink = By.xpath("//img[@alt='Orange']//following-sibling::div[contains(.,'Compare')]");
	
	@Override
	protected boolean isLoaded() {
		return ActionByLocator.isDisplayed( getExecutionContext().getDriver(), PAGE_TITLE, TIME_OUT_SECONDS);
	}

	@Override
	protected void load() {
		 getExecutionContext().getDriver().get(LoadProperties.getProperty("web.url"));
		Assert.assertTrue("Could not load products page", isLoaded());
	}
	
	public void select2ProductsToCompare() {
		ActionByLocator.click( getExecutionContext().getDriver(), cherryCompareLink, TIME_OUT_SECONDS);
		ActionByLocator.click( getExecutionContext().getDriver(), orangeCompareLink, TIME_OUT_SECONDS);
	}

}
