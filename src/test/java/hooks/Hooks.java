package hooks;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

public class Hooks {
    /*
    HOOKS : is used to run BEFORE or AFTER each SCENARIO or SCENARIO OUTLINE
     */
    @Before
    public void setUpScenario(){
      //  RUNS BEFORE EACH SCENARIO
       //System.out.println("BEFORE METHODS");
    }
    @After
    public void tearDown(Scenario scenario){
//        AFTER EACH SCENARIO
        //System.out.println("AFTER METHOD");

        if (scenario.isFailed()) { // attach the report only if a scenario fails
            final byte[] screenshot=((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png","screenshots");
           // Driver.closeDriver();
        }
    }
}
