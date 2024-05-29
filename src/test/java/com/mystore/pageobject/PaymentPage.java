package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentPage {

	//1. create object of webdriver
			WebDriver ldriver;
			
			public PaymentPage (WebDriver rdriver)
			{
				ldriver = rdriver;
				
				PageFactory.initElements(rdriver, this);
			}
				
			
			//2. identify the webelements on  screen
			@FindBy(css = "a[title='Pay by check.']")
		    WebElement paymentpagetoproceed;
			
			@FindBy(css = "button[class='button btn btn-default button-medium'] span")
		    WebElement confirmorder;
			
			public void PaymentPageToProceed ( ){
				paymentpagetoproceed.click();
				}
			public void Confirmorder ( ){
				confirmorder.click();
				}
			
}
