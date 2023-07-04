package stepdefinitions;

import io.cucumber.java.en.Given;
import utilities.ConfigReader;
import utilities.Driver;

public class YSA_stepDefs {
    @Given("YSA navigates to homepage")
    public void ysaNavigatesToHomepage() {
      //  Driver.getDriver().get(ConfigReader.getProperty("MosUrl"));
        Driver.getDriver().get("https://managementonschools.com");

    }
}
