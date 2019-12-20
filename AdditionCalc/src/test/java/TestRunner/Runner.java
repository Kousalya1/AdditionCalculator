package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Features", glue = "StepDefinitions", 
tags = "@Test", 
plugin = {
		"html:target/cucumber-html-report", "pretty:target/cucumber-pretty.txt" })
//plugin= "pretty")
public class Runner {

}
