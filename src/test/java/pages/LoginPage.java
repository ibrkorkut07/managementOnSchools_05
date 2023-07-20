package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    /*  -- sample --
    @FindBy(partialLinkText = "Login")
    public WebElement homeLoginLink;
     */
@FindBy(id="username")
    public WebElement userName;
@FindBy(id="password")
    public WebElement password;
@FindBy(xpath = "//*[@id=\"root\"]/div/main/div/div[1]/div/form/div[3]/button")
    public WebElement loginButton;



}
