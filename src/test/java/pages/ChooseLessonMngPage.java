package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import utilities.Driver;

public class ChooseLessonMngPage {

    public ChooseLessonMngPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    /*  -- sample --
    @FindBy(partialLinkText = "Login")
    public WebElement homeLoginLink;
     */

    @FindBy(xpath = "(//button[@type='button'])[3]")
    public WebElement LoginButton;

    @FindBy(xpath = "(//a[@tabindex='0'])[6]")
    public WebElement StudentChooseLessonButton;

    @FindBy(xpath = "(//thead//tr//th)[3]")
    public WebElement teacherListTitle;

    @FindBy(xpath = "(//thead//tr//th)[4]")
    public WebElement dayListTitle;

    @FindBy(xpath = "(//thead//tr//th)[5]")
    public WebElement starttimeListTitle;

    @FindBy(xpath = "(//thead//tr//th)[6]")
    public WebElement stoptimeListTitle;

    @FindBy(xpath = "//div[@id='root']")
    public WebElement chooseLessonpage;

    @FindBy(xpath = "//input[@value='1222']")
    public WebElement mondayJavaCheckbox;

    @FindBy(xpath = "//input[@value='6']")
    public WebElement mondayCalculusCheckbox;

    @FindBy(xpath = "(//button[@type='button'])[5]")
    public WebElement chosenLessonSubmitButton;

    @FindBy(xpath = "(//h5[@class='fw-bold p-3 card-header'])[2]")
    public WebElement chosenLessonprogramListTitle;

    @FindBy(xpath = "//input[@value='4']")
    public WebElement thursdayPythonCheckbox;

    @FindBy(xpath = "(((//table)[1]//tbody//tr)[1]//td)[2]")
    public WebElement getFirstChosenLessonWebelement;

    @FindBy(xpath = "(((//table)[1]//tbody//tr)[1]//td)[4]")
    public WebElement getFirstChosenDayWebelement;

    @FindBy(xpath = "(((//table)[1]//tbody//tr)[1]//td)[5]")
    public WebElement getFirstChosenStarttimeWebelement;

    @FindBy(xpath = "(((//table)[1]//tbody//tr)[1]//td)[6]")
    public WebElement getFirstChosenStoptimeWebelement;

    @FindBy(xpath = "(((//table)[2]//tbody//tr)[1]//td)[1]")
    public WebElement getFirstRegisteredLessonWebelement;

    @FindBy(xpath = "(((//table)[2]//tbody//tr)[1]//td)[2]")
    public WebElement getFirstRegisteredDayWebelement;

    @FindBy(xpath = "(((//table)[2]//tbody//tr)[1]//td)[3]")
    public WebElement getFirstRegisteredStarttimeWebelement;

    @FindBy(xpath = "(((//table)[2]//tbody//tr)[1]//td)[4]")
    public WebElement getFirstRegisteredStoptimeWebelement;

    @FindBy(xpath = "((//table)[2]//tbody//tr)[1]")
    public WebElement firstCRegisteredLessonWebelement;

    @FindBy(xpath = "(//tbody[@class='table-group-divider'])[2]")
    public WebElement lessonProgramListTableBody;

    @FindBy(xpath = "(//a[@tabindex='0'])[7]")
    public WebElement StudentGradesAndAnnouncementButton;

    @FindBy(xpath = "((//tbody)[1]//tr//td)[3]")
    public WebElement StudentMidtermExamGrade;

    @FindBy(xpath = "((//tbody)[1]//tr//td)[4]")
    public WebElement StudentFinalExamGrade;

    @FindBy(xpath = "((//tbody)[2]//tr)[1]")
    public WebElement StudentMeetListFirstMeet;



}
