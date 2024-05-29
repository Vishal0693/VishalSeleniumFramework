package com.mystore.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.mystore.pageobject.AddressPage;
import com.mystore.pageobject.OrderSucessPage;
import com.mystore.pageobject.PaymentPage;
import com.mystore.pageobject.ProductSummaryPage;
import com.mystore.pageobject.SearchResultPage;
import com.mystore.pageobject.ShippingPage;
import com.mystore.pageobject.indexPage;
import com.mystore.pageobject.myAccount;
import com.mystore.pageobject.registeredUsers;

public class TC_BuyProduct extends BaseClass {

	@Test
	public void AddToCart() throws Exception, InterruptedException {
		
		String searchkey = "Blouse";
		logger.info("Execution started");
		
		///SIGN in code
		indexPage pg = new indexPage(driver);
		pg.ClickonSignin();//this method was created in indexpage for clicksign.
		logger.info("click on sign in buttton on homepage");
		
		//Enter email & PWD TO LOGIN CODE
		myAccount myAccpg = new myAccount(driver);
		myAccpg.EnteremailAdress("vishalpilaware2000@gmail.com");
		myAccpg.Enterpwd("Dev@1993");
		logger.info("Entered email id & pwd");
		myAccpg.clicksignin();
		logger.info("clicked on sign in buttton");
		
		//Enter THE TEXT IN SEARCHbox
		registeredUsers regiUser = new registeredUsers(driver);
		regiUser.Searchingboxfield(searchkey);
		logger.info("Text Entered in searchbox");
		regiUser.Searchboxfield();
		logger.info("search product display on screen");
		
		//Click on  product tile
		SearchResultPage clickonproducttile= new SearchResultPage(driver);
		clickonproducttile.ProductTile();
		logger.info("User click on product tile");
		
		//changes on productdetailspage
		clickonproducttile.ProductdetailsPage();
		logger.info("User select the size,quantity, color change & then click on add to cart & then proceed to checkoutbutton");
		
		//click on proceed to checkout on ProductSummary page
		
		ProductSummaryPage productsummarypage = new ProductSummaryPage(driver);
		productsummarypage.SummaryPage();
		logger.info("User proceed to checkout from productsummary page");
		
		AddressPage addresspage = new AddressPage(driver);
		addresspage.addressproceedTocheckout();
		logger.info("User proceed to checkout from Address page");
		//below mention code used for one time oly to add the adress for the user.
		/*addresspage.AddressField();
		addresspage.CityselectionField();
		addresspage.Stattefielddropdoenclick();
		addresspage.StateDropdownselection();
		addresspage.zipcode();
		addresspage.HomePhonenumber();
		addresspage.Mobilephonenumber();
		addresspage.SaveAddress();*/
		
		ShippingPage shippingpage = new ShippingPage(driver);
		shippingpage.termsconditionclick();
		shippingpage.shippingproceedtocheckout();
		logger.info("User proceed to checkout from Shipping Page");
		PaymentPage paymentpage = new PaymentPage(driver);
		paymentpage.PaymentPageToProceed();
		logger.info("User proceed from payment type selection page");
		Thread.sleep(2000);
		paymentpage.Confirmorder();
		logger.info("User confirm the order");
		OrderSucessPage OrdersucessPage = new OrderSucessPage(driver);
		String Ordersucsess = OrdersucessPage.SucessAlert();
		Assert.assertEquals("Your order on My Shop is complete.", Ordersucsess);
		logger.info("Your order on My Shop is complete message gets display on screen");
}
	
	
}
