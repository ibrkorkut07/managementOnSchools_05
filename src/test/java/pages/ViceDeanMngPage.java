package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ViceDeanMngPage {

    public ViceDeanMngPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    /*  -- sample --
    @FindBy(partialLinkText = "Login")
    public WebElement homeLoginLink;
     */
    @FindBy(xpath = "//button[.='Menu']")
    public WebElement menuButton;
    @FindBy(xpath = "//a[.='Lesson Management']")
    public WebElement lessonManagementLink;
    @FindBy(xpath = "//a[.='Teacher Management']")
    public WebElement teacherManagementLink;
    @FindBy(xpath = "//a[.='Student Management']")
    public WebElement studentManagementLink;
    @FindBy(xpath = "//a[.='Contact Get All']")
    public WebElement contactGetAllLink;
    @FindBy(xpath = "//a[.='Logout']")
    public WebElement logOutLink;
    @FindBy(id = "controlled-tab-example-tab-educationTerm")
    public WebElement educationTerm;
    @FindBy(id = "controlled-tab-example-tab-lessonsList")
    public WebElement lessonsList;
    @FindBy(id = "lessonName")
    public WebElement lessonName;
    @FindBy(id = "compulsory")
    public WebElement compulsoryCheckBox;
    @FindBy(id = "creditScore")
    public WebElement creditScore;
    @FindBy(xpath = "(//button[.='Submit'])[2]")
    public WebElement AddLessonSubmitButton;
    @FindBy(id = "controlled-tab-example-tab-lessonProgram")
    public WebElement lessonProgram;
    @FindBy(id = "react-select-2-input")
    public WebElement chooseLessons;
    @FindBy(xpath = "//select[@id='day']")
    public WebElement chooseDay;
    @FindBy(id = "educationTermId")
    public WebElement eduTerm;
    @FindBy(id = "startTime")
    public WebElement startTime;
    @FindBy(id = "stopTime")
    public WebElement stopTime;
    @FindBy(xpath = "(//button[.='Submit'])[3]")
    public WebElement submitButton;
    @FindBy(id = "lessonProgramId")
    public WebElement chooseLessonCheckBox;
    @FindBy(id = "teacherId")
    public WebElement chooseTeacher;
    @FindBy(xpath = "(//button[.='Submit'])[4]")
    public WebElement teacherAssignmentSubmitButton;




}
