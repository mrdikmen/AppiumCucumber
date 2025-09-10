
package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.AileButcemPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ResuableMethods;

public class AileButcemStepDef {
    AileButcemPage page=new AileButcemPage();

    @Given("Ilk ekran ayarlarini yapin ve ardindan login sayfasina ulasin")
    public void ilk_ekran_ayarlarini_yapin_ve_ardindan_login_sayfasina_ulasin() {
        for (int i = 0; i < 8; i++) {
            ResuableMethods.ekranKaydirmaMethodu(900,1400,900,130,1400);
        }
        ResuableMethods.scrollWithUiScrollableAndClick("Giriş Yap");

    }

    @When("{string} ve {string} bilgilerini girerek kullanici bilgileriyle {string}")
    public void ve_bilgilerini_girerek_kullanici_bilgileriyle(String Mail, String password, String girisyap) throws InterruptedException {
        Thread.sleep(3000);
        page.emailBox.sendKeys(ConfigReader.getProperty(Mail));
        Thread.sleep(3000);
        page.passwordBox.sendKeys(ConfigReader.getProperty(password));
        Thread.sleep(3000);
        //page.girisYap.click();
        ResuableMethods.scrollWithUiScrollableAndClick("Giriş Yap");


    }
    @Then("Uygulamaya kullanici bilgileriyle giris yapildigini dogrulayin")
    public void uygulamaya_kullanici_bilgileriyle_giris_yapildigini_dogrulayin() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(page.basariliGirisYazisi.isDisplayed());

    }
    @Then("Sol kisimdaki menuden {string} bolumune gidin")
    public void sol_kisimdaki_menuden_bolumune_gidin(String acilacakBolum) throws InterruptedException {
        Thread.sleep(4000);
        page.MenuButon.click();
        Thread.sleep(2000);
        ResuableMethods.scrollWithUiScrollableAndClick(acilacakBolum);
        //ResuableMethods.scrollWithUiScrollableAndClick("Hesabım");
    }
    @Then("Uygulamayi kapatin")
    public void uygulamayi_kapatin() {
        Driver.quitAppiumDriver();

    }
}
