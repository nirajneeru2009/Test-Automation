package cucumber.maven;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import cucumber.api.CucumberOptions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.*;

@RunWith(Cucumber.class)
@CucumberOptions(plugin="pretty",features="src/test/java/cucumber.maven",glue="stepdefinition")
public class TestRunner {
	
	WebDriver driver;
	@Given("Open the Firefox and launch the application")
	public void createWebDriver()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.close();
		
	}
	@When("Enter the Username and Password")
	public void enterCredentials()
	{
		System.out.println("Entered");
	}
	@Then("Reset the credential")
	
	public void verify()
	{
		System.out.println("The system is verified");
		
	}
	@Test
	public void logReport()
	{
		ExtentReports reports=new ExtentReports();
		ExtentTest tests;
		tests=reports.createTest("logReport");
	}
	
}
