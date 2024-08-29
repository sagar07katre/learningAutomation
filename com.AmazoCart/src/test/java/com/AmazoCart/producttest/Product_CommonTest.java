package com.AmazoCart.producttest;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Product_CommonTest 
{

	@Test
	public void addProduct() {
		
		Reporter.log("Addproduct--Common-- Sucessfuly",true);
	}
	
	@Test
	public void updateProduct() {
		
		Reporter.log("Updateproduct--Common-- PRD Sucessfuly",true);
	}
	
	@Test
	public void deleteProduct() {
		
		Reporter.log("DeleteProduct--Common-- PRD Sucessfuly",true);
	}

}
