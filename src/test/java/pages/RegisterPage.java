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





}
