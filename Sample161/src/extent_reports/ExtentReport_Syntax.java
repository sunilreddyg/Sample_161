package extent_reports;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReport_Syntax 
{

	public static void main(String[] args)
	{
		
		//Location of file
		String filepath="C:\\Users\\Administrator\\git\\28th_Mar_9AM_161\\Project_161\\reports\\";
		//Create object for Extent reports
		ExtentReports reports=new ExtentReports(filepath+"MyExetentReports.html", true);
		
		//Create Test
		ExtentTest test1=reports.startTest("Tc001_verify_login_valid");
			test1.log(LogStatus.INFO, "Launch Browser successfull");
			test1.log(LogStatus.SKIP, "Test skipped because pre-condition failed");
			test1.log(LogStatus.PASS, "Expecte result dispalyed");
			test1.log(LogStatus.FATAL, "test suspended");
		reports.endTest(test1);
		
		
		//Create Test
		ExtentTest test2=reports.startTest("Tc002_verify_login_invalid");
			test2.log(LogStatus.INFO, "I informed");
			test2.log(LogStatus.PASS, "I passed");
		reports.endTest(test2);
		
	    
	    //Create Test
	  	ExtentTest test3=reports.startTest("Tc003_verify_login_Blank");		
		  	test3.log(LogStatus.INFO, "I informed");
			test3.log(LogStatus.FAIL, "I Failed");		
		reports.endTest(test3);
	  		
		
		test1.appendChild(test2).appendChild(test3);
		
		//Write File
		reports.flush();
	}

}
