package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import utilities.Driver;

public class RegisterPage {

    public RegisterPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//button[text()='Register']")
    public WebElement registerBlue;

    @FindBy(xpath = "//a[@class='header_link me-2']")
    public WebElement registerLink;

    @FindBy(xpath = "//input[@id='name']")
    public WebElement nameBox;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[1]")
    public WebElement nameBoxRequiredText;

    @FindBy(xpath = "//div[@class='page justify-content-center align-items-center']")
    public WebElement outOfAnyBox;








}
