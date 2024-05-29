package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShippingPage {

	//1. create object of webdriver
			WebDriver ldriver;
			
			public ShippingPage (WebDriver rdriver)
			{
				ldriver = rdriver;
				
				PageFactory.initElements(rdriver, this);
			}
				
			
			//2. identify the webelements on  screen
			@FindBy(css = "button[name='processCarrier'] span")
		    WebElement ShippingproceedTocheckout;
			
			@FindBy(css = "#cgv")
			WebElement TermsConditionClick ;
			
			
			
			public void shippingproceedtocheckout ( ){
				ShippingproceedTocheckout.click();
				}
			public void termsconditionclick ( ){
				TermsConditionClick.click();
				}
			
}
