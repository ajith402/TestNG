package com.testNg.Programs;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener						
{		
	public void onStart(ITestContext context)    {

		System.out.println("Start: "+context.getName());
	}
	
	public void onFinish(ITestContext context)  { 
		System.out.println("Finish: "+context.getName());
	}


	public void onTestStart(ITestResult result) {
	
		System.out.println("On Test Start: "+result.getName());
	}
	
	
	public void onTestSuccess(ITestResult result) {
		System.out.println("On Test Success: "+result.getName());
     
	}
	
	public void onTestFailure(ITestResult result) {
		
		System.out.println("Failed Test Case: "+ result.getName());
		
		
	}
	
	public void onTestSkipped(ITestResult result) {
		
		System.out.println("Skipped Test Case: "+ result.getName());
	}
	
	
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	public void onTestFailedWithTimeout(ITestResult result)  { 
		
	}

   
}	