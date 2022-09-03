package com.runable;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features",
		glue="com.Steps",
		//plugin= {"pretty","html:target/site/cucumber-pretty/","json:target/cucumber/cucumber-report.json"},
				 plugin = {
	                        "pretty",
	                        "json:target/cucumber.json",
	                        "html:target/cucumber-html-reports/index.html"},
		tags="@homepage",
		monochrome = true
		)
public class Runner {

}
