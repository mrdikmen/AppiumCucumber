
package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.FieldDecorator;
import utilities.Driver;

import java.time.Duration;

public class AileButcemPage {
    public AileButcemPage(){
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAndroidDriver(),Duration.ofSeconds(15)),this);
    }

    @FindBy(xpath = "(//*[@class='android.widget.EditText'])[1]")
    public MobileElement emailBox;

    @FindBy(xpath = "(//*[@class='android.widget.EditText'])[2]")
    public MobileElement passwordBox;

    @FindBy(xpath = "(//*[@class='android.widget.TextView'])[2]")
    public MobileElement GirisYapButon;

    //ikisi ayni element locate i

    @FindBy (xpath = "//*[@text=\"Giriş Yap\"]")
    public MobileElement girisYap;

    @FindBy(xpath = "//*[@text='Başarıyla giriş yapıldı.']")
    public  MobileElement basariliGirisYazisi;

    @FindBy(xpath = "(//*[@class='android.widget.ImageView'])[1]")
    public  MobileElement MenuButon;


}
