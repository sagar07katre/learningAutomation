package com.AmazoCart.kidsproducttest;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class KidsProducttest1 
{

	@Test(priority = 1, invocationCount = 2, groups = "Integration")
	public void addProduct() {
		
		Reporter.log("Addproduct--Kids PRD Sucessfuly",true);
	}
	
	@Test(priority = 2, dependsOnMethods = "addProduct", groups = "Functionality")
	public void updateProduct() {
		
		Reporter.log("Updateproduct--Kids PRD Sucessfuly",true);
	}
	
	@Test(priority = 3, dependsOnMethods = "addProduct", enabled = false , groups = "Smoke")
	public void deleteProduct() {
		
		Reporter.log("DeleteProduct--Kids PRD Sucessfuly",true);
	}

}
