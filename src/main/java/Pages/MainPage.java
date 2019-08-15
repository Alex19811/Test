package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


public class MainPage extends BasePage {

    private static By newSelerText = By.xpath("/html/body//nav/ul[@class='clearix']//a[@href='https://eva.ua/brands/']");

    private static By personalCare = By.xpath("//body//nav/ul[@class='clearix']/li[2]/a[@href='https://eva.ua/024/uhod-soboj/']/span[.='УХОД ЗА СОБОЙ']");
    //private static By bathAndShower = By.xpath("/html//main[@id='maincontent']//div[@class='category-promo-column']/ul//a[@href='https://eva.ua/024-282/dlja-vanny-dusha/']");
    private static By hairCare = By.xpath("/html//main[@id='maincontent']//div[@class='category-promo-column']/ul//a[@href='https://eva.ua/024-104/uhod-volosami/']");
    //переход на Бытовая химия
    private static By householdСhemicals = By.xpath("//body[@class='cms- cmsadvanced-cmsadvanced-index page-layout-']//nav/ul[@class='clearix']/li[6]/a[@href='https://eva.ua/220/bytovaja-himija/']/span[.='БЫТОВАЯ ХИМИЯ']");


//    private static By SelectLanguage = By.id("select-language");
//    private static By goToHomeDecor = By.xpath("//a[contains(@class,'level0') and text()='Home & Decor']");
//    //private static By goToHomeDecor = By.xpath("//html[@id='top']//nav[@id='nav']//li[@class='level0 nav-4 parent']/a[@href='http://magento.mainacad.com/lesson_12/home-decor.html']");
//    private static By accountButton = By.xpath("//a[@href='#header-account']/span[@class='label']");
//    private static By loginInput = By.xpath("//div[@id='header-account']//a[@title='Log In']");
//    private static By goToSale = By.xpath("//a[@href='http://magento.mainacad.com/lesson_12/sale.html']");


    public MainPage() {
       Assert.assertEquals(getDriver().findElement(newSelerText).getText(), "БРЕНДЫ");
    }

    public PersonalCarePage clickPersonalCare() {
        getDriver().findElement(personalCare).click();
        return new PersonalCarePage();
    }




//    public BathAndShowerPage clickBathAndShowerPage() {
//        getDriver().findElement(bathAndShower).click();
//        return new BathAndShowerPage();
//    }
    public HairCarePage clickHairCare() {
        getDriver().findElement(hairCare).click();
        return new HairCarePage();
    }

    public HouseholdСhemicalsPage clickHouseholdСhemicals() {
        getDriver().findElement(householdСhemicals).click();
        return new HouseholdСhemicalsPage();
    }




    //public MainPage clickLanguageAutomation() {
//        getDriver().findElement(SelectLanguage);
////       Select sel = new Select(clickLanguageAutomation());
////        sel.selectByVisibleText("Automation");
////        return null;

        /*WebElement elementSpisok = driver.findElement(SelectLanguage);
        Select sel = new Select(elementSpisok);
        sel.selectByVisibleText("Automation");

        return this;
    }*/

//    public HomeAndDecorPage clickGoToHomeDecor() {
//        getDriver().findElement(goToHomeDecor).click();
//        return new HomeAndDecorPage();
//    }
//
//    public MainPage clickAccountButton() {
//        getDriver().findElement(accountButton).click();
//        return this;
//    }
//    public LogInPage clickLogIn() {
//        getDriver().findElement(loginInput).click();
//        return new LogInPage();
//    }
//
//    public SalePage clickGoToSale() {
//        getDriver().findElement(goToSale).click();
//        return new SalePage();
//    }



    }

