package com.mystore.testcases;



import org.testng.Assert;
import org.testng.annotations.Test;

import com.mystore.pageobject.ContactUsPage;
import com.mystore.pageobject.indexPage;
import com.mystore.pageobject.myAccount;


public class TC_ContactUs extends BaseClass {
	
	
	
	@Test
	public void VerifyContactUsSection() throws Exception, InterruptedException {
		
		logger.info("Execution started");
		indexPage pg = new indexPage(driver);
		ContactUsPage cp = new ContactUsPage(driver);
		cp.contactusbutton();
		logger.info("click on contactusbutton");
		cp.subjectheadingdropdown("Webmaster");
		logger.info("user selected the dropdown value");
		cp.emailfield();
		logger.info("user selected the email field value");
		cp.orderreffiled();
		logger.info("user enter the orderrefencefield");
		cp.messagefiled();
		logger.info("user enter the message");
		cp.submitbuttoncontactus();
		logger.info("user fill all the details on contact us page & click on on submit button");
}
	
	
	
	
	
	
}
