package cucumbermap;

import java.util.Hashtable;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.HTMLReportGenerator;
import utility.SeleniumOperations;

public class Login 
{

	@Given ("^user launches browser by providing \"(.*)\" and \"(.*)\"$")
	public void bLaunch(String key,String value)
	{
	//launch browser
		Object [] input1=new Object[2];
		input1[0]=key;
		input1[1]=value;
	Hashtable<String, Object> output1= SeleniumOperations.browserLaunch(input1);
	HTMLReportGenerator.StepDetails(output1.get("STATUS").toString(), "^user launches browser by providing \"(.*)\" and \"(.*)\"$", output1.get("MESSAGE").toString());
	}
	@Given("user opens application by using {string}")
	public void user_opens_application_by_using(String string) 
	{
		//open Application
		Object [] input2=new Object[1];
		input2[0]=string;
		Hashtable<String, Object> output2= SeleniumOperations.openApplication(input2);		
		HTMLReportGenerator.StepDetails(output2.get("STATUS").toString(), "user opens application by using {string}", output2.get("MESSAGE").toString());
	}

	@When("user click on register.")
	public void user_click_on_register() 
	{
		//click on register
		Object [] input3=new Object[1];
		input3[0]="//*[text()='REGISTER']";
		Hashtable<String, Object> output3= SeleniumOperations.clickable(input3);
		HTMLReportGenerator.StepDetails(output3.get("STATUS").toString(), "user click on register.", output3.get("MESSAGE").toString());
	}

	@When("user enters first name as {string}")
	public void user_enters_first_name_as(String string) 
	{
		//enter first name
		//enter first name
		Object [] input4=new Object[2];
		input4[0]="//*[@name='firstName']";
		input4[1]=string;
		Hashtable<String, Object> output4= SeleniumOperations.sendText(input4);
		HTMLReportGenerator.StepDetails(output4.get("STATUS").toString(), "user enters first name as {string}", output4.get("MESSAGE").toString());
	}

	@When("user enters last name as {string}")
	public void user_enters_last_name_as(String string) 
	{
		//enter last name
		Object [] input5=new Object[2];
		input5[0]="//*[@name='lastName']";
		input5[1]=string;
		Hashtable<String, Object> output5= SeleniumOperations.sendText(input5);
		HTMLReportGenerator.StepDetails(output5.get("STATUS").toString(), "user enters last name as {string}", output5.get("MESSAGE").toString());
	}

	@When("user enters phone numer as {string}")
	public void user_enters_phone_numer_as(String string) 
	{
		//enter phone number
		Object [] input6=new Object[2];
		input6[0]="//*[@name='phone']";
		input6[1]=string;
		Hashtable<String, Object> output6= SeleniumOperations.sendText(input6);
		HTMLReportGenerator.StepDetails(output6.get("STATUS").toString(), "user enters phone numer as {string}", output6.get("MESSAGE").toString());
	}

	@When("user enters email address as {string}")
	public void user_enters_email_address_as(String string) 
	{
		//enter email address
		Object [] input7=new Object[2];
		input7[0]="//*[@id='userName']";
		input7[1]=string;
		Hashtable<String, Object> output7= SeleniumOperations.sendText(input7);
		HTMLReportGenerator.StepDetails(output7.get("STATUS").toString(), "user enters email address as {string}", output7.get("MESSAGE").toString());
	}

	@When("user selects country of living")
	public void user_selects_country_of_living() 
	{
		//select country
		Object [] input8=new Object[1];
		input8[0]="//*[@name='country']";
		Hashtable<String, Object> output8= SeleniumOperations.select(input8);
		HTMLReportGenerator.StepDetails(output8.get("STATUS").toString(), "user selects country of living", output8.get("MESSAGE").toString());
	}

	@When("user click on submit button")
	public void user_click_on_submit_button() 
	{
		//click on submit
		Object [] input9=new Object[1];
		input9[0]="//*[@type='submit']";
		Hashtable<String, Object> output9= SeleniumOperations.clickable(input9);
		HTMLReportGenerator.StepDetails(output9.get("STATUS").toString(), "user click on submit button", output9.get("MESSAGE").toString());
	}

	@Then("application shows User Registration is successfull")
	public void application_shows_user_registration_is_successfull() 
	{
		Object [] input10=new Object[2];
		input10[0]="Note: Your user name is .";
		input10[1]="//*[text()=' Note: Your user name is .']";
		Hashtable<String, Object> output10= SeleniumOperations.validation(input10);
		HTMLReportGenerator.StepDetails(output10.get("STATUS").toString(), "application shows User Registration is successfull", output10.get("MESSAGE").toString());
	}
	
}
