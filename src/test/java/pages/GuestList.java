package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import utilities.Driver;

public class GuestList {
    public GuestList(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[text()='Guest User']")
    public WebElement guestuserlink;

    @FindBy(xpath = "//h5[text()='Guest User List']")
    public WebElement guestlisttext;

    @FindBy(xpath = "//th[text()='User Name']")
    public WebElement Usernametext;

    @FindBy(xpath = "(//a[@class='page-link'])[3]")
    public WebElement Secondpage;

}
