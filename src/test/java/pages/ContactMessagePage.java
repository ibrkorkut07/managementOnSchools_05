package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
public class ContactMessagePage {

    public ContactMessagePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//table/thead/tr/th[1]")
    public WebElement name;

    @FindBy(xpath = "//table/thead/tr/th[2]")
    public WebElement email;

    @FindBy(xpath = "//table/thead/tr/th[3]")
    public WebElement date;

    @FindBy(xpath = "//table/thead/tr/th[4]")
    public WebElement subject;

    @FindBy(xpath = "//table/thead/tr/th[5]")
    public WebElement message;

    @FindBy(id = "Delete")
    public WebElement deleteButton;

    @FindBy(xpath = "//table/tbody/tr/td")
    public WebElement nameFirstCreated;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement loginUserName;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement loginPassword;


}


