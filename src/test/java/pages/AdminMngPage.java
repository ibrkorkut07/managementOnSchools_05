package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AdminMngPage {

    public AdminMngPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    /*  -- sample --
    @FindBy(partialLinkText = "Login")
    public WebElement homeLoginLink;
     */

    @FindBy(xpath = "//button[@aria-controls='offcanvasNavbar-expand-false']")
    public WebElement menuLink;

    @FindBy(xpath = "//a[text()='Dean Management']")
    public WebElement deanManagementLink;

    @FindBy(xpath = "//a[.='Admin Management']")
    public WebElement adminManagementLink;


    @FindBy(xpath = "//button[text()='Submit']")
    public WebElement submitButton;

    @FindBy(xpath = "//input[@id='name']")
    public WebElement deanName;

    @FindBy(xpath = "//div[@role='alert']")
    public WebElement alert;


}
