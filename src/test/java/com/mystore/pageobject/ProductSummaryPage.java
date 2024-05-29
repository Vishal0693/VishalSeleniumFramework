package com.mystore.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ProductSummaryPage {

	//1. create object of webdriver
	WebDriver ldriver;
	
	public ProductSummaryPage (WebDriver rdriver)
	{
		ldriver = rdriver;
		
		PageFactory.initElements(rdriver, this);
	}
		
	
	//2. identify the webelements on  screen

	
	@FindBy(css = "a[class='button btn btn-default standard-checkout button-medium'] span")
    WebElement ClickonProceedtoCheckout;
	
	
	//action for the webellement 
	
	public void SummaryPage ( ) throws Exception, InterruptedException{
		
		ClickonProceedtoCheckout.click();
		
	}
	
	
}
