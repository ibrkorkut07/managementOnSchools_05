package pages.us14;

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



}
