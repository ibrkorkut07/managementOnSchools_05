package pages.us14;

import io.cucumber.java.zh_cn.假如;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US14ViceDeanHomePage {
    public US14ViceDeanHomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//h3[@class='fw-bold p-3 card-header'])[1]")
    public WebElement actualEducationTermManagementTitle;

    @FindBy(xpath = "//button[@class='fw-semibold text-white bg-primary navbar-toggler collapsed']")
    public WebElement menuButton3;

    @FindBy(xpath = "(//a[@class='nav-link'])[7]")
    public WebElement teacherManagementOption;


    @FindBy(xpath = "//h3[@class='fw-bold p-3 card-header']")
    public WebElement actualTeacherManagementTitle;

    @FindBy(xpath = "(//a[@class='nav-link'])[9]")
    public WebElement contactGetAllOption;

    @FindBy (xpath = "//h5[@class='fw-bold p-3 card-header']")
    public WebElement actualContactMessageTitle;

    @FindBy (xpath = "//h5[@class='fw-bold p-3 card-header']")
    public WebElement actualContactMessagepage;

    @FindBy (xpath = "/html/body/div/div/main/div/div/div/div/div/div[1]/table/thead/tr/th[1]")
    public WebElement actualAuthorName;

    @FindBy (xpath = "/html/body/div/div/main/div/div/div/div/div/div[1]/table/thead/tr/th[2]")
    public WebElement actualAuthorEmail;

    @FindBy (xpath = "/html/body/div/div/main/div/div/div/div/div/div[1]/table/thead/tr/th[3]")
    public WebElement actualSentEmailDate;

    @FindBy (xpath = "/html/body/div/div/main/div/div/div/div/div/div[1]/table/thead/tr/th[4]")
    public WebElement actualSentSubject;

    @FindBy (xpath = "/html/body/div/div/main/div/div/div/div/div/div[1]/table/thead/tr/th[5]")
    public WebElement actualSentMessage;

    @FindBy (xpath = "//*[@id=\"controlled-tab-example-tabpane-teachersList\"]/div[3]/div/div/div[2]/div[2]/ul/li[5]/a")
    public WebElement nextOption;

    @FindBy (xpath = "(//button[@class='text-dark btn btn-outline-info'])[4]")
    public WebElement edithButton;

    @FindBy (xpath = "(//div[@class=' css-1xc3v61-indicatorContainer'])[2]")
    public WebElement lessonList;

    @FindBy(xpath = "(//div[@class=' css-19bb58m'])[2]")
    public WebElement selectlesson;

   @FindBy (xpath = "//div//div[@class=' css-9jq23d']")
    public WebElement programLesson;

    @FindBy (xpath = "(//input[@class='form-control'])[10]")
    public WebElement edithName;

    @FindBy (xpath = "(//input[@class='form-control'])[11]")
    public WebElement edithSurName;

    @FindBy (xpath = "(//input[@class='form-check-input'])[5]")
    public WebElement femaleOption;

    @FindBy (xpath = "//input[@class='form-control is-invalid']")
    public WebElement password2;

    @FindBy (xpath = "(//button[@class='fw-semibold btn btn-primary btn-lg'])[2]")
    public WebElement submitButon2;

    @FindBy (xpath = "(//button[@class='btn-close'])[3]")
    public WebElement closeSign;



}
