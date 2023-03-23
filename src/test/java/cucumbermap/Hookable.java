package cucumbermap;

import java.net.UnknownHostException;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utility.HTMLReportGenerator;

public class Hookable 
{
	@Before
	public void before(Scenario scenario) throws UnknownHostException
	{
		HTMLReportGenerator.TestSuiteStart("D:\\Automation Support\\Reports\\Mercury_Tours.html", "Mercury_Tours");
		HTMLReportGenerator.TestCaseStart(scenario.getName(), scenario.getId());
		System.out.println("-------------Test Scenario Starts---------------");
	}
	
	@After
	public void after()
	{
		System.out.println("-------------Test Scenario Ends---------------");
		HTMLReportGenerator.TestCaseEnd();
		HTMLReportGenerator.TestSuiteEnd();
	}
}
