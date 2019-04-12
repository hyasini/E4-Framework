package com.bookit.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		tags = {"@account"},
		features = "src/test/resources/com/features",
		glue = "com/bookit/step_definitions",  //make sure the file path is as short as possible otherwise it does not recognize it
		monochrome = true,						//it removes extra characters at the console
		dryRun = false,	  					// when you want to run the file just to confirm all the cucumber steps have step definitions. 

		
	plugin = { "json:target/cucumber.json"} // for reports
//
//		// to run reports choose the main framework, right click on it, choose refresh (F5), then click on target, choose your report
	)
	

		
		

public class CukesRunner {

}
