package com.AmazoCart.kidsproducttest;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class KidsProducttest9 
{

	@Test(groups = "Integration")
	public void addProduct() {
		
		Reporter.log("Addproduct--Kids PRD Sucessfuly",true);
	}
	
	@Test(groups = "Functionality")
	public void updateProduct() {
		
		Reporter.log("Updateproduct--Kids PRD Sucessfuly",true);
	}
	
	@Test(groups = "Smoke")
	public void deleteProduct() {
		
		Reporter.log("DeleteProduct--Kids PRD Sucessfuly",true);
	}

}
