package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ChooseLessonMngPage {

    public ChooseLessonMngPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    /*  -- sample --
    @FindBy(partialLinkText = "Login")
    public WebElement homeLoginLink;
     */




}
