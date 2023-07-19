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








}
