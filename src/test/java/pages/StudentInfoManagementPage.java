package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class StudentInfoManagementPage {

    public StudentInfoManagementPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//button[.='Login']")
    public WebElement loginButton;

    @FindBy(xpath = "//a[text()='Student Info Management']")
    public WebElement studentInfoManagementLink;

    @FindBy(xpath = "//input[@id='absentee']")    //(//input[@id='absentee'])[2]
    public WebElement absenteeLink;
    @FindBy(xpath = "//input[@id='midtermExam']")
    public WebElement midtermExam;
    @FindBy(xpath = "//input[@id='finalExam']")
    public WebElement finalExam;

    @FindBy(xpath = "//input[@id='infoNote']")
    public WebElement infoNote;

    @FindBy(xpath = "(//select[@id='lessonId'])[2]")
    public WebElement chooseLesson;

    @FindBy(xpath = "//select[@id='studentId']")
    public WebElement chooseStudent;

    @FindBy(xpath = "(//select[@id='educationTermId'])[2]")
    public WebElement chooseEducationTerm;

    @FindBy(xpath = "//button[.='Login']")
    public WebElement loginAsTeacher;

    @FindBy(className = "btn-outline-info")
    public WebElement editLink;

    @FindBy(xpath = "(//button[text()='Submit'])[2]")
    public WebElement submitButtonForEditStudentInfo;

    @FindBy(xpath = "(//i[@class='fa-trash'])[6]")
    public WebElement deleteButton;

    @FindBy(xpath = "//div[@class='table-responsive']")
    public WebElement studentInfoTable;

    @FindBy(xpath = "//table//tbody//tr//td[5]")
    public static List<WebElement> UsernameList;

    @FindBy(xpath = "//tr//td[1]")
    public static List<WebElement> studentNameList;

    @FindBy(xpath = "(//button[@class='btn btn-danger'])[7]")
    public WebElement dustbin;





    @FindBy(xpath = "(//div[@class='card-body'])[2]") //for make scroll down
    public WebElement studentInfoList;



    @FindBy(id = "username")
    public WebElement username;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(xpath = "//button[@class='fw-semibold btn btn-primary']")
    public WebElement login;

    @FindBy(xpath = "//*[text()='Menu']")
    public WebElement menu;

    @FindBy(xpath = "//a[text()='Student Info Management']")
    public WebElement studentInfoManagement;

    @FindBy(xpath = "//*[@class='fw-bold p-3 card-header']")
    public WebElement addInfoManagementText;
    @FindBy(id = "absentee")
    public WebElement absentee;
    @FindBy(xpath = "//*[@class='fw-semibold btn btn-primary btn-lg']")
    public WebElement submitButton;

    @FindBy(xpath = "(//*[@class='form-select'])[4]")
    public WebElement selectLesson;

    @FindBy(xpath = "(//*[@class='form-select'])[5]")
    public WebElement educationTerm;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[4]")
    public WebElement infoNoteRequiredText;

    @FindBy(xpath = "//*[text()='Student Info updated Successfully']")
    public WebElement successfullymessage;


}
