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
}
