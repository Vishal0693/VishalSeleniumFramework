package com.mystore.utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.mystore.testcases.BaseClass;
import com.mystore.testcases.ExtentReporterNG;

public class Listeners extends BaseClass implements ITestListener {
	ExtentTest test;
	ExtentReports extent = ExtentReporterNG.getReportObject();

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		test = extent.createTest(result.getMethod(). getMethodName());
	}
@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	//System.out.println("I successfully executed Listeners Pass code");
	test.log(Status.PASS, "test is pass");
	}
@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		//screenshot code 
		//response if API is failed
		
		//System.out.println("I failed executed Listeners Pass code" +result.getName());
		test.log(Status.FAIL, "test is FAILS");
	}

@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}
@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}
@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		extent.flush();
	}

	
	
	
}
