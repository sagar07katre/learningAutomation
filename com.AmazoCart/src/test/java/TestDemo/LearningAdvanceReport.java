package TestDemo;

public class LearningAdvanceReport {

	public static void main(String[] args) {
		
		//Create report for sparkreport
		ExtentSparkReporter	spark = new ExtentSparkReporter("./AdvanceReports/report.html");
		
		//Configure the Spark Report Information
		 spark.config.setDocumentTitle("Regression testing for the register page");
		 spark.config.setReportName("RegressionSuite");
		 spark.config.setTheme(Theme.DARK);
		 
		 //crete the Extent Report
		 ExtentReports report = new ExtentReports();
		 
		 //by Attaching
		 report.attachReporter(spark);
		 
		 //Configure the System Information in Extent Report
		 
		 report.setSystemInfo("DeviceName:","Harry");
		 report.setSystemInfo("OperatingSystem:","WINDOWS 11");
		 report.setSystemInfo("Browser:","Chrome");
		 report.setSystemInfo("BrowserVersion:","chrome-127.0.6533.120");
		 
		 //Create the TestInformation
		 ExtentTest test = report.createTest("RegressionTest");
		 
		 //Step Information
		 test.log(Status.INFO,"Step1:Launching the browser sucessfull");
		 
		 test.log(Status.INFO,"Step2:Navigationg to application via URL Sucessfull");
		 
		 test.log(Status.INFO,"Step3:Verified the Webpage sucessfull");
		 
		 test.log(Status.INFO,"Step4:Verified the WebElement sucessfull");
		 
		 if (true == true) {
			 test.log(Status.PASS,"Step4:Verified the WebElement Displayed");
		} else {
			test.log(Status.FAIL,"Step4:Verified the WebElement is not Displayed");
			//test.addScreenCaptureFromBase64String(null,"screenshot Taken--Element Not Displayed");
		}
		 
		 
		 test.log(Status.SKIP,"Step5:Element is Hidden");
		 
		 //flush the Report Information
		 report.flush();
	}

}
