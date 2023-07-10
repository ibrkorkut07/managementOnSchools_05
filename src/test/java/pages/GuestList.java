package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GuestList {

    @FindBy(xpath = "//a[text()='Guest User']")
    public WebElement guestuserlink;

    @FindBy(xpath = "//h5[text()='Guest User List']")
    public WebElement guestlisttext;


}
