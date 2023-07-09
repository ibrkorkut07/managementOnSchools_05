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

    @FindBy(xpath = "//input[@id='surname']")
    public WebElement surnameBox;

    @FindBy(xpath = "//input[@id='birthPlace']")
    public WebElement birthplaceBox;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[1]")
    public WebElement nameBoxRequiredText;

    @FindBy(xpath = "//div[@class='page justify-content-center align-items-center']")
    public WebElement outOfAnyBox;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[2]")
    public WebElement surnameBoxRequiredText;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[3]")
    public WebElement birthplaceBoxRequiredText;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[4]")
    public WebElement phoneBoxRequiredText;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[5]")
    public WebElement dateofbirthBoxRequiredText;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[6]")
    public WebElement ssnBoxRequiredText;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[7]")
    public WebElement usernameBoxRequiredText;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[8]")
    public WebElement passwordBoxRequiredText;

    @FindBy(xpath = "(//button[@type='button'])[3]")
    public WebElement registerBox;

    @FindBy(xpath = "//input[@value='FEMALE']")
    public WebElement femaleRadioButton;

    @FindBy(xpath = "//input[@value='MALE']")
    public WebElement maleRadioButton;

    @FindBy(xpath = "//input[@placeholder='username']")
    public WebElement usernameBox;

    @FindBy(xpath = "//input[@placeholder='Password']")
    public WebElement passwordBox;

    @FindBy(linkText="Minimum 8 character")
    public WebElement minimum8CharacterText;

    @FindBy(id = "phoneNumber")
    public WebElement phoneBox;

    @FindBy(linkText = "Minimum 12 character (XXX-XXX-XXXX)")
    public WebElement minimum12CharacterText;

    @FindBy(id = "birthDay")
    public WebElement birthdayBox;

    @FindBy(id = "ssn")
    public WebElement ssnBox;






}
