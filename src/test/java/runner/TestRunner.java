package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@CucumberOptions(
features = "src\\test\\resources\\Features", 
glue = "stepDefinition", 
dryRun = false, 
plugin = {
		"pretty", 
		"html:target/cucumber-reports/cucumber.html", 
		"json:target/cucumber-reports/cucumber.json" },
tags = "@Application")
@RunWith(Cucumber.class)
public class TestRunner {

}
