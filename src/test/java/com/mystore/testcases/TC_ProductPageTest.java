package com.mystore.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.mystore.pageobject.SearchResultPage;
import com.mystore.pageobject.indexPage;
import com.mystore.pageobject.myAccount;
import com.mystore.pageobject.registeredUsers;

public class TC_ProductPageTest extends BaseClass {

	
	@Test
	public void VerifySearchProduct() throws Exception, InterruptedException {
		
		String searchkey = "blouse";
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
		regiUser.Searchingboxfield("blouse");
		logger.info("Text Entered in searchbox");
		regiUser.Searchboxfield();
		
		Thread.sleep(3000);
		
		//Get name of SEARCH text on UI
		
		SearchResultPage searchproduct = new SearchResultPage(driver);
		String  SearchResultProduct= searchproduct.getsearchproductName();
		
		//verifyh the correct productname is disolaying on screen
		
		if(SearchResultProduct.contains("blouse"))
		{
			Assert.assertTrue(true);
			logger.info("Search product Test case is pass");
			regiUser.ClickonSignOut();
		}
		
		else {
			logger.info("Search product Test case is fail");
			Assert.assertTrue(false);
		}
}
	
	
	
	
}
