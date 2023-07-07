package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

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




}
