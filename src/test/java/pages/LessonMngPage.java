package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class LessonMngPage {

    public LessonMngPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    /*  -- sample --
    @FindBy(partialLinkText = "Login")
    public WebElement homeLoginLink;
     */
    @FindBy(id = "controlled-tab-example-tab-lessonsList")
    public WebElement lessonButton;
    @FindBy(id = "lessonName")
    public WebElement lessonNameInput;
    @FindBy(id = "creditScore")
    public WebElement creditScoreInput;
    @FindBy(id = "compulsory")
    public WebElement compulsoryCheck;
    @FindBy(xpath = "//*[@id=\"controlled-tab-example-tabpane-lessonsList\"]/div[2]/div[1]/div/div/form/div/div[4]/div/button")
    public WebElement lessonSubmitButton;

    @FindBy(xpath = "(//tbody[@class='table-group-divider'])[2]/tr/td[1]")
    public List<WebElement> allLessonNames;

    @FindBy(xpath = "(//tbody[@class='table-group-divider'])[2]/tr/td[2]")
    public List<WebElement> allCompulsories;

    @FindBy(xpath = "(//tbody[@class='table-group-divider'])[2]/tr/td[3]")
    public List<WebElement> allCreditScoreNames;


    @FindBy(id = "lessonName")
    public WebElement lessonNameButton;

    @FindBy(xpath = "//*[@id=\"controlled-tab-example-tabpane-lessonsList\"]/div[2]/div[2]/div/table/tbody")
    public WebElement lessonCompulsoryCreditScore;
    @FindBy(xpath = "(//li/a/span[@class='visually-hidden' and text()='Last'])[2]")
    public WebElement nextButton;

    @FindBy(xpath = "(//button[@class='btn btn-danger'])[last()]")
    public WebElement deleteLastCreatedLesson;

    @FindBy(xpath = "((//tbody[@class='table-group-divider'])[2]/tr/td[1])[last()]")
    public WebElement lastCreatedLesson;
    @FindBy(xpath = "//div[contains(text(),'JSON parse error: Cannot deserialize value of type')]")
    public WebElement invalidCreditScore;
    @FindBy(xpath = "//div[@class='mb-4 form-floating']//div[@class='invalid-feedback'][normalize-space()='Required']")
    public WebElement nullOfLessonName;
    @FindBy(xpath = "//*[@id=\"controlled-tab-example-tabpane-lessonsList\"]/div[2]/div[1]/div/div/form/div/div[3]/div/div")
    public WebElement nullOfCreditScore;
    @FindBy(xpath = "//div[contains(text(),'Lesson Created')]")
    public WebElement createdLessonAlert;
    @FindBy(xpath = "//div[contains(text(),'already reg')]")
    public WebElement dublicatedLessonName;
}




