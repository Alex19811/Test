package PerlinkaPages;

import Pages.BasePage;
import Pages.HouseholdСhemicalsPage;
import Pages.PersonalCarePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


public class MainPage extends BasePage {

    // private static By newSelerText = By.xpath("/html/body//nav/ul[@class='clearix']//a[@href='https://eva.ua/brands/']");
    // private static By newSelerText = By.xpath("//a[@class='top-level-a' and text()='Бренды']");

    private static By forBoySpisok = By.xpath("//?/a[@innertext='ДЛЯ МАЛЬЧИКА']");

//вспливаюче вікно
//private static By closeWindow = By.xpath("//a[contains(@class,'btn-location-close js-hide-location')]");

    //переход на Бытовая химия
    //  private static By householdСhemicals = By.xpath("//a[@class='top-level-a']//span[text()='БЫТОВАЯ ХИМИЯ']");
//    private static By SelectLanguage = By.id("select-language");


    //вспливаюче вікно
//    public MainPage clickCloseWindow() {
//        getDriver().findElement(closeWindow).click();
//        return this;
//    }

    //public MainPage() {
      //  Assert.assertEquals(getDriver().findElement(newSelerText).getText(), "БРЕНДЫ");
    //}

    //нажать на кнопку "Для мальчиков"
   /* public PersonalCarePage clickForBoy() {
        getDriver().findElement(forBoy).click();
        return new PersonalCarePage();
    }*/


    public ForBoyPage clickForBoy() {
        WebElement forBoy = driver.findElement(forBoySpisok);
        Select sel = new Select(forBoy);
        sel.selectByVisibleText("Обувь");
        return new ForBoyPage();
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



