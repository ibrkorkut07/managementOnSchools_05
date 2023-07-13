package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                //"pretty",
                //"html:target/html-reports/cucumber.html",
                //"json:target/json-reports/cucumber.json",
                //"junit:target/xml-reports/cucumber.xml",
                //"rerun:target/failed_scenarios.txt",
                //"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
        },
        monochrome = true,

        features = "./src/test/resources/features",//PATH OF FEATURES FOLDER
        glue = {"stepdefinitions","hooks"}, //PATH OF STEPDEFINITIONS FOLDER
        dryRun = false , //dryRun = true : RUNS AND GENERATES ONLY MISSING STEP DEFS.
        // dryRun = false: RUN NORMAL. THIS IS DEFAULT VALUE




        tags = "@US02"


)

public class Runner {
}