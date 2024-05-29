package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class indexPage {

	//1. create object of webdriver
	WebDriver ldriver;
	
	public indexPage (WebDriver rdriver)
	{
		ldriver = rdriver;
		
		PageFactory.initElements(rdriver, this);
	}
		
	
	//2. identify the webelements on indexpage screen
	
	@FindBy(css = "a[title='Log in to your customer account']")
	WebElement SignIn ;
	
	
	
	//Identify the action on element
	
	public void ClickonSignin (){
		SignIn.click();
		
	}
	
		
		
	}

