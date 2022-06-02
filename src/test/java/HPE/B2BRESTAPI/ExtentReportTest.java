package HPE.B2BRESTAPI;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportTest {
	ExtentReports et;
	@BeforeTest
	public void init() {
		String path=System.getProperty("user.dir")+"\\reports\\index.html";
	
		ExtentHtmlReporter rep= new ExtentHtmlReporter(path);
		rep.config().setReportName("Web Automatoin Results");
		rep.config().setDocumentTitle("Test Results");
		
		 et= new ExtentReports();
		et.attachReporter(rep);
		et.setSystemInfo("Tester", "Sathish");
	}
	
	
	@Test
	void ExtentTest() {
		et.createTest("ExtentTest");
	Assert.assertTrue(true);
		et.flush();
	}

}
