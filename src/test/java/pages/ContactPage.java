package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ContactPage {

    public ContactPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    /*  -- sample --
    @FindBy(partialLinkText = "Login")
    public WebElement homeLoginLink;
     */

    @FindBy(xpath ="//a[.='Contact']")
    public WebElement contact;

    @FindBy(xpath = "//input[@id='name']")
    public WebElement name;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement email;

    @FindBy(xpath ="//input[@id='subject']")
    public WebElement subject;

    @FindBy(xpath ="//textarea[@id='message']")
    public WebElement message;

    @FindBy(xpath ="//button[@class='fw-semibold btn btn-primary']")
    public WebElement send_message;


    public static void click() {
    }

    public void name(String s) {
    }
}
