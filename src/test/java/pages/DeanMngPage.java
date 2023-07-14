package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.*;
import utilities.Driver;

public class DeanMngPage {

    public DeanMngPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "(//*[@class='card-body'])[2]")
    public WebElement deanList;
    @FindBy(xpath = "//table//tr[1]//td[1]")
    public WebElement firstName;

    @FindBy(xpath = "(//button[@class='text-dark btn btn-outline-info'])[1]")
    public WebElement editButton;


    @FindBy(xpath = "//div[@role='dialog']//div[1]//div[1]//input[1]")
    public WebElement firstNameToUpdate;



    @FindBy(xpath = "//div[@class='text-center border border-3 card border-warning']//input[@id='password']")
    public WebElement passwordBox;

    @FindBy(xpath = "//div[@class='modal-footer']/button[@class='fw-semibold btn btn-primary btn-lg']")
    public WebElement submitButtonOnEditDean;

    @FindBy(xpath = "//div[@class='text-center border border-3 card border-warning']//input[@value='MALE']")
    public WebElement maleButtonOnEditDean;


    @FindBy(xpath = "(//*[@class='card-body'])[2]")
    public WebElement firstNameonDeanList;

    @FindBy(xpath = "//td[2]")
    public WebElement firstGenderOnDeanList;

    @FindBy(xpath = "//td[3]")
    public WebElement firstPhoneNumberOnDeanList;

    @FindBy(xpath = "//td[4]")
    public WebElement firstSsnOnDeanList;

    @FindBy(xpath = "//td[5]")
    public WebElement firstUserNameOnDeanList;






}
