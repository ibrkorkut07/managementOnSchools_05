package pages;

import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AddAdminPage {
    public AddAdminPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[.='Admin Management']")
    public WebElement AdminManagementButton;


    @FindBy(xpath = "//input[@id='name']")
    public WebElement NameBoxOnAddadmin;

    @FindBy(xpath = "//input[@id='surname']")
    public WebElement SurnameBoxOnAddadmin;

    @FindBy(xpath = "//input[@id='birthPlace']")
    public WebElement BirthPlaceBoxOnAddadmin;

    @FindBy(xpath = "//input[@value='MALE']")
    public WebElement GenderMaleBoxOnAddadmin;

    @FindBy(xpath = "//input[@id='birthDay']")
    public WebElement DateOfBirtBoxOnAddadmin;


    @FindBy(xpath = "//input[@id='phoneNumber']")
    public WebElement PhoneNumberOnBoxAddadmin;

    @FindBy(xpath = "//input[@id='ssn']")
    public WebElement SsnNumberBoxOnAddadmin;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement UserNameBoxOnaddadmin;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement PasswordBoxOnAddadmin;

    @FindBy(xpath = "//button[@class='fw-semibold btn btn-primary btn-lg']")
    public WebElement SubmitButtonOnAddadmin;




    @FindBy(xpath = "//button[@class='fw-semibold text-white bg-primary navbar-toggler collapsed']")
    public WebElement MenuTab;

    @FindBy(xpath = "//button[@class='fw-semibold btn btn-primary']")
    public WebElement LoginButtonToEnter;






}
