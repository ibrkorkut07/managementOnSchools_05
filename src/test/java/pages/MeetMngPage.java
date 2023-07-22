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

    @FindBy(xpath = "//div[@class=\" css-19bb58m\"]")
    public WebElement selectStudent;

    @FindBy(xpath = "//div[@aria-hidden='true']")
    public WebElement selectStudent2;
    //   //input[@id='react-select-2-input']
    //div[@aria-hidden='true']

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

     @FindBy(xpath = "//tbody/tr[1]/td[1]")
    public List<WebElement> allDate;
    
    @FindBy(xpath = "//tbody/tr[1]/td[2]")
    public List<WebElement> allStartTime;
    
    @FindBy(xpath = "//tbody/tr[1]/td[3]")
    public List<WebElement> allStopTime;
    
    @FindBy(xpath = "//tbody/tr[1]/td[4]")
    public List<WebElement> allDescription;

}
