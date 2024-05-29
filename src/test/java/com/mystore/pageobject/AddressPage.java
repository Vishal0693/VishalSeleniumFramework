package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddressPage {

	//1. create object of webdriver
			WebDriver ldriver;
			
			public AddressPage (WebDriver rdriver)
			{
				ldriver = rdriver;
				
				PageFactory.initElements(rdriver, this);
			}
				
			
			//2. identify the webelements on  screen
			@FindBy(css = "button[name='processAddress'] span")
		    WebElement AddressproceedTocheckout;
			
			@FindBy(css = "#address1")
		    WebElement AddressTextField;
			
			@FindBy(css = "#city")
		    WebElement CityField;
			
			@FindBy(css = "#id_state")
		    WebElement StateDropdwonclick;
			
			@FindBy(css = "option[value='1']")
		    WebElement StateDropdownvalueselection;
			
			@FindBy(css = "#postcode")
			WebElement Postalcode ;
			@FindBy(css = "#phone")
			WebElement HomePhone ;
			@FindBy(css = "#phone_mobile")
			WebElement Mobilephone ;
			@FindBy(css = "button[id='submitAddress'] span")
			WebElement SaveAddressbutton ;
			
			
			public void addressproceedTocheckout () {
				AddressproceedTocheckout.click();
				}
			public void AddressField ( ){
				AddressTextField.sendKeys("vtp leonara");
				}
			
			public void CityselectionField ( ){
				CityField.sendKeys("pune");
				}
				
			public void Stattefielddropdoenclick () {
				StateDropdwonclick.click();
				}
			
			public void StateDropdownselection ( ){
				StateDropdownvalueselection.click();
}
			
			public void zipcode ( ){
				Postalcode.sendKeys("35049");
				}
			
			public void HomePhonenumber ( ){
				HomePhone.sendKeys("8675104956");
				}
			public void Mobilephonenumber ( ){
				Mobilephone.sendKeys("8675904956");
				}
			public void SaveAddress ( ){
				SaveAddressbutton.click();
				}
			
}
