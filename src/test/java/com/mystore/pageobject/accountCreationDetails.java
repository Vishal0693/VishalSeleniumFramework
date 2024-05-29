package com.mystore.pageobject;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class accountCreationDetails {

		//1. create object of webdriver
		WebDriver ldriver;
		
		public accountCreationDetails (WebDriver rdriver)
		{
			ldriver = rdriver;
			
			PageFactory.initElements(rdriver, this);
		}
			
		
		//2. identify the webelements on  screen
		
		@FindBy(id = "id_gender1")
		WebElement TitleMR ;
		@FindBy(id = "customer_firstname")
		WebElement FirstName ;
		@FindBy(id = "customer_lastname")
		WebElement LastName ;
		@FindBy(id = "passwd")
		WebElement Password ;
		/*@FindBy(id = "firstname")
		WebElement AddressFirstName ;
		@FindBy(id = "lastname")
		WebElement AddressLastName ;
		@FindBy(id = "address1")
		WebElement Address1 ;
		@FindBy(id = "city")
		WebElement City ;*/
		@FindBy(id = "submitAccount")
		WebElement Regsiterbutton ;
		
		//Identify the actions to be perform on element
		
		public void SelectTitleMr (){
			TitleMR.click();
		}
		
		public void SelectFirstName (String fname){
			FirstName.sendKeys(fname);
		}
		public void SelectlastName (String lname){
			LastName.sendKeys(lname);
		}
		public void EnterPassword (String pwd){
			Password.sendKeys(pwd);
		}
		public void ClickonRegister (){
			Regsiterbutton.click();
			
		}
		
			
			
		}


	

