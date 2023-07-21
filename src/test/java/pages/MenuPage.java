package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MenuPage {

    public MenuPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//button[@class='fw-semibold text-white bg-primary navbar-toggler collapsed']")
    public WebElement menuButton;
    @FindBy(xpath = "//a[.='Meet Management']")
    public WebElement meetManagement;


    @FindBy(xpath = "(//a[@role='button'])[12]")
    public WebElement viceDeanManagement;


}
