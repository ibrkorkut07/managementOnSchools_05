package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class MeetMngPage {

    public MeetMngPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@id='react-select-2-input']")
    public WebElement selectStudent;

    @FindBy(id="date")
    public WebElement dateOfMeet;


    @FindBy(id = "startTime")
    public WebElement startTime;

    @FindBy(id = "stopTime")
    public WebElement stopTime;

    @FindBy(id = "description")
    public WebElement description;

    @FindBy(xpath = "//button[@class='fw-semibold btn btn-primary btn-lg']")
    public WebElement submit;

    @FindBy(xpath = "//div[.='Meet Saved Successfully']")
    public WebElement successAlertMessage;

    @FindBy(xpath = "//tbody/tr[1]/td[1]")
    public List<WebElement> allDate;

    @FindBy(xpath = "//tbody/tr[1]/td[2]")
    public List<WebElement> allStartTime;

    @FindBy(xpath = "//tbody/tr[1]/td[3]")
    public List<WebElement> allStopTime;

    @FindBy(xpath = "//tbody/tr[1]/td[4]")
    public List<WebElement> allDescription;
    @FindBy(xpath = "//tbody/tr[1]/td[5]/span[1]/button[1]")
    public WebElement updateButton;
    @FindBy(xpath = "/html/body/div[4]/div/div/div[2]/div[1]/div/div/form/div/div[1]/div/div/div[1]/div[2]")
    public WebElement childSelectStudent;
    @FindBy(id = "date")
    public WebElement childDate;
    @FindBy(id = "startTime")
    public WebElement childStartTime;
    @FindBy(id = "stopTime")
    public WebElement childStopTime;
    @FindBy(id = "description")
    public WebElement childDescription;
    @FindBy(xpath = "/html/body/div[4]/div/div/div[2]/div[2]/button")
    public WebElement childSubmit;

}
