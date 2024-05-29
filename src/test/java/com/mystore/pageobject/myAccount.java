package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class myAccount{
//1. create object of webdriver
	WebDriver ldriver;
	
	public myAccount (WebDriver rdriver)
	{
		ldriver = rdriver;
		
		PageFactory.initElements(rdriver, this);
	}
		
	
	//2. identify the webelements on indexpage screen
	//new user creation fileds
	@FindBy(id = "email_create")
	WebElement Createemailid ;
	@FindBy(id = "SubmitCreate")
	WebElement SubmitCreate ;
	@FindBy(css = ".page-subheading")
	WebElement Yourpersonalinfo ;
	
	//login to registred users
	@FindBy(id = "email")
	WebElement RegisteredUserEmail ;
	@FindBy(id = "passwd")
	WebElement RegisteredUserpwd ;
	@FindBy(css = "button[id='SubmitLogin'] span")
	WebElement submitlogin ;
	
	
	
	//Identify the action on element
	//action methods for creating new account
	
	public void EntercreateemailAdress (String EmailAdd){
		Createemailid.sendKeys(EmailAdd);
}
	public void Clicksubmitcreate (){
		SubmitCreate.click();
	
}
	public void mypersonalinfo (){
		Yourpersonalinfo.getText();
}
	
	
	//action methods for registred user login
	public void EnteremailAdress (String EmailAdd){
		RegisteredUserEmail.sendKeys(EmailAdd);
}
	
	public void Enterpwd (String pwd){
		RegisteredUserpwd.sendKeys(pwd);
}
	public void clicksignin (){
		submitlogin.click();
}
	
}