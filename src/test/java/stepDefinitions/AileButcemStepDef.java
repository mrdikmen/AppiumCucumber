package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.AileButcePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ResuableMethods;

public class AileButcemStepDef {

    AileButcePage page=new AileButcePage();

    @Given("Ilk ekran ayarlarini yapin ve ardindan login sayfasina ulasin")
    public void ılk_ekran_ayarlarini_yapin_ve_ardindan_login_sayfasina_ulasin() {


        for (int i = 0; i < 8; i++) {
            ResuableMethods.ekranKaydirmaMethodu(930,1124,800,200,1124);
        }

        ResuableMethods.scrollWithUiScrollableAndClick("Giris Yap");
    }

    @When("{string} ve {string} bilgilerini girerek kullanici bilgileriyle {string}")
    public void ve_bilgilerini_girerek_kullanici_bilgileriyle(String mail, String password, String girisyap) throws InterruptedException {
        Thread.sleep(2000);
    page.emailBox.sendKeys(ConfigReader.getProperty(mail));
        Thread.sleep(2000);
    page.passwordBox.sendKeys(ConfigReader.getProperty(password));
    page.girisYap.click();
    }

    @Then("Uygulamaya kullanici bilgileriyle giris yapildigini dogrulayin")
    public void uygulamaya_kullanici_bilgileriyle_giris_yapildigini_dogrulayin() throws InterruptedException {

        Thread.sleep(2000);

        Assert.assertTrue(page.basariliGirisYazisi.isDisplayed());
    }

    @Then("Sol kisimdaki menuden {string} bolumune gidin")
    public void sol_kisimdaki_menuden_bolumune_gidin(String string) {

    }

    @Then("Uygulamayi kapatin")
    public void uygulamayi_kapatin() {
        Driver.quitAppiumDriver();
    }
}
