package stepdefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.WebElement;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

public class US_01_UI_ChosenLessonListStepDefs {

    @Given("kullanici {string} sayfasina gider")
    public void kullaniciSayfasinaGider(String istenenUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(istenenUrl));
    }

    @Given("{string}, sutunundaki tum degerleri yazdirir")
    public void sutunundaki_tum_degerleri_yazdirir(String istenenBaslikStr) {

        //demoGuruPage.cookiesKabulEtButonu.click();



        List<WebElement> baslikWebelementListesi= demoGuruPage.baslikWebelementListesi;

        List<String> baslikStringListesi= ReusableMethods.getElementsText(baslikWebelementListesi);

        int istenenSutunIndexi=baslikStringListesi.indexOf(istenenBaslikStr);

        //     //tbody//tr//td[3]

        List<WebElement> istenenSutunWebelementListesi= demoGuruPage.sutunListesiGetir(istenenSutunIndexi);

        List<String> istenenSutunStrList = ReusableMethods.getElementsText(istenenSutunWebelementListesi);

        System.out.println(istenenBaslikStr +" Sutunundaki elementler \n"+istenenSutunStrList);



    }
}
