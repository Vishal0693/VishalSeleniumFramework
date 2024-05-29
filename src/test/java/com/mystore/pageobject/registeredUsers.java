package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class registeredUsers {

	//1. create object of webdriver
			WebDriver ldriver;
			
			public registeredUsers (WebDriver rdriver)
			{
				ldriver = rdriver;
				
				PageFactory.initElements(rdriver, this);
			}
				
			
			//2. identify the webelements on  screen
			
			@FindBy(css = "a[title='View my customer account'] span")
		    WebElement userName;
			
			@FindBy(css = ".alert-success")
		    WebElement Sucessmessage;
			
			@FindBy(css = "#search_query_top")
		    WebElement Searchingbox;
			
			@FindBy(css = "button[name='submit_search']")
		    WebElement SearchboxClick;
			
			@FindBy(css = "a[title='Log me out']")
			WebElement SignOut ;
			
			public String SucessAlert() {
			String text = 	Sucessmessage.getText();
				return text;
			}
			
			public String getUserName() {
			String text = 	userName.getText();
			return text;
			}
				
			public void Searchingboxfield (String searchtext ){
				Searchingbox.sendKeys(searchtext);
				}
			
			public void Searchboxfield ( ){
				SearchboxClick.click();
}
			
			public void ClickonSignOut ( ){
				SignOut.click();
}
}