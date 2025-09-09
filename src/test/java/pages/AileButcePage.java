package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.FieldDecorator;
import utilities.Driver;

import javax.xml.xpath.XPath;
import java.time.Duration;

public class AileButcePage {

    public AileButcePage(){

        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAndroidDriver(),Duration.ofSeconds(15)),this);
    }


    @FindBy (xpath = "//*[@text='E-mail Adresi']")
    public MobileElement emailBox;

    @FindBy (xpath = "//*[@text='Şifre']")
    public MobileElement passwordBox;

    @FindBy (xpath = "//*[@text=\"Giriş Yap\"]")
    public MobileElement girisYap;

    @FindBy(xpath = "//*[@text='Başarıyla giriş yapıldı.']")
    public  MobileElement basariliGirisYazisi;

    @FindBy(xpath = "(//*[@class='android.widget.ImageView'])[1]")
    public  MobileElement MenuButon;




}


