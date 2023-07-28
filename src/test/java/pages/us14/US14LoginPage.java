package pages.us14;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US14LoginPage {
    public US14LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div//button[@class='fw-semibold btn btn-primary']")
    public WebElement loginButton;

    @FindBy(partialLinkText = "Login")
    public WebElement homeLoginLink;


}
