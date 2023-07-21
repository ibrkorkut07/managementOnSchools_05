package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MeetMngPage {

    public MeetMngPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[@class=\" css-19bb58m\"]")
    public WebElement selectStudent;

    @FindBy(xpath = "//input[@id=\"date\"]")
    public WebElement dateOfMeet;

    @FindBy(xpath = "id=\"startTime\"")
    public WebElement startTime;
    @FindBy(xpath = "id=\"stopTime\"")
    public WebElement stopTime;

    @FindBy(xpath = "id=\"description\"")
    public WebElement description;

    @FindBy(xpath = "//button[@class='fw-semibold btn btn-primary btn-lg']")
    public WebElement submit;




}
