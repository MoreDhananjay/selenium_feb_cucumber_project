package com.itview.testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features= {"FeatureFiles/calculatorModule.feature"},
		glue= {"com.itview.stepdefinition"},
		plugin= {"pretty","html:target/cucumber-report.html"},
		monochrome = true,
		tags="@Add"
		
		)

public class TestRunner {

}
