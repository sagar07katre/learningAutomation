package com.AmazoCart.generic.listnerutility;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listeners implements ITestListener {
	TakesScreenshot driver;
	public void onTestStart(ITestResult result) {
		
	}

	public void onTestSuccess(ITestResult result) {
		
	}

	public void onTestFailure(ITestResult result) {
		String name = result.getName();
		
		Reporter.log("Taking Screenshot --Start--"+name, true);
		
		//Perform Typecasting Webdriver to Takescreenshot
		TakesScreenshot taref = (TakesScreenshot) driver;
		
		//Call the Screenshot method and save in Temp path 
		File temp = taref.getScreenshotAs(OutputType.FILE);
		
		//Create a Permanent Path and Save it
		File permanent = new File("./src/test/resources/Screenshot/"+name+".png");
		
		//Copy the File from Temp to Permanent
		try {
			FileUtils.copyFile(temp, permanent);
		} catch (IOException e) {
			e.printStackTrace();
		}
		Reporter.log("Taking Screenshot --Completed--"+name,true);
	}
	
	public void onTestSkipped(ITestResult result) {
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	public void onStart(ITestContext context) {
		
	}

	public void onFinish(ITestContext context) {
		
	}

	

}
