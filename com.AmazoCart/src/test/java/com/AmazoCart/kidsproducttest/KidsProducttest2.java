package com.AmazoCart.kidsproducttest;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class KidsProducttest2 
{

	@Test(invocationCount = 2,groups = "Integration")
	public void addProduct() {
		
		Reporter.log("Addproduct--Kids PRD Sucessfuly",true);
	}
	
	@Test(invocationCount = 2,groups = "Functionality")
	public void updateProduct() {
		
		Reporter.log("Updateproduct--Kids PRD Sucessfuly",true);
	}
	
	@Test(invocationCount = 2,groups = "Smoke")
	public void deleteProduct() {
		
		Reporter.log("DeleteProduct--Kids PRD Sucessfuly",true);
	}

}