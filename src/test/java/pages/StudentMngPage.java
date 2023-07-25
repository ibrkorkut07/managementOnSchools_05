package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class StudentMngPage {

    public StudentMngPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
//    /*  -- sample --
//    @FindBy(partialLinkText = "Login")
//    public WebElement homeLoginLink;
//     */


