package org.runnerfiles;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/",
		glue = "org.stepdefinitions", 
		plugin = { "html:target/html_report", "json:target/json_report/result.json", "usage:target/usage_report/result.json",
		"junit:target/jUnit_XML/result.xml" }, 
		monochrome = false, 
		dryRun = false, 
		strict = true)

public class TestRunner {

}
