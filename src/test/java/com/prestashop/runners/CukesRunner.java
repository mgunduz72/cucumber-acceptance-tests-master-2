package com.prestashop.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class) //When we run this it will not find the feature file, we need to explicitly say it, we do this by using
@CucumberOptions(        // @CucumberOptions(), inside this we basically, say open this file
	plugin = {"pretty", 
			 "html:target/default-cucumber-reports",
			 "json:target/cucumber.json" 
	          },
	
	tags = "@temp",  // We can also add multiple tags here by using comma "regression","@temp", 
	features= {"src/test/resources/com/prestashop/features",	// We can also right click on the features file and get the directory
			    "src/test/resources/com/ct_bnb/features"},      // and paste it here, we need to erase the project info before pasting
	glue = {"com/prestashop/step_definitions",  // We copied the package directory. glue will implement the test that we have in cucumber, If we
	        "com/ctbnb/step_definitions"}
//	,dryRun = false
	// hide it, it will not access the expected code inside HomePageStepDef  class. 
			         //When I uncomment dryRun line, or make it false is the same thing. It will give the suggested implemented steps without running tests.
		)    //if we make dryRun=true, it will not execute step definitions, it will only print the suggested step definitions, then we can handle them first and 
//then run again, but if we make it false, this tiime it will execute all step definitions along with suggested step implementations. 

// Again RunsWith come with junit and CucumberOptions comes from cucumber and we need to do this only once, the we can add other 
// things
public class CukesRunner {// What cucumber does, which ever language we use cucumber will not complain, cucumber will take each text and
	// call the certain in the background, for each line in feature file, cucumber will call the step definition from java which matches with 
	// certain methods. For every line cucumber will generate step definition. Every time we add a new line to feature file, cucumber will add a step
	// definition. Then when we get this step definitions to a java it will match with a certain method. 
	// Note: When we run it the report is generated by CUCUMBER. 

}
