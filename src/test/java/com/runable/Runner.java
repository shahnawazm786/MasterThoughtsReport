package com.runable;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features",
		glue="com.Steps",
		plugin= {"pretty","html:target/site/cucumber-pretty.html","json:target/cucumber/cucumber.json"},
		tags="@homepage",
		monochrome = true
		)
public class Runner {

}
