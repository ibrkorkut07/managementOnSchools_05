package pages.us14;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US14AdminHomePage {
    public US14AdminHomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div//h3[@class='fw-bold p-3 card-header']")
    public WebElement ActualAdminHomeTitle;

    @FindBy(xpath = "//button[@class='fw-semibold text-white bg-primary navbar-toggler collapsed']")
    public WebElement menuButton;

    @FindBy(xpath = "(//div[@class='offcanvas-title h5'])[2]")
    public WebElement ActualMainMenuTitle;

    @FindBy(xpath = "(//a[@class='nav-link'])[8]")
    public WebElement viceDeanManagementOption;

    @FindBy(xpath = "//h3[@class='fw-bold p-3 card-header']")
    public WebElement actualViceDeanManagementTitle;

    @FindBy(xpath = "//input[@id='name']")
    public WebElement nameInput;


    @FindBy(xpath = "//input[@id='surname']")
    public WebElement surnameInput;

    @FindBy(xpath = "//input[@id='birthPlace']")
    public WebElement birthPlaceInput;

    @FindBy(xpath = "(//input[@class='form-check-input'])[1]")
    public WebElement femaleCheckBox;

    @FindBy(xpath = "(//input[@class='form-check-input'])[2]")
    public WebElement maleCheckBox;

    @FindBy(xpath = "//input[@id='birthDay']")
    public WebElement birthDateInput;

    @FindBy(xpath = "//input[@id='phoneNumber']")
    public WebElement phoneNumberInput;

    @FindBy(xpath = "//input[@id='ssn']")
    public WebElement ssnInput;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement usernameInput;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordInput;

    @FindBy(xpath = "//button[@class='fw-semibold btn btn-primary btn-lg']")
    public WebElement submitButton;

    @FindBy(xpath = "//button[@class='fw-semibold text-white bg-primary navbar-toggler']")
    public WebElement menuButton2;


    @FindBy(xpath = "(//a[@class='nav-link'])[17]")
    public WebElement logOutOption;


    @FindBy(xpath = "//button[@class='btn btn-warning']")
    public WebElement yesButton;




}
