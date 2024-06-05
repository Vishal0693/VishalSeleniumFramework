package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ContactUsPage {

	//1. create object of webdriver
			WebDriver ldriver;
			
			public ContactUsPage (WebDriver rdriver)
			{
				ldriver = rdriver;
				
				PageFactory.initElements(rdriver, this);
			}
				
			
			//2. identify the webelements on  screen
			@FindBy(css = "a[title='Contact us']")
		    WebElement ContactUsclick;
			
			//@FindBy(id = "id_contact")
			@FindBy(css ="#id_contact")
			WebElement subjectHeadingdropdown ;
			
			
			@FindBy(id = "email")
			WebElement emailidfieldcontactus ;
			
			@FindBy(id = "id_order")
			WebElement orderreferncetextfield ;
			
			@FindBy(id = "message")
			WebElement messagefield ;
			@FindBy(id = "submitMessage")
			WebElement submitcontactus ;
			
			
			public void contactusbutton ( ){
				ContactUsclick.click();
			}
				
				//public void subjectheadingdropdown (){
					//subjectHeadingdropdown.click();
					
				
				//}
			public void subjectheadingdropdown (String subjectheading ){
				Select oSelect=new Select (subjectHeadingdropdown);
				oSelect.selectByVisibleText(subjectheading);
				}
			
			public void emailfield ( ){
				
				emailidfieldcontactus.sendKeys("vishalpilaware1993@gmail.com");
			}
            public void orderreffiled ( ){
				
	         orderreferncetextfield.sendKeys("vishal order refernce text filed");
			}
            public void messagefiled ( ){
				
            	messagefield.sendKeys("my message filed text field");
   			}
            
            public void submitbuttoncontactus ( ){
				
	        submitcontactus.click();
			}
            
}
