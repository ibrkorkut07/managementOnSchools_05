package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import utilities.Driver;

public class CommonCredentialsPage {

    public CommonCredentialsPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath ="//input[@id='name']")
    public WebElement name;
    @FindBy(xpath ="//input[@id='surname']")
    public WebElement surname;
    @FindBy(xpath ="//input[@id='birthPlace']")
    public WebElement birthPlace;
    @FindBy(xpath ="//input[@id='phoneNumber']")
    public WebElement phoneNumber;
    @FindBy(xpath ="(//input[@type='radio'])[1]")
    public WebElement genderFemale;
    @FindBy(xpath ="(//input[@type='radio'])[2]")
    public WebElement genderMale;
    @FindBy(xpath ="//input[@id='birthDay']")
    public WebElement dateOfBirth;
    @FindBy(xpath ="//input[@id='ssn']")
    public WebElement ssn;
    @FindBy(xpath ="//input[@id='username']")
    public WebElement username;

    @FindBy(xpath ="//input[@id='password']")
    public WebElement password;

    @FindBy(xpath ="//button[text()='Submit']")
    public WebElement submit;
    @FindBy(xpath = "//div[@role='alert']")
    public WebElement alert;








}
