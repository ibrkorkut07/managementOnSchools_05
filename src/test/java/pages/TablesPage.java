package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class TablesPage {

    public TablesPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//table//tbody//tr//td[5]")
    public static List<WebElement> UsernameList;
    @FindBy(xpath = "//tr//td[1]")
    public static List<WebElement> studentNameList;


}
