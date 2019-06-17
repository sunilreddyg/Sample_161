package extent_reports;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentFeatures 
{

	public static void main(String[] args) {
	
		
		String filepath="C:\\Users\\Administrator\\git\\21st_Jan_6PM\\SBI_Insurance\\src\\Reports\\MyReports.html";
		ExtentReports reports=new ExtentReports(filepath, true);
		
		ExtentTest test=reports.startTest("Test Login", "Login with invalid data")
				.assignCategory("regression")
				.assignAuthor("Rajesh");
		
		test.log(LogStatus.INFO, "Login Successfull");
		reports.endTest(test);
		
		
		//Add child test
		
		ExtentTest parent = reports.startTest("Parent").assignCategory("regression");

		ExtentTest child1 = reports.startTest("Child 1");
		child1.log(LogStatus.INFO, "Info");

		ExtentTest child2 = reports.startTest("Child 2");
		child2.log(LogStatus.PASS, "Pass");

		parent.appendChild(child1).appendChild(child2);
		    
		reports.endTest(parent);
		
		reports.flush();
	}

}
