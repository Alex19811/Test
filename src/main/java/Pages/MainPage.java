package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


public class MainPage extends BasePage {

    private static By newSelerText = By.xpath("/html/body//nav/ul[@class='clearix']//a[@href='https://eva.ua/brands/']");
    private static By personalCare = By.xpath("//body//nav/ul[@class='clearix']/li[2]/a[@href='https://eva.ua/024/uhod-soboj/']/span[.='УХОД ЗА СОБОЙ']");

    //переход на Бытовая химия
    private static By householdСhemicals = By.xpath("//body[@class='cms- cmsadvanced-cmsadvanced-index page-layout-']//nav/ul[@class='clearix']/li[6]/a[@href='https://eva.ua/220/bytovaja-himija/']/span[.='БЫТОВАЯ ХИМИЯ']");
//    private static By SelectLanguage = By.id("select-language");


    public MainPage() {
       Assert.assertEquals(getDriver().findElement(newSelerText).getText(), "БРЕНДЫ");
    }

    //нажать на кнопку "Уход за собой"
    public PersonalCarePage clickPersonalCare() {
        getDriver().findElement(personalCare).click();
        return new PersonalCarePage();
    }

    //нажать на кнопку "Бытовая химия"
    public HouseholdСhemicalsPage clickHouseholdСhemicals() {
        getDriver().findElement(householdСhemicals).click();
        return new HouseholdСhemicalsPage();
    }

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



