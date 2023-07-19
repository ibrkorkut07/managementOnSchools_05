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

    @FindBy(xpath = "//div[contains(text(),'Created Lesson Program')]")
    public WebElement createdLessonProgramAlert;
    @FindBy(xpath = "//div[contains(text(),'Full authentication is required to access this resource')]")
    public WebElement fullAuthenticationErrorAlert;
    @FindBy(xpath = "//div[.='lessons not must empty']")
    public WebElement lessonEmptyAlert;
    @FindBy(xpath = "//div[.='Please select education term']")
    public WebElement educationTermAlert;
    @FindBy(xpath = "//div[contains(text(),'You have entered an invalid value')]")
    public WebElement dayAlert;
    @FindBy(xpath = "//div[.='Required']")
    public WebElement requiredMessage;
    @FindBy(xpath = "//div[contains(text(),'Error: start time must not be greater than or equal to stop time')]")
    public WebElement startTimeStopTimeAlert;

    @FindBy(xpath = "//input[@id='lessonProgramId' and @value='198']")
    public WebElement lessonMondayJava;

    @FindBy(xpath = "//div[contains(text(),'Lesson added to Teacher')]")
    public WebElement lessonAddedTeacher;

    @FindBy(id = "lessonProgramId")
    public WebElement lessonProgramId;

    @FindBy(xpath = " (//*[text()='Submit'])[4]")
    public WebElement submitButtonTeacherAssignment;

    @FindBy(xpath = "//div[@class=' css-1xc3v61-indicatorContainer']")
    public WebElement addTeacherChooseLesson;

    @FindBy(id = "name")
    public WebElement addTeacherNameBox;

    @FindBy(id = "surname")
    public WebElement addTeacherSurnameBox;

    @FindBy(id = "birthPlace")
    public WebElement addTeacherBirthPlaceBox;

    @FindBy(id = "email")
    public WebElement addTeacherEmailbox;

    @FindBy(id = "phoneNumber")
    public WebElement addTeacherPhoneNumberBox;

    @FindBy(xpath = "//input[@value='FEMALE']")
    public WebElement addTeacherGenderFemale;

    @FindBy(id = "birthDay")
    public WebElement addTeacherBirthdayBox;

    @FindBy(id = "ssn")
    public WebElement ssnBox;

    @FindBy(id = "username")
    public WebElement usernameBox;

    @FindBy(id = "password")
    public WebElement passwordBox;

    @FindBy(xpath = "//button[text()='Submit']")
    public WebElement addTeacherSubmitButton;

    @FindBy(xpath = "//div[@class='Toastify__toast-body']")
    public WebElement alertChooseLesson;

    @FindBy(xpath = "//div[text()='Teacher saved successfully']")
    public WebElement SuccessfullSaving;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[1]")
    public WebElement RequiredTextforName;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[2]")
    public WebElement RequiredTextforSurname;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[3]")
    public WebElement RequiredTextforBirthPlace;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[4]")
    public WebElement RequiredTextforEmail;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[5]")
    public WebElement RequiredTextforPhoneNumber;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[5]")
    public WebElement MinimumCharacterTextforPhoneNumber;

    @FindBy(id = "isAdvisorTeacher")
    public WebElement isAdvisorTeacherCheckBox;

    @FindBy(xpath = "//input[@value='MALE']")
    public WebElement genderMale;

    @FindBy(xpath = "//div[text()='Required']")
    public WebElement textofRequired;

    @FindBy(xpath = "//div[text()='Minimum 11 character (XXX-XX-XXXX)']")
    public WebElement textofMinChar;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[6]")
    public WebElement RequiredTextforDateofBirth;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[7]")
    public WebElement RequiredTextforSsn;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[8]")
    public WebElement RequiredTextforUsername;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[9]")
    public WebElement RequiredTextforPassword;

    @FindBy(xpath = "//*[text()='Minimum 8 character']")
    public WebElement PasswordAlert;

    @FindBy(xpath = "//input[@role='combobox']")
    public WebElement addTeacherSelectLesson;

    @FindBy(xpath = "//button[.='Yes']")
    public WebElement yesButton;
    @FindBy(xpath = "//button[.='Login']")
    public WebElement loginButton;
    @FindBy(id = "advisorTeacherId")
    public WebElement advisorTeacherButton;
    @FindBy(id = "fatherName")
    public WebElement fatherName;
    @FindBy(id = "motherName")
    public WebElement motherName;
    @FindBy(xpath = "//div[.='Student saved Successfully']")
    public WebElement studentSavedMessage;
    //    @FindBy(xpath = "//span[.='»']")
//    public WebElement lastPageImage;
    @FindBy(xpath = "(//ul//span[@aria-hidden='true'])[4]")
    public WebElement lastPageImage;

    //    @FindBy(xpath = "//table//tbody//tr//td[5]")
//    public WebElement userNameTable;
    @FindBy(xpath = "//button[.='Submit']")
    public WebElement addStudentSubmitButton;

    @FindBy(partialLinkText = "Login")
    public WebElement homeLoginLink;
    @FindBy(xpath = "//div[.='Please select advisor teacher']")
    public WebElement advisorTeacherError;
    @FindBy(xpath = "//div[.='You have entered an invalid value. Valid values are: MALE, FEMALE']")
    public WebElement invalidValueError;
    @FindBy(xpath = "(//div[.='Error: User with ssn 123-45-6789 already register'])[2]")
    public WebElement registeredSsnError;
    @FindBy(xpath = "//div[.='Please enter valid SSN number']")
    public WebElement validSsnError;
    @FindBy(xpath = "//div[.='Error: User with username sdfsd already register']")
    public WebElement existUserNameError;
    @FindBy(xpath = "//div[@role='alert']")
    public WebElement jsonalert;
    @FindBy(xpath = "//div[.='must be a past date']")
    public WebElement futureBirthDayError;
    @FindBy(xpath = "//div[.='Please enter valid email']")
    public WebElement validEmailError;
    @FindBy(xpath = "//*[contains(text(),'JSON parse error')]")
    public WebElement jsonParseError;
    @FindBy(xpath = "//*[@fill='currentColor']")
    public WebElement alertImage;

    @FindBy(xpath = "//div[contains(text(),'You have entered invalid value.')]")
    public WebElement errorMessageForGender;












}