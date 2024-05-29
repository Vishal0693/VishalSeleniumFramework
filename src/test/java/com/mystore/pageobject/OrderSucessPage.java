package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderSucessPage {

	//1. create object of webdriver
			WebDriver ldriver;
			
			public OrderSucessPage (WebDriver rdriver)
			{
				ldriver = rdriver;
				
				PageFactory.initElements(rdriver, this);
			}
				
			
			//2. identify the webelements on  screen
			@FindBy(css = ".alert.alert-success")
		    WebElement Ordersucsess;
			
			
			
			public String SucessAlert() {
				String text = 	Ordersucsess.getText();
					return text;
				}
			
			
}
