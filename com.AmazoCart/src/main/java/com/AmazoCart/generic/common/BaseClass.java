package com.AmazoCart.generic.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class BaseClass extends ObjectUtility{
	public static WebDriver driver = null;

	@DataProvider(name = "register")
	public Object[][] Registerdata() {
		Object[][] data = new Object[3][3];
		data[0][0] = "Sagar";
		data[0][1] = "sagar07katre@gmail.com";
		data[0][2] = "Testing";

		data[0][0] = "Aditya";
		data[0][1] = "aditya30@gmail.com";
		data[0][2] = "Developer";

		data[0][0] = "Rupesh";
		data[0][1] = "rupesh123@gmail.com";
		data[0][2] = "DevOps";

		return data;

	}

	@BeforeMethod
	public void login() {
		Reporter.log("Login Sucessful", true);
	}

	@AfterMethod
	public void Logout() {
		Reporter.log("Logout Sucessful", true);

	}

	@Parameters("browser")
	@BeforeClass
	public void browserSetup(String bname) {
		// Configure the Browser
		//System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver", "./src/main/resources/geckodriver.exe");
		//System.setProperty("webdriver.edge.driver", "./src/main/resources/msedgedriver.exe");

		// Using Scanner Class
		//Scanner sc = new Scanner(System.in);
		//System.out.println("Enter the Browser Name: ");
		//String bname = sc.next();

		// if User gives browsername="chrome"
		if (bname.equals("chrome")) {
			// Launch the Browser-Chrome
			driver = new ChromeDriver();
		}
		// if User gives browsername="firefox"
		else if (bname.equals("firefox")) {
			// Launch the Browser-Firefox
			driver = new FirefoxDriver();
		}
		// if User gives browsername="edge"
		else if (bname.equals("edge")) {
			// Launch the Browser-Edge
			driver = new EdgeDriver();
		} else {
			System.out.println("U have Enter the InValid Browser Name and Im Executing DefaultBrowser ");
			driver = new ChromeDriver();
		}
		
		//Crete object for all
		objectCreation();

		// Create Object for Property File
		//ReadPropertyFile p_ref = new ReadPropertyFile();

		// Fetch data
		String url = propertyobj.readData("url");
		//propertyobj.displaydata("url");
		//propertyobj.writeData("email", "sagar07katre@gmail.com");
		

		// Navigate to the Application via URL
		driver.get(url);
		Reporter.log("BrowserSetup Sucessful", true);

	}

	@AfterClass
	public void closebrowser() {
		// Close The Browser
		driver.close();
		Reporter.log("Closebrowser Sucessful", true);

	}

	@BeforeTest
	public void precondition() {
		Reporter.log("precondition Done Sucessful", true);

	}

	@AfterTest
	public void postcondition() {
		Reporter.log("postcondition Done Sucessful", true);

	}

	@BeforeSuite
	public void getSuiteConnections() {
		Reporter.log("Get SuiteConnections Done Sucessful", true);
	}

	@AfterSuite
	public void terminateSuiteconnection() {
		Reporter.log("Terminate Suiteconnection Done Sucessful", true);

	}

}