package com.mystore.testcases;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.logging.log4j.Logger;
import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.mystore.utilities.ReadConfig;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseClass {
	
	ReadConfig readConfig = new ReadConfig();
	String url = readConfig.getBaseUrl();
	String browser = readConfig.getBrowser();
	
	//browser setup of webdriver
	public static WebDriver driver;
	public static Logger logger;
	

	@BeforeClass 
	//launching browser
	public void setup() {
		
		switch (browser.toLowerCase())
		{
		case "chrome":WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		break;
		
		case "msedge":WebDriverManager.chromedriver().setup();
		driver = new EdgeDriver();
		break;
		
		default: driver=null;
		break;
		
		}
		
		
		
		driver.manage().window().maximize();
		//Impliciate wait statement
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		
		
		//login code which is common, so creating varaible for logger. In src/main/resource-> file is attached
		
	 logger = LogManager.getLogger("MyStoreV1");
	 
	//open url which we use varaiblle in baselclass.
		
			driver.get(url);
			logger.info("url opened");
	 
	}
	
	
	public void WaitForElementToAppear(By findBy)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(findBy));	
	}
	
	
	// browser close & quite method
	public void tearDown(){
		
		driver.close();
		driver.quit();
	}
	//user method to capture screen shot
		public void captureScreenShot(WebDriver driver,String testName) throws IOException
		{
			//step1: convert webdriver object to TakesScreenshot interface
			TakesScreenshot screenshot = ((TakesScreenshot)driver);
			
			//step2: call getScreenshotAs method to create image file
			
			File src = screenshot.getScreenshotAs(OutputType.FILE);
			
			File dest = new File(System.getProperty("user.dir") + "//Screenshots//" + testName + ".png");
		
			//step3: copy image file to destination
			FileUtils.copyFile(src, dest);
		}

}
