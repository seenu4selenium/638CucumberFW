package ruuner;


import io.cucumber.testng.CucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features = "./src/test/resources/Features/FBLoginNew.feature",
		glue = "stepdefinitions",
		plugin = {"pretty", "html:target/cucumber-reports" },
		monochrome = true
		)
public class RunTestNGTest extends AbstractTestNGCucumberTests {

}