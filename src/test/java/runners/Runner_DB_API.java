package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        glue = "stepdefinitions",
        features = "src/test/resources",
        dryRun = false,
        tags = "@US_06_API"
)
public class Runner_DB_API {


}
