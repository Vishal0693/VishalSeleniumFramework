package com.mystore.testcases;



import org.testng.Assert;
import org.testng.annotations.Test;

import com.mystore.pageobject.accountCreationDetails;
import com.mystore.pageobject.indexPage;
import com.mystore.pageobject.myAccount;
import com.mystore.pageobject.registeredUsers;

public class TC_MyAccountPageTest extends BaseClass {
	
	
	@Test(enabled=false)
	public void VerifyRegistraionLogin() throws Exception ,InterruptedException  {
		
		
	
		
		//creating the object of index class which have the sign in button code.
		
		indexPage pg = new indexPage(driver);
		pg.ClickonSignin();//this method was created in indexpage for clicksign.
		logger.info("click on sign in buttton");
		myAccount myAccpg = new myAccount(driver);
		myAccpg.EntercreateemailAdress("vishalpilaware2000@gmail.com");
		logger.info("Email adress enetred in create account section ");
		myAccpg.Clicksubmitcreate();
		logger.info("clicked on create account button");
		myAccpg.mypersonalinfo();
		Thread.sleep(5000);
		accountCreationDetails accountcreationdetails = new accountCreationDetails(driver);
		accountcreationdetails.SelectTitleMr();
		accountcreationdetails.SelectFirstName("vishal");
		accountcreationdetails.SelectlastName("pilaware");
		accountcreationdetails.EnterPassword("Dev@1993");
		logger.info("Details entered for creating account");
		accountcreationdetails.ClickonRegister();
		logger.info("clicked on Register button");
		Thread.sleep(5000);
		registeredUsers regiUser = new registeredUsers(driver);
		String Sucessmessage = regiUser.SucessAlert();
		Assert.assertEquals("Your account has been created.", Sucessmessage);
		logger.info("Your account has been created. message gets display on screen");
		String userName = regiUser.getUserName();
		logger.info("Username displayed correctly");
	}

	@Test
	public void VerifyLogin() throws Exception, InterruptedException {
		
		logger.info("Execution started");
		indexPage pg = new indexPage(driver);
		pg.ClickonSignin();//this method was created in indexpage for clicksign.
		logger.info("click on sign in buttton on homepage");
		
		myAccount myAccpg = new myAccount(driver);
		myAccpg.EnteremailAdress("vishalpilaware2000@gmail.com");
		myAccpg.Enterpwd("Dev@1993");
		logger.info("Entered email id & pwd");
		myAccpg.clicksignin();
		logger.info("clicked on sign in buttton");
		
		registeredUsers regiUser = new registeredUsers(driver);
		String userName = regiUser.getUserName();
		if (userName.equals("Vishal pilaware"))	
		{
		logger.info("Verify login -passed");
		Assert.assertTrue(true);
		
	}
		else {
			logger.info("Verify login -failed");
			captureScreenShot(driver,"VerifyLogin");
			Assert.assertTrue(false);
		}
}
	
	
	
	
	
	
}
