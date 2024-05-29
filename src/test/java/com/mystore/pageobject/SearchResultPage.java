package com.mystore.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SearchResultPage {

	//1. create object of webdriver
	WebDriver ldriver;
	
	public SearchResultPage (WebDriver rdriver)
	{
		ldriver = rdriver;
		
		PageFactory.initElements(rdriver, this);
	}
		
	
	//2. identify the webelements on  screen
	
	@FindBy(xpath = "//p[@class='product-description'][contains(text(),'Short sleeved blouse with feminine draped sleeve d')]")
    WebElement SearchResultProduct;
	@FindBy(xpath = "//a[@title='Blouse'][normalize-space()='Blouse']")
    WebElement ClickonBlouseTile;
	@FindBy(xpath = "//a[@id='color_8']")
    WebElement SelectproductColor;
	@FindBy(xpath = "//input[@id='quantity_wanted']")
    WebElement Selectproductquantity;
	
	
	@FindBy(xpath = "//select[@id='group_1']")
    WebElement ClickonSizeDropdown;
	@FindBy(css = "option[title='L']")
    WebElement Selectsize;
	@FindBy(css = "button[name='Submit'] span")
    WebElement ClickonADDtoCart;
	
	@FindBy(css = "a[title='Proceed to checkout'] span")
    WebElement ClickonProceedtoCheckout;
	
	
	//action for the webellement 
	public String getsearchproductName() {
		return (SearchResultProduct.getText());
		 
	}
	public void ProductTile ( ){
		ClickonBlouseTile.click();
	}
	public void ProductdetailsPage ( ) throws Exception, InterruptedException{
		SelectproductColor.click();
		
		Thread.sleep(2000);
		ClickonSizeDropdown.click();
		Selectsize.click();
		Selectproductquantity.click();
		Selectproductquantity.clear();
		Selectproductquantity.sendKeys("2");
		
		ClickonADDtoCart.click();
		Thread.sleep(3000);
		ClickonProceedtoCheckout.click();
		
	}
	
	
}
