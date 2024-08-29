package com.AmazoCart.registertest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.AmazoCart.generic.common.BaseClass;


//@Listeners(com.AmazoCart.generic.listnerutility.Listeners.class)
public class RegisterTest extends BaseClass {
	
	@Test(enabled = false)
	public void createUser_validData() 
	{
		Assert.fail();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//Verify  Page Using Assert
		String exp_title = "LEarning WEB TECHNOLOGY FORMS";
		String act_title = driver.getTitle();
		System.out.println(act_title);
		Assert.assertEquals(act_title, exp_title);
		
		
		
		//Create Object for RegisterPage
		//Registerpage regpage = new Registerpage(driver);
		
		// Step1:Clear the Name in The Name TextField
		//regpage.getName().clear();
		
		WebElement ele = driver.findElement(By.id("name"));
		ele.clear();
		
		//Create an Object for ExcelUtilityFile class
		ReadExcelFile excel_f = new ReadExcelFile();
		
		//Step 2: write the Name in the Name Text Field
		//ele.sendKeys(excel_f.readdata("student", 1, 1));
		
		//Step3:Display the Email
		System.out.println(excel_f.readdata("student", 1, 2));	
		
		//Step4:Write the Data
		//excel_f.writedata("student", 2, 1,"Himanshu");
		excel_f.writedata("Sheet1", 10, 1,"Himanshu");
		Reporter.log("createUser_validData for Register Test", true);
		
		//Execution Completed Message
		//Reporter.log("createUser_validData for Register Test", true);
	}


	@Test(dataProvider = "register")
	public void createUser_invalidData(String name, int id, String dept) {
		
		//Step 1: identify name textfield and enter data
		driver.findElement(null);
		
		
		//String name = data[0][0];
		//String id = data[0][1];
		//String dept = data[0][2];
		
		System.out.println("Name :"+name);
		System.out.println("Id :"+id);
		System.out.println("Dept :"+dept);
		
		Reporter.log("createUser_InvalidData for Register Test", true);
	}

}
